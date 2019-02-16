package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.CreaturesUtil;
import dev.SoulSaver.worlds.World;

public class Leash extends NPC {

	public Leash(Handler handler, float x, float y, int world) {
		super(handler, x, y, .5f, false, 3);

		startX = (int) x;
		startY = (int) y;

		this.world = world;

		setAnimation(world);
	}

	public void leash() {
		if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, startX + 32,
				startY + 32) < 200) {
			setTarget(handler.getWorld().getEntityManager().getPlayer());
			damping = 1.3f;
			setSpeed();

		} else if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32,
				startX + 32, startY + 32) > 205) {
			damping = .5f;
			setSpeed();
			setTarget(null);
		}
	}

	public void chase() {
		if (target != null) {
			
			if (CreaturesUtil.dist(startX, startY, x, y) < 200) {
				speedx = (getTarget().getX() - x);
				speedy = (getTarget().getY() - y);
			} else if (CreaturesUtil.dist(startX, startY, x, y) >= 205) {
				speedx = 0;
				speedy = 0;
			}
		}else{
			if (CreaturesUtil.dist(startX, startY, x, y) > 200) {
				speedx = startX - x;
				speedy = startY - y;
			}
		}
	}

	@Override
	public void tick() {
		animDown.tick();
		animUp.tick();
		animRight.tick();
		animLeft.tick();

		look();
		action();
		attack();
		walk();
		move();
		leash();
		chase();
	}

	public void setAnimation(int world) {
		switch (world) {
		case 1:
			//Maze
			animDown = new Animation(500, Assets.rat_down);
			animUp = new Animation(500, Assets.rat_up);
			animLeft = new Animation(500, Assets.rat_left);
			animRight = new Animation(500, Assets.rat_right);
			break;
		case 2:
			//Fire-ice
			break;
		case 3:
			//Swamp
			animDown = new Animation(500, Assets.frog_down);
			animUp = new Animation(500, Assets.frog_up);
			animLeft = new Animation(500, Assets.frog_left);
			animRight = new Animation(500, Assets.frog_right);
			break;
		case 4:
			//Mansion
			animDown = new Animation(500, Assets.ghostDog_down);
			animUp = new Animation(500, Assets.ghostDog_up);
			animLeft = new Animation(500, Assets.ghostDog_left);
			animRight = new Animation(500, Assets.ghostDog_right);
			break;
		case 5:
			//Ship
			animDown = new Animation(500, Assets.snake_down);
			animUp = new Animation(500, Assets.snake_up);
			animLeft = new Animation(500, Assets.snake_left);
			animRight = new Animation(500, Assets.snake_right);
			break;
		case 6:
			//Dungeon
			animDown = new Animation(500, Assets.wolf_down);
			animUp = new Animation(500, Assets.wolf_up);
			animLeft = new Animation(500, Assets.wolf_left);
			animRight = new Animation(500, Assets.wolf_right);
			break;
		case 7:
			//Forest
			animDown = new Animation(500, Assets.plantDog_down);
			animUp = new Animation(500, Assets.plantDog_up);
			animLeft = new Animation(500, Assets.plantDog_left);
			animRight = new Animation(500, Assets.plantDog_right);
			break;
		case 8:
			//Sky
			animDown = new Animation(500, Assets.cloudDog_down);
			animUp = new Animation(500, Assets.cloudDog_up);
			animLeft = new Animation(500, Assets.cloudDog_left);
			animRight = new Animation(500, Assets.cloudDog_right);
			break;
		case 9:
			break;
		}
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}
}
