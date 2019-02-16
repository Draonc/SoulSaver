package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Trough extends StaticEntity {
	private BufferedImage image;
	
	public Trough(Handler handler, float x, float y, int trough) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.y = 16;
		bounds.width = width * 2;
		bounds.height = 48;
		
		setImage(trough);
	}
	
	public void setImage(int trough){
		if(trough == 1){
			image = Assets.hayTrough;
		}
		
		if(trough == 2){
			image = Assets.waterTrough;
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width * 2, height, null);
	}

}
