package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;

public class Trail extends NPC {
	private float pX, pY;
	private boolean ice;

	public Trail(Handler handler, float x, float y, int world, boolean ice) {
		super(handler, x, y, .7f, false, 4);
		this.world = world;
		this.ice = ice;

		timer.Start();

		setAnimation(world);
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
		leaveTrail();
	}

	public void leaveTrail() {
		if (timer.run(.4f)) {
			setTrail();
			handler.getWorld().getEntityManager().addEntity(new MTrail(handler, pX, pY, world, left, right, ice));
			timer.Start();
		}

	}

	public void setTrail() {
		if (right) {
			pX = this.x - 64;
			pY = this.y;
		} else if (left) {
			pX = this.x + 64;
			pY = this.y;
		} else if (down) {
			pX = this.x + 64+15;
			pY = this.y - 64;
		} else {
			pX = this.x + 64+15;
			pY = this.y + 64;
		}
	}

	@Override
	public void setAnimation(int world) {
		switch (world) {
		case 1:
			// Maze
			animDown = new Animation(500, Assets.scorpion_down);
			animUp = new Animation(500, Assets.scorpion_up);
			animLeft = new Animation(500, Assets.scorpion_left);
			animRight = new Animation(500, Assets.scorpion_right);
			break;
		case 2:
			// Fire-ice
			if (ice) {
				animDown = new Animation(500, Assets.blobI_down);
				animUp = new Animation(500, Assets.blobI_up);
				animLeft = new Animation(500, Assets.blobI_left);
				animRight = new Animation(500, Assets.blobI_right);
			} else {
				animDown = new Animation(500, Assets.blobF_down);
				animUp = new Animation(500, Assets.blobF_up);
				animLeft = new Animation(500, Assets.blobF_left);
				animRight = new Animation(500, Assets.blobF_right);
			}
			break;
		case 3:
			// Swamp
			animDown = new Animation(500, Assets.sludgeManT_down);
			animUp = new Animation(500, Assets.sludgeManT_up);
			animLeft = new Animation(500, Assets.sludgeManT_left);
			animRight = new Animation(500, Assets.sludgeManT_right);
			break;
		case 4:
			// Mansion
			animDown = new Animation(500, Assets.ghost_down);
			animUp = new Animation(500, Assets.ghost_up);
			animLeft = new Animation(500, Assets.ghost_left);
			animRight = new Animation(500, Assets.ghost_right);
			break;
		case 5:
			// Ship
			animDown = new Animation(500, Assets.blobS_down);
			animUp = new Animation(500, Assets.blobS_up);
			animLeft = new Animation(500, Assets.blobS_left);
			animRight = new Animation(500, Assets.blobS_right);
			break;
		case 6:
			// Dungeon
			break;
		case 7:
			// Forest
			animDown = new Animation(500, Assets.slug_down);
			animUp = new Animation(500, Assets.slug_up);
			animLeft = new Animation(500, Assets.slug_left);
			animRight = new Animation(500, Assets.slug_right);
			break;
		case 8:
			// Sky
			animDown = new Animation(500, Assets.cloud_down);
			animUp = new Animation(500, Assets.cloud_up);
			animLeft = new Animation(500, Assets.cloud_left);
			animRight = new Animation(500, Assets.cloud_right);
			break;
		case 9:
			animDown = new Animation(500, Assets.tronBike_down);
			animUp = new Animation(500, Assets.tronBike_up);
			animLeft = new Animation(500, Assets.tronBike_left);
			animRight = new Animation(500, Assets.tronBike_right);
			break;
		}
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

	}

}
