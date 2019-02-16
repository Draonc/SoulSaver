package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.gfx.Assets;

public class Painting extends Items{
	private boolean added, left, right, up, down;
	private int direction;
	private float pX, pY;
	private BufferedImage image;

	public Painting(Handler handler, float x, float y, int direction) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

		bounds.width = 0;
		bounds.height = 0;
		added = false;
		left = false;
		right = false;
		up = false;
		down = false;
		setImage(direction);
		setDirection(direction);
	}
	
	public int getId(){
		return id;
	}
	
	public void setImage(int direction){
		if(direction == 1)
			image = Assets.picture_down;
		if(direction == 2)
			image = Assets.picture_up;
		if(direction == 3)
			image = Assets.picture_left;
		if(direction == 4)
			image = Assets.picture_right;
	}

	@Override
	public void tick() {
		action();
		
	}
	
	public void setDirection(int direction){
		if(direction == 1){
			pX = x + 105;
			pY = y + 32;
			down = true;
		}
		if(direction == 2){
			pX = x + 105;
			pY = y - 64;
			up = true;
		}
		if(direction == 3){
			pX = x + 32;
			pY = y + 105;
			left = true;
		}
		if(direction == 4){
			pX = x + 125;
			pY = y + 105;
			right = true;
		}
	}

	@Override
	public void render(Graphics2D g) {
			g.drawImage(image,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	@Override
	public void action() {
		if(!added){
			handler.getWorld().getEntityManager().addEntity(new LightRay(handler, pX, pY, 3, up, down, left, right, true));
			added=true;
		}
	}

}
