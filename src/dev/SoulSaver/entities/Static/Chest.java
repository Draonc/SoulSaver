
package dev.SoulSaver.entities.Static;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Chest extends StaticEntity {

	private Boolean playerTouch = false;

	private int chestID;

	public Chest(Handler handler, float x, float y, int chestID, int items) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);

		this.chestID = chestID;
		this.items = items;
		bounds.x = 8;
		bounds.y = 16;
		bounds.width = 48;
		bounds.height = 48;
	}

	public void update() {
		if (checkPlayerCollision(0, 5))
			playerTouch = true;

		if (playerTouch && handler.getKeyManager().interact && !isOpen()) {
			playerTouch = false;
			setopen(true);
			handler.getGame().getPrintScreen().setItems(items);
			handler.getGame().getPrintScreen().setImage(items);
			handler.getGame().getPrintScreen().setPrint(true);
			handler.getGame().getPrintScreen().setChest(true);
			handler.getGame().getPrintScreen().getTimer().Start();
			JukeBox.play("Chest");
		}
	}

	

	public void setopen(boolean b) {
		handler.getWorld().setChests(chestID, b);
	}

	public Boolean isOpen() {
		return handler.getWorld().getChest(chestID);
	}

	@Override
	public void tick() {
		
		update();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.chestClosed, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

		if (isOpen()) {
			g.drawImage(Assets.chestOpen, (int) (x - handler.getGameCamera().getxOffset()),
					(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		}
	}
}
