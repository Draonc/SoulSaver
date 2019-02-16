package dev.SoulSaver.entities.Static.items;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.gfx.Assets;

public class Crate extends NPC{
	private BufferedImage image;

	public Crate(Handler handler, float x, float y, int world) {
		super(handler, x, y, 1f, false, 1000);
		this.world = world;
		
		bounds.x = 5;
		bounds.y = 5;
		bounds.width = 52;
		bounds.height = 45;
		
		setAnimation(world);
	}
	
	public void pushed(){
		if(this.getCollisionBounds(0f, 0f).intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle())){
			getDirection();
			if (left) {
				xMove = -speed;
			} else if (right) {
				xMove = speed;
			} else if (up) {
				yMove = -speed;
			} else if (down) {
				yMove = speed;
			}
		}else{
		
		xMove = 0;
		yMove = 0;
		}
	}
	
	public void getDirection(){
		left = handler.getWorld().getEntityManager().getPlayer().isLeft();
		right = handler.getWorld().getEntityManager().getPlayer().isRight();
		up = handler.getWorld().getEntityManager().getPlayer().isUp();
		down = handler.getWorld().getEntityManager().getPlayer().isDown();
	}

	@Override
	public void tick() {
		setDirection();
		pushed();
		move();
	}

	@Override
	public void setAnimation(int world) {
		switch (world) {
		case 1:
			//Maze
			image = Assets.mazeCrate;
			break;
		case 2:
			//Fire-ice
			image = Assets.fireIceCrate;
			break;
		case 3:
			//Swamp
			image = Assets.swampCrate;
			break;
		case 4:
			//Mansion
			image = Assets.mansionCrate;
			break;
		case 5:
			//Ship
			image = Assets.shipCrate;
			break;
		case 6:
			//Dungeon
			image = Assets.dungeonCrate;
			break;
		case 7:
			//Forest
			image = Assets.forestCrate;
			break;
		case 8:
			//Sky
			image = Assets.skyCrate;
			break;
		case 9:
			//Digital
			image = Assets.digitalCrate;
			break;
		}
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
		//g.setColor(Color.red);

		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
		
	}
	

}
