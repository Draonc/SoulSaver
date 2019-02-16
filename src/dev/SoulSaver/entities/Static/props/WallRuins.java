package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class WallRuins extends StaticEntity {
	private BufferedImage image;
	private int w;

	public WallRuins(Handler handler, float x, float y, int type) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		setImage(type);
		
	}
	
	public void setImage(int type){
		if(type == 1){
			image = Assets.wallRuinsB;
			w = 6;
			bounds.y = 96;
			bounds.height = 32;
			bounds.width = width * 6;
		}
		
		if (type == 2){
			image = Assets.wallRuinsS;
			w = 2;
			bounds.y = 96;
			bounds.height = 32;
			bounds.width = width * 2;
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width * w, height * 2, null);
		
	}

}
