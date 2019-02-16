package dev.SoulSaver.entities.Static.items;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class IcePiller extends Items {
	private BufferedImage image;
	private boolean freeze, melt;
	private int h, h2;

	public IcePiller(Handler handler, float x, float y, boolean solid) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		freeze = solid;
		melt = !solid;
	}

	@Override
	public void action() {
		if(freeze){
			image = Assets.meltPiller;
			bounds.x = 6;
			bounds.y = 20;
			bounds.width = 50;
			bounds.height = 108;
			h = 2;
			h2 = 0;
		}
		
		if(melt){
			image = Assets.puddle;
			
			bounds.y = 64;
			bounds.width = 0;
			bounds.height = 0;
			h = 1;
			h2 = height;
		}
	}
	
	public void setMelt(boolean b){
		this.melt = b;
	}
	
	public void setFreeze(boolean b){
		this.freeze = b;
	}

	@Override
	public void tick() {
		action();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()) + h2, width, height * h, null);
		
		
		//g.setColor(Color.blue);
		// g.fillRect((int) (x + bounds.x - 4 - handler.getGameCamera().getxOffset()),
		// (int) (y + bounds.y - 4 - handler.getGameCamera().getyOffset()), bounds.width + 10, bounds.height + 10);
	}

}
