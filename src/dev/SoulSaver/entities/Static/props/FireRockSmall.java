package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class FireRockSmall extends StaticEntity {

	public FireRockSmall(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.x = 4;
		bounds.y = 32;
		bounds.width = 52;
		bounds.height = 32;
	}

	@Override
	public void tick() {	
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.firePillerM, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
