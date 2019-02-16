package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.entities.Swords.BoomSword;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.Timer;

public class Switch extends StaticEntity {
	private boolean open, operate;
	private BufferedImage image;
	private int id;
	private Timer timer;

	public Switch(Handler handler, float x, float y, int id) {
		super(handler, x, y, Tile.TILEHEIGHT, Tile.TILEWIDTH);
		open = false;
		this.id = id;
		bounds.x = 20;
		bounds.y = 50;
		bounds.width = 30;
		bounds.height = 14;
		operate = false;
		timer = new Timer();
		timer.Start();
	}

	public void operate() {
		operate = false;
		for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if (e instanceof BoomSword) {
				if (e.getRectangle().intersects(this.getRectangle())) {
					operate = true;
					((BoomSword) e).returnTo();
				}
			}
		}
	}

	public void action() {
		if (((handler.getWorld().getEntityManager().getPlayer().getCollisionBounds(0f, 0f)
				.intersects(this.getRectangle()) && handler.getKeyManager().interact) || operate) && timer.run(.75f)) {
			timer.Start();

			if (open) {
				open = false;
			} else
				open = true;

			for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
				if (e instanceof AirPiller) {
					if (((AirPiller) e).getId() == id || ((AirPiller) e).getId2() == id)
						((AirPiller) e).setOperate();
				}
			}
			for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
				if (e instanceof TempWall) {
					if (((TempWall) e).checkID(id))
						((TempWall) e).changeSolid();
				}
			}

			if (open) {
				for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
					if (e instanceof Window) {
						if (((Window) e).getId() == id)
							((Window) e).setOpen(true);
					}
				}
			} else {
				if (!open) {
					for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
						if (e instanceof Window) {
							if (((Window) e).getId() == id)
								((Window) e).setOpen(false);
						}
					}
				}

			}
		}

	}

	public void setImage() {
		if (open)
			image = Assets.switchOpen;
		else
			image = Assets.switchClosed;
	}

	public int getId() {
		return id;
	}

	@Override
	public void tick() {
		setImage();
		action();
		operate();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

		// g.setColor(Color.red);

		// g.fillRect((int) (x + bounds.x -
		// handler.getGameCamera().getxOffset()),
		// (int) (y + bounds.y - handler.getGameCamera().getyOffset()),
		// bounds.width, bounds.height);
	}

}
