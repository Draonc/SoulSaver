package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;
import java.awt.Point;
import java.util.LinkedList;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.CreaturesUtil;

public class Souls extends NPC {
	private boolean passive, agressive, runner;
	private int id;

	private LinkedList<Point> ship1;
	private LinkedList<Point> mansion1;

	public Souls(Handler handler, float x, float y, int num, int world, int id) {
		super(handler, x, y, .75f, false, 8);
		this.id = id;
		
		setType(num);
		setAnimation(0);
		checkCollected();
	}
	
	public void checkCollected(){
		if(handler.getInventory().isCollected(id))
			active = false;
	}

	public void setType(int num) {
		passive = false;
		agressive = false;
		runner = false;
		if (num == 1) {
			passive = true;
		}
		if (num == 2) {
			agressive = true;
		}
		if (num == 3) {
			runner = false;
		}
	}

	

	public void run() {
		if (runner) {
			if (CreaturesUtil.dist(x, y, handler.getWorld().getEntityManager().getPlayer().getX(),
					handler.getWorld().getEntityManager().getPlayer().getY()) < 500) {
				// x = linked list. next. getfirst - x;
				// y = linked list.nex.getsecond - y;
			}
		}
	}

	public void collect() {
		if (passive || (agressive && this.health <= 1)) {
			if (this.getCollisionBounds(0f, 0f)
					.intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle())) {
				handler.getInventory().addSoul();
				handler.getInventory().setSoul(id, true);
				JukeBox.play("Soul");
				active = false;
			}
		}
	}

	@Override
	public void tick() {
		animUp.tick();
		animDown.tick();
		animLeft.tick();
		animRight.tick();

		if (runner) {
			move();
			collect();
		}

		if (passive) {
			collect();

		}

		if (agressive) {
			collect();
			move();
			look();
			action();
			attack();
			walk();
		}
	}

	@Override
	public void setAnimation(int world) {
		if (passive) {
			animUp = new Animation(500, Assets.passSoul_up);
			animDown = new Animation(500, Assets.passSoul_down);
			animLeft = new Animation(500, Assets.passSoul_left);
			animRight = new Animation(500, Assets.passSoul_right);
		} else if (agressive) {
			animUp = new Animation(500, Assets.attackSoul_up);
			animDown = new Animation(500, Assets.attackSoul_down);
			animLeft = new Animation(500, Assets.attackSoul_left);
			animRight = new Animation(500, Assets.attackSoul_right);
		} else if (runner) {
			animUp = new Animation(500, Assets.runSoul_up);
			animDown = new Animation(500, Assets.runSoul_down);
			animLeft = new Animation(500, Assets.runSoul_left);
			animRight = new Animation(500, Assets.runSoul_right);
		}
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
