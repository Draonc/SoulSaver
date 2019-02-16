package dev.SoulSaver.entities.Static.items;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class ShopShelf extends StaticEntity {
	private BufferedImage image;
	private int w, h;

	public ShopShelf(Handler handler, float x, float y, int type) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		setImage(type);
	}
	
	public void setImage(int type){
		switch(type){
		case 1:
			image = Assets.shelfShopLeft;
			w = 1;
			h = 3;
			bounds.y =  -32;
			bounds.height = height * 3;
			break;
		case 2:
			image = Assets.shelfShopRight;
			w = 1;
			h = 3;
			bounds.y = - 32;
			bounds.height = height * 3;
			break;
		case 3:
			image = Assets.shelfShopBottom;
			w = 3;
			h = 2;
			bounds.height = 96;
			bounds.width = width * 3;
			break;
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width * w, height * h, null);
		
		//g.setColor(Color.red);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//		(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
		
	}

}
