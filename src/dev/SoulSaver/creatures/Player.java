package dev.SoulSaver.creatures;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.states.GameOverState;
import dev.SoulSaver.states.PauseState;
import dev.SoulSaver.states.State;
import dev.SoulSaver.utils.Timer;

public class Player extends Creature {
	// Animation
	private Animation animDown, animUp, animLeft, animRight, falling;

	private BufferedImage attackUp, attackDown, attackLeft, attackRight;
	private Timer timer;

	public Boolean interact, pressed, damage;
	public Boolean attack, set, start, hit, notRunning, changed, pushed;

	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT,
				handler.getGame().getHealthBar().getCurHealth());

		bounds.x = 20;
		bounds.y = 35;
		bounds.width = 26;
		bounds.height = 28;
		hit = false;
		
		interact = false;
		up = false;
		down = true;
		left = false;
		right = false;
		attack = false;
		set = true;
		start = true;
		damage = false;
		notRunning = true;
		pushed = false;
		changed = false;
		timer = new Timer();

		setAnimation();

	}
	
	/**
	 * If the players health is 0 it dies.
	 */
	
	public void isDead(){
		if(handler.getHealthBar().getCurHealth() <= 0){
			State.setState(new GameOverState(handler));;
		}
	}

	/**
	 * When called it decreases the players health.
	 */
	public void hurt() {
		damage = true;
		handler.getGame().getHealthBar().decHealth();
		JukeBox.play("Hurt");
	}
	
	/**
	 * Set the animations depending on the character selected at the start
	 */

	public void setAnimation() {
		if (handler.getGame().isMale1()) {
			animDown = new Animation(300, Assets.player_downM1);
			animUp = new Animation(300, Assets.player_upM1);
			animLeft = new Animation(300, Assets.player_leftM1);
			animRight = new Animation(300, Assets.player_rightM1);
			falling = new Animation(360, Assets.fallM1);
			attackDown = Assets.attack_downM1;
			attackLeft = Assets.attack_leftM1;
			attackRight = Assets.attack_rightM1;
			attackUp = Assets.attack_upM1;

		} else if (handler.getGame().isMale2()) {
			animDown = new Animation(300, Assets.player_downTessema);
			animUp = new Animation(300, Assets.player_upTessema);
			animLeft = new Animation(300, Assets.player_leftTessema);
			animRight = new Animation(300, Assets.player_rightTessema);
			falling = new Animation(300, Assets.fallTessema);
			attackDown = Assets.attack_downTessema;
			attackLeft = Assets.attack_leftTessema;
			attackRight = Assets.attack_rightTessema;
			attackUp = Assets.attack_upTessema;

		} else if (handler.getGame().isFemale1()) {
			animDown = new Animation(300, Assets.player_downF1);
			animUp = new Animation(300, Assets.player_upF1);
			animLeft = new Animation(300, Assets.player_leftF1);
			animRight = new Animation(300, Assets.player_rightF1);
			falling = new Animation(300, Assets.fallF1);
			attackDown = Assets.attack_downF1;
			attackLeft = Assets.attack_leftF1;
			attackRight = Assets.attack_rightF1;
			attackUp = Assets.attack_upF1;

		} else if (handler.getGame().isFemale2()) {
			animDown = new Animation(300, Assets.player_downF2);
			animUp = new Animation(300, Assets.player_upF2);
			animLeft = new Animation(300, Assets.player_leftF2);
			animRight = new Animation(300, Assets.player_rightF2);
			falling = new Animation(300, Assets.fallF2);
			attackDown = Assets.attack_downF2;
			attackLeft = Assets.attack_leftF2;
			attackRight = Assets.attack_rightF2;
			attackUp = Assets.attack_upF2;

		}
	}
	
	public void soulHeart(){
		if(handler.getInventory().getSouls() == 10 * handler.getInventory().getI()){
			handler.getHealthBar().inCurHealth();
			handler.getHealthBar().incTotHealth();
			handler.getInventory().setI(handler.getInventory().getI()+1);
		}
	}
	


	@Override
	public void tick() {
		// Animations
		animDown.tick();
		animUp.tick();
		animRight.tick();
		animLeft.tick();
		falling.tick();
		handler.getHealthBar().tick();
		soulHeart();

		getInput();
		move();
		isDead();

		pause();
		handler.getGameCamera().centerOnEntity(this);
	}
	
	/**
	 * If P is pressed it paused the game.
	 */

	public void pause() {
		if (handler.getKeyManager().pause && timer.run(.5f)) {
			((PauseState) handler.getPauseState()).getTimer().Start();
			((PauseState) handler.getPauseState()).setSlot(false);
			JukeBox.play("PauseOpen");
			handler.getGame().setPaused(true);
		}
	}

	public Timer getTimer() {
		return timer;
	}

	public void setInteract(Boolean b) {
		interact = b;
	}

	public void setPressed(Boolean b) {
		pressed = b;
	}

	public boolean getFall() {
		return fall;
	}

	public boolean getSlide() {
		return slide;
	}

	public void setPushed(boolean b) {
		pushed = b;
	}

	private void getInput() {
		if (!pushed) {
			xMove = 0;
			yMove = 0;
		}

		if (handler.getKeyManager().attack) {
			attack = true;
		} else {
			attack = false;
		}

		if (((attack && !handler.getWorld().getShield().isEquipped()) || fall) && !slide) {
			xMove = 0;
			yMove = 0;
		} else if (damage) {
			if (up) {
				yMove = speed * 10;
				damage = false;
			}
			if (down) {
				yMove = -speed * 10;
				damage = false;
			}
			if (left) {
				xMove = speed * 10;
				damage = false;
			}
			if (right) {
				xMove = -speed * 10;
				damage = false;
			}
		} else if (slide) {
			if (down) {
				yMove = speed * 2;
			}
			if (up) {
				yMove = -speed * 2;
			}
			if (right) {
				xMove = speed * 2;
			}
			if (left) {
				xMove = -speed * 2;
			}
		} else if (!pushed) {

			if (handler.getKeyManager().up) {
				yMove = -speed;
				setDirection();
				up = true;
			}
			if (handler.getKeyManager().down) {
				yMove = speed;
				setDirection();
				down = true;
			}
			if (handler.getKeyManager().left) {
				xMove = -speed;
				setDirection();
				left = true;
			}
			if (handler.getKeyManager().right) {
				xMove = speed;
				setDirection();
				right = true;
			}

			if (handler.getKeyManager().slot2 && timer.run(.5f)) {
				timer.Start();
				if (handler.getInventory().getPotions() > 0) {
					handler.getHealthBar().replenish(3);
					JukeBox.play("Potion");
					handler.getInventory().usePotion();
				}
			}
		}

	}

	@Override
	public void render(Graphics2D g) {
		handler.getHealthBar().render(g);

		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset() + w),
				(int) (y - handler.getGameCamera().getyOffset() + h), width, height, null);

		handler.getGame().getPrintScreen().render(g);
	}

	private BufferedImage getCurrentAnimationFrame() {
		BufferedImage image = null;

		if (fall) {
			if (setFrame) {
				falling.setIndex(0);
				setFrame = false;
			}
			image = falling.getCurrentFrame();
		} else if (slide && left) {
			image = animLeft.getImage(1);
		} else if (slide && right) {
			image = animRight.getImage(1);
		} else if (slide && up) {
			image = animUp.getImage(1);
		} else if (slide && down) {
			image = animDown.getImage(1);
		} else if (xMove < 0 && left && !attack) {
			image = animLeft.getCurrentFrame();
		} else if (xMove > 0 && right && !attack) {
			image = animRight.getCurrentFrame();
		} else if (yMove < 0 && up && !attack) {
			image = animUp.getCurrentFrame();
		} else if (yMove > 0 && down && !attack) {
			image = animDown.getCurrentFrame();
		} else if (down && attack && !slide && !fall) {
			image = attackDown;
		} else if (left && attack && !slide && !fall) {
			image = attackLeft;
		} else if (right && attack && !slide && !fall) {
			image = attackRight;
		} else if (up && attack && !slide && !fall) {
			image = attackUp;
		} else if (left) {
			image = animLeft.getImage(1);
		} else if (right) {
			image = animRight.getImage(1);
		} else if (up) {
			image = animUp.getImage(1);
		} else if (down) {
			image = animDown.getImage(1);
		}
		return image;
	}
}
