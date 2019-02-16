package dev.SoulSaver.entities.Static.Houses;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class FlatS extends StaticEntity{

	public FlatS(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 4;
		bounds.width = (width * 10) - 6;
		bounds.height = (height * 10) - 22;
	}

	@Override
	public void tick() {		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.flatS,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width * 10, height * 10, null);
	}

}
