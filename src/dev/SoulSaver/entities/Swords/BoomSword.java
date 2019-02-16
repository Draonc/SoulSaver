package dev.SoulSaver.entities.Swords;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.CreaturesUtil;

public class BoomSword extends Weapon {
	private Animation boom;
	private boolean thrown;

	public BoomSword(Handler handler) {
		super(handler);
		boom = new Animation(175, Assets.boomSword);
		thrown = false;
		timer.Start();
	}

	@Override
	public void setPosition() {
		if (equipped && handler.getKeyManager().attack && !thrown
				&& !handler.getWorld().getEntityManager().getPlayer().getFall()
				&& !handler.getWorld().getEntityManager().getPlayer().getSlide()) {
			if (leftD) {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() - 32);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY());
				yMove = 0;
				xMove = -speed;
				bounds.x = 0;
				bounds.y = 0;
				bounds.width = 30;
				bounds.height = 40;
			} else if (rightD) {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 96);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY());
				yMove = 0;
				xMove = speed;
				bounds.x = 2;
				bounds.y = 0;
				bounds.width = 30;
				bounds.height = 40;
			} else if (upD) {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX());
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() - 32);
				xMove = 0;
				yMove = -speed;
				bounds.x = 0;
				bounds.y = 0;
				bounds.width = 30;
				bounds.height = 40;
			} else {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX());
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 96);
				xMove = 0;
				yMove = speed;
				bounds.x = 2;
				bounds.y = 5;
				bounds.width = 30;
				bounds.height = 40;
			}
		} else if (!thrown) {
			bounds.width = 0;
			bounds.height = 0;
		}

	}

	public void returnTo() {
		if (leftD) {
			xMove = speed;
		} else if (rightD) {
			xMove = -speed;
		} else if (upD) {
			yMove = speed;
		} else {
			yMove = -speed;
		}
	}

	public void throwBoom() {
		if (equipped && handler.getKeyManager().attack && !thrown) {
			thrown = true;
		}

		if (CreaturesUtil.dist(x, y, handler.getWorld().getEntityManager().getPlayer().getX(),
				handler.getWorld().getEntityManager().getPlayer().getY()) > 300 && thrown) {
			timer.Start();
			if (leftD) {
				xMove = speed;
			} else if (rightD) {
				xMove = -speed;
			} else if (upD) {
				yMove = speed;
			} else {
				yMove = -speed;
			}
		}

		// if(xMove == 0 && yMove == 0 && thrown){
		// System.out.println("returning");
		// }

		for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if (!(e instanceof Player) && !(e instanceof Weapon) && thrown) {
				if (e.getRectangle().intersects(this.getRectangle())) {
					returnTo();
				}
			}
		}

		if (this.getCollisionBounds(0f, 0f)
				.intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle()))

		{
			thrown = false;
		}

	}

	public void checkEquipped() {
		equipped = handler.getInventory().isBoom();
	}

	@Override
	public void tick() {
		getDirection();
		boom.tick();
		setPosition();
		throwBoom();
		move();
		checkEquipped();
	}

	@Override
	public void render(Graphics2D g) {
		if (thrown) {
			g.drawImage(boom.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),
					(int) (y - handler.getGameCamera().getyOffset()), width / 2, height / 2, null);
		}

		// g.setColor(Color.blue);
		// g.fillRect((int) (x + bounds.x -
		// handler.getGameCamera().getxOffset()),
		// (int) (y + bounds.y - handler.getGameCamera().getyOffset()),
		// bounds.width, bounds.height);
	}
}
