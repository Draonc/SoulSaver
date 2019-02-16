package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Chair extends StaticEntity {
	private BufferedImage image;

	public Chair(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);

	}

	public void setImage(int chair) {
		if (chair == 1) {
			image = Assets.chairrDown;
			bounds.x = 2;
			bounds.y = 16;
			bounds.width = 58;
			bounds.height = 48;
		}

		if (chair == 2) {
			image = Assets.chairUp;
			bounds.x = 2;
			bounds.y = 16;
			bounds.width = 58;
			bounds.height = 48;
		}

		if (chair == 3) {
			image = Assets.chairLeft;
			bounds.x = 22;
			bounds.y = 16;
			bounds.width = 48;
			bounds.height = 42;
		}

		if (chair == 4) {
			image = Assets.chairRight;
			bounds.x = 22;
			bounds.y = 16;
			bounds.width = 48;
			bounds.height = 42;
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
