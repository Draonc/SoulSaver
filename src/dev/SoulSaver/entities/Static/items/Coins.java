package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.gfx.Assets;

public class Coins extends Items {
	private int amount;
	private BufferedImage image;

	public Coins(Handler handler, float x, float y, int amount) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		this.amount = amount;
		
		action();
	}
	
	public int getAmount(){
		return amount;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
	}

	@Override
	public void action() {
		switch(amount){
		case 1:
			image = Assets.coin1;
			break;
		case 2:
			image = Assets.coin2;
			break;
		case 5:
			image = Assets.coin5;
			break;
		case 10:
			image = Assets.coin10;
			break;
		}
	}

}
