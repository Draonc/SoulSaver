package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.CreaturesUtil;

public class Archer extends NPC {
	private float pX, pY;

	public Archer(Handler handler, float x, float y, int world) {
		super(handler, x, y, .7f, false, 3);

		timer.Start();
		this.world = world;
		setAnimation(world);
		
		down=false;
		up=true;
	}

	@Override
	public void tick() {
		animUp.tick();
		animDown.tick();
		animLeft.tick();
		animRight.tick();

		look();
		action();
		attack();
		walk();
		move();
	}

	private void setProj() {
		if (left) {
			pX = this.x - DEFAULT_CREATURE_WIDTH + 15;
			pY = this.y + DEFAULT_CREATURE_HEIGHT;
		} else if (right) {
			pX = this.x + DEFAULT_CREATURE_WIDTH*2 - 15;
			pY = this.y;
		} else if (up) {
			pX = this.x-2;
			pY = this.y - DEFAULT_CREATURE_HEIGHT+20;
		} else {
			pX = this.x + DEFAULT_CREATURE_WIDTH+4;
			pY = this.y + DEFAULT_CREATURE_HEIGHT*2-15;
		}
	}
	
	public void range(){
		if(CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32,
				y + 32) > 100){
			xMove=0;
			yMove=0;
		}
	}

	@Override
	public void attack() {
		if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32,
				y + 32) < 500 && timer.run(1.0f)) {
			target = EntityManager.getPlayer();
			chase();
			range();
			setProj();
			handler.getWorld().getEntityManager().addEntity(new Projectile(handler, pX, pY, world, up, down, left, right, false));
			timer.Start();
		}
	}

	@Override
	public void setAnimation(int world) {
		switch (world) {
		case 1:
			//Maze
			animDown = new Animation(500, Assets.spider_down);
			animUp = new Animation(500, Assets.spider_up);
			animLeft = new Animation(500, Assets.spider_left);
			animRight = new Animation(500, Assets.spider_right);
			break;
		case 2:
			//Fire-ice
			animDown = new Animation(500, Assets.dragonA_down);
			animUp = new Animation(500, Assets.dragonA_up);
			animLeft = new Animation(500, Assets.dragonA_left);
			animRight = new Animation(500, Assets.dragonA_right);
			break;
		case 3:
			//Swamp
			animDown = new Animation(500, Assets.sludgeManA_down);
			animUp = new Animation(500, Assets.sludgeManA_up);
			animLeft = new Animation(500, Assets.sludgeManA_left);
			animRight = new Animation(500, Assets.sludgeManA_right);
			break;
		case 4:
			//Mansion
			break;
		case 5:
			//Ship
			animDown = new Animation(500, Assets.octopus_down);
			animUp = new Animation(500, Assets.octopus_up);
			animLeft = new Animation(500, Assets.octopus_left);
			animRight = new Animation(500, Assets.octopus_right);
			break;
		case 6:
			//Dungeon
			animDown = new Animation(500, Assets.skeletonA_down);
			animUp = new Animation(500, Assets.skeletonA_up);
			animLeft = new Animation(500, Assets.skeletonA_left);
			animRight = new Animation(500, Assets.skeletonA_right);
			break;
		case 7:
			//Forest
			animDown = new Animation(500, Assets.bee_down);
			animUp = new Animation(500, Assets.bee_up);
			animLeft = new Animation(500, Assets.bee_left);
			animRight = new Animation(500, Assets.bee_right);
			break;
		case 8:
			//Sky
			animDown = new Animation(500, Assets.angelA_down);
			animUp = new Animation(500, Assets.angelA_up);
			animLeft = new Animation(500, Assets.angelA_left);
			animRight = new Animation(500, Assets.angelA_right);
			break;
		case 9:
			//Digital
			animDown = new Animation(500, Assets.tronA_down);
			animUp = new Animation(500, Assets.tronA_up);
			animLeft = new Animation(500, Assets.tronA_left);
			animRight = new Animation(500, Assets.tronA_right);
			break;
		}
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

	}

}
