package dev.SoulSaver.creatures;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import dev.SoulSaver.Handler;
import dev.SoulSaver.Dialogues.Dialogue;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.utils.CreaturesUtil;
import dev.SoulSaver.utils.Timer;


/*
 * This class sets up the skeleton for all non-player characters.
 */
public abstract class NPC extends Creature {
	protected Entity target;
	protected float damping;
	protected Random rand;
	protected Boolean human, shouldSet, resting, speaking;
	protected Timer timer;
	protected String speak;
	protected int world, health;

	protected Animation animDown, animUp, animLeft, animRight;

	protected int startX, startY;

	protected float speedx, speedy, maxSpeed, minSpeed;

	public NPC(Handler handler, float x, float y, float damping, boolean human, int health) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT, health);
		target = null;
		this.damping = damping;
		this.human = human;

		shouldSet = true;
		resting = true;
		speaking = false;
		up = false;
		down = true;
		left = false;
		right = false;
		this.health = health;
		rand = new Random();
		startX = (int) x;
		startY = (int) y;

		timer = new Timer();

		setSpeed();
	}
	
	/**
	 * sets the creatures speed to the see speed times its damping.
	 */
	
	public void setSpeed(){
		maxSpeed = speed * damping;
		minSpeed = -speed * damping;
	}

	// Human and Monster
	
	/**
	 * Checks to see if the player is within a certain distance to the player. 
	 * If it is then it sets the player as the target.
	 */
	public void look() {
		if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32,
				y + 32) < 120)
			setTarget(EntityManager.getPlayer());
		else
			setTarget(null);
		xMove = 0;
		yMove = 0;
	}

	public void setTarget(Entity o) {
		target = o;
	}

	public Entity getTarget() {
		return target;
	}
	
	/**
	 * If there is no target then the creature looks for the target then idles.
	 * If there is a target the humans with stop and the monsters will chase.
	 */

	public void action() {
		if (target == null) {
			look();
			idle();
		} else {
			if (human) {
				speedx = 0;
				speedy = 0;
			} else {
				chase();
			}

		}
	}
	
	/**
	 * If the creature is a certain distance from the starting point then it returns.
	 * If it is not then the creature picks a random direction to move in.
	 */

	public void idle() {
		if (CreaturesUtil.dist(startX, startY, x, y) < 500) {
			if (!resting) {
				if (shouldSet) {
					speedx = rand.nextInt(3)-1;
					speedy = rand.nextInt(3)-1;
					shouldSet = false;
					timer.Start();
				} else if (timer.run(2)) {
					resting = true;
					shouldSet = true;
					timer.Start();
				}
			} else if (timer.run(5)) {
				speedx = 0;
				speedy = 0;
				resting = false;
			}
		} else {
			speedx = startX - x;
			speedy = startY - y;
		}
	}

	public void setDirection() {
		up = false;
		down = false;
		left = false;
		right = false;
	}

	public void walk() {
		if (speedx > maxSpeed)
			speedx = maxSpeed;
		if (speedx < minSpeed)
			speedx = minSpeed;

		if (speedy > maxSpeed)
			speedy = maxSpeed;
		if (speedy < minSpeed)
			speedy = minSpeed;

		xMove = xMove + speedx;
		yMove = yMove + speedy;

		if (xMove < 0) {
			setDirection();
			left = true;
		} else if (xMove > 0) {
			setDirection();
			right = true;
		} else if (yMove < 0) {
			setDirection();
			up = true;
		} else if (yMove > 0) {
			setDirection();
			down = true;
		}
	}

	// MonsterS
	
	/*
	 * If the creature has a target it chases the target.
	 */
	public void chase() {
		xMove = 0;
		yMove = 0;

		speedx = (getTarget().getX() - x);
		speedy = (getTarget().getY() - y);
	}
	
	//If the creature touches the player it will hurt the player

	public void attack() {
		if (this.getCollisionBounds(0f, 0f).intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle())
				&& timer.run(.7f)) {
			handler.getWorld().getEntityManager().getPlayer().hurt();
			timer.Start();
		}
	}
	
	//If called this hurts the creature. If the creature health is 0 or below it dies.
	
	public void damage() {
		if (timer.run(.5f)) {
			JukeBox.play("EHit");
			health -= 1;
			timer.Start();
		}
		
		if(health <=0){
			JukeBox.play("EDie");
			this.active = false;
		}
	}

	// Human
	public void Speak(int num) {
		if (this.getRectangle().intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle()) && handler.getKeyManager().interact) {
			handler.getGame().getPrintScreen().setDia2(num);
			handler.getGame().getPrintScreen().setPrint(true);
			handler.getGame().getPrintScreen().setDialogue(true);
			handler.getGame().getPrintScreen().getTimer().Start();
		}
	}

	public Boolean getSpeaking() {
		return speaking;
	}

	@Override
	public abstract void tick();

	public abstract void setAnimation(int world);

	@Override
	public abstract void render(Graphics2D g);
	
	
	/**
	 * gets the current Animation that is to be displayed.
	 * @return
	 */
	protected BufferedImage getCurrentAnimationFrame() {
		if (xMove < 0) {
			return animLeft.getCurrentFrame();
		} else if (xMove > 0) {
			return animRight.getCurrentFrame();
		} else if (yMove < 0) {
			return animUp.getCurrentFrame();
		} else {
			return animDown.getCurrentFrame();
		}
	}
}
