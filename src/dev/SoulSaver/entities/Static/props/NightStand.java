package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class NightStand extends StaticEntity{

	public NightStand(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.x = 16;
		bounds.y = 8;
		bounds.width = 34;
		bounds.height = 60;
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.nightstand, (int) (x - handler.getGameCamera().getxOffset()),
			(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
