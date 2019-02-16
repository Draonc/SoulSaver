package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.Static.items.Target;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.CreaturesUtil;
import dev.SoulSaver.utils.Timer;

public class Projectile extends NPC {
	private int startX, startY, rotation;
	private boolean up, down, left, right, player;
	private BufferedImage image;
	private Timer fire;

	public Projectile(Handler handler, float x, float y, int world, boolean up, boolean down, boolean left,
			boolean right, boolean player) {
		super(handler, x, y, 1.5f, false, 100);
		startX = (int) x;
		startY = (int) y;
		this.x = x;
		this.y = y;
		this.player = player;
		this.world = world;
		this.up = up;
		this.down = down;
		this.left = left;
		this.right = right;
		this.player = player;
		setAnimation(world);
		setPosition();
		fire = new Timer();
		fire.Start();
		JukeBox.play("Arrow");
	}

	@Override
	public void action() {
		if (left) {
			xMove = -speed;
		} else if (right) {
			xMove = speed;
		} else if (up) {
			yMove = -speed;
		} else if (down) {
			yMove = speed;
		} else {
			xMove = 0;
			yMove = 0;
		}
		
		if (!player) {
			if (this.getCollisionBounds(0f, 0f)
					.intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle())) {
				handler.getWorld().getEntityManager().getPlayer().hurt();
				active = false;
			}
		}

		if (player) {
			for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
				if (e instanceof Target) {
					if (e.getCollisionBounds(0f, 0f).intersects(this.getRectangle())) {
						((Target) e).setHit(true);
					}
				}
			}
		}

		if (player) {
			for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
				if (e instanceof NPC) {
					if (e.getCollisionBounds(0f, 0f).intersects(this.getRectangle())) {
						((NPC) e).damage();
					}
				}
			}
		}

		if (CreaturesUtil.dist(startX, startY, x, y) > 200 || fire.run(1f)) {
			active = false;
		}
	}

	public void setPosition() {
		if (left) {
			rotation = -90;
			bounds.x = 18;
			bounds.y = -42;
			bounds.width = 32;
			bounds.height = 16;
		} else if (right) {
			rotation = 90;
			bounds.x = -50;
			bounds.y = 26;
			bounds.width = 32;
			bounds.height = 16;
		} else if (down) {
			rotation = 180;
			bounds.x = -42;
			bounds.y = -50;
			bounds.width = 16;
			bounds.height = 32;
		} else {
			rotation = 0;
			bounds.x = 26;
			bounds.y = 18;
			bounds.width = 16;
			bounds.height = 32;
		}
	}

	public void setAnimation(int world) {
		switch (world) {
		case 1:
			// Maze
			image = Assets.web;
			break;
		case 2:
			// Fire-ice
			image = Assets.fireBlast;
			break;
		case 3:
			// Swamp
			image = Assets.sludgeBomb;
			break;
		case 4:
			// Mansion
			break;
		case 5:
			// Ship
			image = Assets.ink;
			break;
		case 6:
			// Dungeon
			image = Assets.arrow;
			break;
		case 7:
			// Forest
			image = Assets.stinger;
			break;
		case 8:
			// Sky
			image = Assets.arrow;
			break;
		case 9:
			// Digital
			image = Assets.tronDiscE;
			break;
		case 10:
			// digitalPlayer
			image = Assets.tronDiscP;
			break;
		}
	}

	@Override
	public void tick() {
		action();
		move();
	}

	@Override
	public void render(Graphics2D g) {

		AffineTransform at = AffineTransform.getTranslateInstance((int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()));
		at.rotate(Math.toRadians(rotation));
		at.scale(2, 2);

		g.drawImage(image, at, null);

		// g.setColor(Color.blue);
		// g.fillRect((int) (x + bounds.x -
		// handler.getGameCamera().getxOffset()),
		// (int) (y + bounds.y - handler.getGameCamera().getyOffset()),
		// bounds.width, bounds.height);
	}
}
