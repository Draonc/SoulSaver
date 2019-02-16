package dev.SoulSaver.entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.creatures.Enemies.Key;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class DungeonDoorL extends StaticEntity {
	private BufferedImage image;

	public DungeonDoorL(Handler handler, float x, float y, int direction) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		direction(direction);
	}

	private void direction(int direction) {

		if (direction == 1) {
			image = Assets.dungeonDoorLUp;
		}

		if (direction == 2) {
			image = Assets.dungeonDoorLDown;
		}

		if (direction == 3) {
			image = Assets.dungeonDoorLLeft;
		}

		if (direction == 4) {
			image = Assets.dungeonDoorLRight;
		}

	}

	private void open() {
		if (this.getRectangle().intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle()) && Key.getKeys() > 0) {
			Key.useKey();
			this.active = false;
		}
	}

	@Override
	public void tick() {
		open();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
