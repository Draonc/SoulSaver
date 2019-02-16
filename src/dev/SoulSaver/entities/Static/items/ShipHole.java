package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class ShipHole extends Items {
	private float nX, nY;

	public ShipHole(Handler handler, float x, float y, float nX, float nY) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.nX = nX;
		this.nY = nY;
	}

	@Override
	public void action() {
			if (this.getRectangle().intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle())) {
				handler.getWorld().getEntityManager().getPlayer().setX(nX);
				handler.getWorld().getEntityManager().getPlayer().setY(nY);
		}
	}

	@Override
	public void tick() {
		action();

	}

	@Override
	public void render(Graphics2D g) {
			g.drawImage(Assets.shipHole, (int) (x - handler.getGameCamera().getxOffset()),
					(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

	}

}
