package dev.SoulSaver.entities.Swords;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.Static.items.IcePiller;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class ElementalSword extends Weapon {
	private Animation ice, fire;
	private boolean blue;

	public ElementalSword(Handler handler) {
		super(handler);

		ice = new Animation(300, Assets.iceSword);
		fire = new Animation(300, Assets.fireSword);

		blue = true;
	}

	@Override
	public void setPosition() {
		if (equipped && handler.getKeyManager().attack && !handler.getWorld().getEntityManager().getPlayer().getFall() &&
				!handler.getWorld().getEntityManager().getPlayer().getSlide()) {
			if (leftD) {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 24);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 35);
				bounds.x = -46;
				bounds.y = 5;
				bounds.width = 45;
				bounds.height = 40;
				rotate = 90;
			} else if (rightD) {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 38);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 60);
				bounds.x = 0;
				bounds.y = -45;
				bounds.width = 45;
				bounds.height = 40;
				rotate = -90;
			} else if (upD) {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 30);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 25);
				bounds.x = -45;
				bounds.y = -45;
				bounds.width = 40;
				bounds.height = 40;
				rotate = 180;
			} else {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 30);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 54);
				bounds.x = 2;
				bounds.y = 5;
				bounds.width = 30;
				bounds.height = 41;
				rotate = 0;
			}
		} else {
			bounds.width = 0;
			bounds.height = 0;
		}
	}
	
	public void setBlue(boolean b){
		blue = b;
	}

	public void action() {
		for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if (e instanceof IcePiller) {
				if (e.getRectangle().intersects(this.getRectangle())) {
					if (blue) {
						((IcePiller) e).setFreeze(true);
						((IcePiller) e).setMelt(false);
					} else {
						JukeBox.play("Melt");
						((IcePiller) e).setFreeze(false);
						((IcePiller) e).setMelt(true);
					}
				}
			}
		}
	}
	
	public void checkEquipped(){
		equipped = handler.getInventory().isEle();
	}

	@Override
	public void tick() {
		getDirection();
		fire.tick();
		ice.tick();
		setPosition();
		action();
		attack();
		
		checkEquipped();
	}

	@Override
	public void render(Graphics2D g) {
		AffineTransform at = AffineTransform.getTranslateInstance((int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()));
		at.rotate(Math.toRadians(rotate));
		at.scale(2, 2);

		if (handler.getKeyManager().attack && isEquipped()) {
			g.drawImage(getCurrentAnimationFrame(), at, null);
		}

		 //g.setColor(Color.blue);
		 //g.fillRect((int) (x + bounds.x -
		 //handler.getGameCamera().getxOffset()),
		 //(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
		 //bounds.width, bounds.height);
	}

	private BufferedImage getCurrentAnimationFrame() {
		if (blue) {
			return ice.getCurrentFrame();
		} else {
			return fire.getCurrentFrame();
		}
	}

}
