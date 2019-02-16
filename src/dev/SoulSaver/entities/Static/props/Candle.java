package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Candle extends StaticEntity {
	private BufferedImage image;

	public Candle(Handler handler, float x, float y, int candle) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.width = 0;
		bounds.height = 0;
		
		setImage(candle);
	}
	
	public void setImage(int candle){
		if(candle == 1){
			image = Assets.candle;
		}
		
		if(candle == 2){
			image = Assets.candle2;
		}
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
