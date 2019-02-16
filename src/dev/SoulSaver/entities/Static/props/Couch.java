package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Couch extends StaticEntity {
	private BufferedImage image;

	public Couch(Handler handler, float x, float y, int couch) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.y = 56;
		bounds.height = 146;
		
		setImage(couch);
	}
	
	public void setImage(int couch){
		if(couch == 1){
			image = Assets.sofaRight;
		}
		
		if(couch == 2){
			image = Assets.sofaLeft;
		}
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height * 3, null);
	}

}
