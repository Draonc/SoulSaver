package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Dresser extends StaticEntity {
	private BufferedImage image;
	private int w, h;

	public Dresser(Handler handler, float x, float y, int dresser) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		setImage(dresser);
	}

	public void setImage(int dresser) {
		if (dresser == 1) {
			image = Assets.dresserDown;
			w = 2;
			h = 2;
			bounds.y = 48;
			bounds.width = width * 2;
			bounds.height = 64;
		}

		if (dresser == 2) {
			image = Assets.dresserLeft;
			w = 1;
			h = 4;
			bounds.y = 64;
			bounds.width = 36;
			bounds.height = 160;

		}

		if (dresser == 3) {
			image = Assets.dresserRight;
			w = 1;
			h = 4;
			bounds.y = 64;
			bounds.width = 36;
			bounds.height = 160;
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width * w, height * h, null);
	}

}
