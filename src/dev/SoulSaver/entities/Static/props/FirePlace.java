package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class FirePlace extends StaticEntity {
	private Animation fire;

	public FirePlace(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.width = width * 2;
		bounds.height = height * 2;
		
		fire = new Animation(300, Assets.fire);
	}

	@Override
	public void tick() {
		fire.tick();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.fireplace, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width * 2, height * 2, null);
		
		g.drawImage(fire.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset() + 33),
				(int) (y - handler.getGameCamera().getyOffset() + 60), width, height, null);
		
	}

}
