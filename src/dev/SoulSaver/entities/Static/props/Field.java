package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Field extends StaticEntity {

	public Field(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.field, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width * 3, height * 3, null);
		
	}

}
