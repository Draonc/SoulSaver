package dev.SoulSaver.entities.Swords;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.Static.items.LightRay;
import dev.SoulSaver.gfx.Assets;

public class ShieldSword extends Weapon {
	private float pX, pY;
	private BufferedImage image;
	private boolean light;

	public ShieldSword(Handler handler) {
		super(handler);
		light = false;
	}

	public void action() {
		for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if (e instanceof LightRay) {
				if (e.getCollisionBounds(0f, 0f).intersects(this.getRectangle()) && !light
						&& handler.getKeyManager().attack) {
					setProj();
					timer.Start();
					light = true;
					handler.getWorld().getEntityManager()
							.addEntity(new LightRay(handler, pX, pY, 10, upD, downD, leftD, rightD, false));
					break;
				}
			}
		}

		if (timer.run(2) || !handler.getKeyManager().attack) {
			light = false;
		}
	}

	public void setLight(boolean b) {
		light = b;
	}

	private void setProj() {
		if (leftD) {
			pX = x;
			pY = y + 90;
		} else if (rightD) {
			pX = x + 330;
			pY = y + 86;
		} else if (upD) {
			pX = x + 90;
			pY = y - 300;
		} else {
			pX = x - 62;
			pY = y + 330;
		}
	}

	@Override
	public void setPosition() {
		if (equipped && handler.getKeyManager().attack  && !handler.getWorld().getEntityManager().getPlayer().getFall() &&
				!handler.getWorld().getEntityManager().getPlayer().getSlide()) {
			if (leftD) {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 10);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 32);
				bounds.x = 0;
				bounds.y = 0;
				bounds.width = 12;
				bounds.height = 30;
				image = Assets.shieldSwordLeft;
			} else if (rightD) {
				image = Assets.shieldSwordRight;
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 42);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 32);
				bounds.x = 0;
				bounds.y = 0;
				bounds.width = 12;
				bounds.height = 30;
			} else if (upD) {
				image = Assets.shieldSwordUp;
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX());
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 16);
				bounds.x = 0;
				bounds.y = 0;
				bounds.width = 25;
				bounds.height = 30;
			} else {
				image = Assets.shieldSwordDown;
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 35);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 45);
				bounds.x = 0;
				bounds.y = 5;
				bounds.width = 25;
				bounds.height = 30;
			}
		}else{
			bounds.width = 0;
			bounds.height = 0;
		}

	}
	
	public void checkEquipped(){
		equipped = handler.getInventory().isShield();
	}

	@Override
	public void tick() {
		action();
		setPosition();
		getDirection();
		attack();
		checkEquipped();
	}


	@Override
	public void render(Graphics2D g) {
		if (handler.getKeyManager().attack && isEquipped()) {
			g.drawImage(image, ((int) (x - handler.getGameCamera().getxOffset())),
					(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		}

		//g.setColor(Color.blue);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//		(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}

}
