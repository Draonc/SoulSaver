package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;
import java.util.Random;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;

public class Flying extends NPC{
	private boolean ice;

	public Flying(Handler handler, float x, float y, int world, boolean ice) {
		super(handler, x, y, 1f, false, 1);
		
		this.world=world;
		this.ice=ice;
		
		bounds.x = 15;
		bounds.y = 28;
		bounds.width = 36;
		bounds.height = 37;
		
		setAnimation(world);
	}
	
	Random randomGenerator = new Random();

	@Override
	public void tick() {		
		animDown.tick();
		animUp.tick();
		animRight.tick();
		animLeft.tick();
		
		look();
		idle();
		attack();
		walk();
		move();
	}

	@Override
	public void setAnimation(int world) {
		switch (world) {
		case 1:
			//Maze
			animDown = new Animation(500, Assets.bat_down);
			animUp = new Animation(500, Assets.bat_up);
			animLeft = new Animation(500, Assets.bat_left);
			animRight = new Animation(500, Assets.bat_right);
			break;
		case 2:
			//Fire-ice
			if(ice){
				animDown = new Animation(500, Assets.batI_down);
				animUp = new Animation(500, Assets.batI_up);
				animLeft = new Animation(500, Assets.batI_left);
				animRight = new Animation(500, Assets.batI_right);
			}else{
				animDown = new Animation(500, Assets.batF_down);
				animUp = new Animation(500, Assets.batF_up);
				animLeft = new Animation(500, Assets.batF_left);
				animRight = new Animation(500, Assets.batF_right);
			}
			break;
		case 3:
			//Swamp
			animDown = new Animation(500, Assets.crow_down);
			animUp = new Animation(500, Assets.crow_up);
			animLeft = new Animation(500, Assets.crow_left);
			animRight = new Animation(500, Assets.crow_right);
			break;
		case 4:
			//Mansion
			animDown = new Animation(500, Assets.bat_down);
			animUp = new Animation(500, Assets.bat_up);
			animLeft = new Animation(500, Assets.bat_left);
			animRight = new Animation(500, Assets.bat_right);
			break;
		case 5:
			//Ship
			animDown = new Animation(500, Assets.flyFish_down);
			animUp = new Animation(500, Assets.flyFish_up);
			animLeft = new Animation(500, Assets.flyFish_left);
			animRight = new Animation(500, Assets.flyFish_right);
			break;
		case 6:
			//Dungeon
			animDown = new Animation(500, Assets.floatHead_down);
			animUp = new Animation(500, Assets.floatHead_up);
			animLeft = new Animation(500, Assets.floatHead_left);
			animRight = new Animation(500, Assets.floatHead_right);
			break;
		case 7:
			//Forest
			break;
		case 8:
			//Sky
			animDown = new Animation(500, Assets.dove_down);
			animUp = new Animation(500, Assets.dove_up);
			animLeft = new Animation(500, Assets.dove_left);
			animRight = new Animation(500, Assets.dove_right);
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