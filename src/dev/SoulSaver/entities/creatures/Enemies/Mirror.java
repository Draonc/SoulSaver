package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;

public class Mirror extends NPC {

	public Mirror(Handler handler, float x, float y, int world) {
		super(handler, x, y, 1, false, 4);

		timer.Start();
		this.world = world;
		setAnimation(world);
	}

	public void mirror() {
		if (handler.getKeyManager().right) {
			xMove = -speed;
		} else if (handler.getKeyManager().left) {
			xMove = speed;
		} else if (handler.getKeyManager().down) {
			yMove = -speed;
		} else if (handler.getKeyManager().up) {
			yMove = speed;
		} else {
			xMove = 0;
			yMove = 0;
		}
		
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

	@Override
	public void tick() {
		animDown.tick();
		animUp.tick();
		animRight.tick();
		animLeft.tick();

		mirror();
		attack();
		move();
	}
	
	public void setAnimation(int world){
		switch (world) {
		case 1:
			//Maze
			animDown = new Animation(500, Assets.sandStatue_down);
			animUp = new Animation(500, Assets.sandStatue_up);
			animLeft = new Animation(500, Assets.sandStatue_left);
			animRight = new Animation(500, Assets.sandStatue_right);
			break;
		case 2:
			//Fire-ice
			animDown = new Animation(500, Assets.iceManM_down);
			animUp = new Animation(500, Assets.iceManM_up);
			animLeft = new Animation(500, Assets.iceManM_left);
			animRight = new Animation(500, Assets.iceManM_right);
			break;
		case 3:
			//Swamp
			animDown = new Animation(500, Assets.sludgeMirror_down);
			animUp = new Animation(500, Assets.sludgeMirror_up);
			animLeft = new Animation(500, Assets.sludgeMirror_left);
			animRight = new Animation(500, Assets.sludgeMirror_right);
			break;
		case 4:
			//Mansion
			animDown = new Animation(500, Assets.knightStatue_down);
			animUp = new Animation(500, Assets.knightStatue_up);
			animLeft = new Animation(500, Assets.knightStatue_left);
			animRight = new Animation(500, Assets.knightStatue_right);
			break;
		case 5:
			//Ship
			animDown = new Animation(500, Assets.woodStatue_down);
			animUp = new Animation(500, Assets.woodStatue_up);
			animLeft = new Animation(500, Assets.woodStatue_left);
			animRight = new Animation(500, Assets.woodStatue_right);
			break;
		case 6:
			//Dungeon
			animDown = new Animation(500, Assets.skelStatue_down);
			animUp = new Animation(500, Assets.skelStatue_up);
			animLeft = new Animation(500, Assets.skelStatue_left);
			animRight = new Animation(500, Assets.skelStatue_right);
			break;
		case 7:
			//Forest
			animDown = new Animation(500, Assets.vineMan_down);
			animUp = new Animation(500, Assets.vineMan_up);
			animLeft = new Animation(500, Assets.vineMan_left);
			animRight = new Animation(500, Assets.vineMan_right);
			break;
		case 8:
			//Sky
			animDown = new Animation(500, Assets.angelStatue_down);
			animUp = new Animation(500, Assets.angelStatue_up);
			animLeft = new Animation(500, Assets.angelStatue_left);
			animRight = new Animation(500, Assets.angelStatue_right);
			break;
		case 9:
			//Digital
			animDown = new Animation(500, Assets.tronM_down);
			animUp = new Animation(500, Assets.tronM_up);
			animLeft = new Animation(500, Assets.tronM_left);
			animRight = new Animation(500, Assets.tronM_right);
			break;
		}
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
