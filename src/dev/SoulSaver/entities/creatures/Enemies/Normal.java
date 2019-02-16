package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;

public class Normal extends NPC {
	public boolean vampire;

	public Normal(Handler handler, float x, float y, int world) {
		super(handler, x, y, .7f, false, 3);
		this.world = world;

		bounds.x = 15;
		bounds.y = 28;
		bounds.width = 36;
		bounds.height = 37;
		vampire = false;

		setAnimation(world);
	}

	public void setAnimation(int world) {
		switch (world) {
		case 1:
			//Maze
			animDown = new Animation(500, Assets.weasel_down);
			animUp = new Animation(500, Assets.weasel_up);
			animLeft = new Animation(500, Assets.weasel_left);
			animRight = new Animation(500, Assets.weasel_right);
			break;
		case 2:
			//Fire-ice
			animDown = new Animation(500, Assets.dragonN_down);
			animUp = new Animation(500, Assets.dragonN_up);
			animLeft = new Animation(500, Assets.dragonN_left);
			animRight = new Animation(500, Assets.dragonN_right);
			break;
		case 3:
			//Swamp
			animDown = new Animation(500, Assets.plantS_down);
			animUp = new Animation(500, Assets.plantS_up);
			animLeft = new Animation(500, Assets.plantS_left);
			animRight = new Animation(500, Assets.plantS_right);
			break;
		case 4:
			//Mansion
			vampire = true;
			animDown = new Animation(500, Assets.vampire_down);
			animUp = new Animation(500, Assets.vampire_up);
			animLeft = new Animation(500, Assets.vampire_left);
			animRight = new Animation(500, Assets.vampire_right);
			break;
		case 5:
			//Ship
			animDown = new Animation(500, Assets.fishman_down);
			animUp = new Animation(500, Assets.fishman_up);
			animLeft = new Animation(500, Assets.fishman_left);
			animRight = new Animation(500, Assets.fishman_right);
			break;
		case 6:
			//Dungeon
			animDown = new Animation(500, Assets.skeleton_down);
			animUp = new Animation(500, Assets.skeleton_up);
			animLeft = new Animation(500, Assets.skeleton_left);
			animRight = new Animation(500, Assets.skeleton_right);
			break;
		case 7:
			//Forest
			animDown = new Animation(500, Assets.plantF_down);
			animUp = new Animation(500, Assets.plantF_up);
			animLeft = new Animation(500, Assets.plantF_left);
			animRight = new Animation(500, Assets.plantF_right);
			break;
		case 8:
			//Sky
			animDown = new Animation(500, Assets.cloudRat_down);
			animUp = new Animation(500, Assets.cloudRat_up);
			animLeft = new Animation(500, Assets.cloudRat_left);
			animRight = new Animation(500, Assets.cloudRat_right);
			break;
		case 9:
			//Digital
			animDown = new Animation(500, Assets.tronN_down);
			animUp = new Animation(500, Assets.tronN_up);
			animLeft = new Animation(500, Assets.tronN_left);
			animRight = new Animation(500, Assets.tronN_right);
			break;
		}

	}
	
	public boolean isVampire(){
		return vampire;
	}

	@Override
	public void tick() {
		// Animations
		animDown.tick();
		animUp.tick();
		animRight.tick();
		animLeft.tick();

		// Action
		look();
		action();
		attack();
		walk();
		move();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

		// g.setColor(Color.blue);
		// g.fillRect((int) (x + bounds.x -
		// handler.getGameCamera().getxOffset()),
		// (int) (y + bounds.y - handler.getGameCamera().getyOffset()),
		// bounds.width, bounds.height);

	}
}
