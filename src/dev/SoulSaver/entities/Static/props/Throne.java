package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Throne extends StaticEntity {

	public Throne(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.y = 112;
		bounds.height = 80;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.throne, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height * 3, null);
		
	}

}
