package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;

public class Armor extends NPC {

	public Armor(Handler handler, float x, float y, int world) {
		super(handler, x, y, .7f, false, 6);
		this.world = world;

		bounds.x = 15;
		bounds.y = 28;
		bounds.width = 36;
		bounds.height = 37;

		setAnimation(world);
	}

	public void setAnimation(int world) {
		switch (world) {
		case 1:
			//Maze
			break;
		case 2:
			//Fire-ice
			animDown = new Animation(500, Assets.iceManA_down);
			animUp = new Animation(500, Assets.iceManA_up);
			animLeft = new Animation(500, Assets.iceManA_left);
			animRight = new Animation(500, Assets.iceManA_right);
			break;
		case 3:
			//Swamp
			animDown = new Animation(500, Assets.stoneSludge_down);
			animUp = new Animation(500, Assets.stoneSludge_up);
			animLeft = new Animation(500, Assets.stoneSludge_left);
			animRight = new Animation(500, Assets.stoneSludge_right);
			break;
		case 4:
			//Mansion
			animDown = new Animation(500, Assets.knight_down);
			animUp = new Animation(500, Assets.knight_up);
			animLeft = new Animation(500, Assets.knight_left);
			animRight = new Animation(500, Assets.knight_right);
			break;
		case 5:
			//Ship
			break;
		case 6:
			//Dungeon
			animDown = new Animation(500, Assets.knightSkel_down);
			animUp = new Animation(500, Assets.knightSkel_up);
			animLeft = new Animation(500, Assets.knightSkel_left);
			animRight = new Animation(500, Assets.knightSkel_right);
			break;
		case 7:
			//Forest
			animDown = new Animation(500, Assets.ent_down);
			animUp = new Animation(500, Assets.ent_up);
			animLeft = new Animation(500, Assets.ent_left);
			animRight = new Animation(500, Assets.ent_right);
			break;
		case 8:
			//Sky
			break;
		case 9:
			//Digital
			animDown = new Animation(500, Assets.tron_down);
			animUp = new Animation(500, Assets.tron_up);
			animLeft = new Animation(500, Assets.tron_left);
			animRight = new Animation(500, Assets.tron_right);
			break;
		}
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
	public Rectangle getRectangle() {
		if(left){
			return new Rectangle((int)(x+bounds.x-2), (int)(y+bounds.y-4), (bounds.width-20), (bounds.height));
		}else if(right){
			return new Rectangle((int)(x+bounds.x+20), (int)(y+bounds.y-4), (bounds.width-20), (bounds.height));
		}else if(up){
			return new Rectangle((int)(x+bounds.x-4), (int)(y+bounds.y+20), (bounds.width+10), (bounds.height-20));
		}else{
			return new Rectangle((int)(x+bounds.x-4), (int)(y+bounds.y-20), (bounds.width+10), (bounds.height-20));
		}
	} 

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

		//g.setColor(Color.blue);
	    //g.fillRect((int) (x + bounds.x + 20 - handler.getGameCamera().getxOffset()),(int) (y + bounds.y -4- handler.getGameCamera().getyOffset()),(bounds.width-20), (bounds.height));

	}
}
