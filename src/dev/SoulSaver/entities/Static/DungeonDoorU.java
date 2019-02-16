package dev.SoulSaver.entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.creatures.Enemies.Key;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class DungeonDoorU extends StaticEntity {
	private int direction;
	private BufferedImage image;

	public DungeonDoorU(Handler handler, float x, float y, int direction) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		direction(direction);
	}

	private void direction(int direction) {

		if (direction == 1) {
			image = Assets.dungeonDoorUUp;
		}

		if (direction == 2) {
			image = Assets.dungeonDoorUDown;
		}

		if (direction == 3) {
			image = Assets.dungeonDoorULeft;
		}

		if (direction == 4) {
			image = Assets.dungeonDoorURight;
		}

	}

	private void open() {
		if (this.getCollisionBounds(0f, 0f).intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle())) {
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
