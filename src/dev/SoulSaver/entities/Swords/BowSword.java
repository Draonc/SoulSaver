package dev.SoulSaver.entities.Swords;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.entities.creatures.Enemies.Projectile;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;

public class BowSword extends Weapon {
	private Animation bow;
	private float pX, pY;
	private int world;
	private boolean digital;

	public BowSword(Handler handler) {
		super(handler);
		timer.Start();

		bow = new Animation(300, Assets.bowSword);
		bounds.width = 0;
		bounds.height = 0;

		setWorld();
	}

	public void fire() {
		if (handler.getInventory().getArrows() > 0) {
			if (handler.getKeyManager().attack && isEquipped() && timer.run(.5f)) {
				setProj();
				handler.getWorld().getEntityManager().addEntity(new Projectile(handler, pX, pY, world, upD, downD, leftD, rightD, true));
				handler.getInventory().useArrow();
				timer.Start();
			}
		}
	}

	public void setDigital(boolean b) {
		digital = b;
	}

	public void setWorld() {
		if (digital)
			world = 10;
		else
			world = 8;
	}

	private void setProj() {
		if (leftD) {
			pX = this.x - Creature.DEFAULT_CREATURE_WIDTH + 15;
			pY = this.y + Creature.DEFAULT_CREATURE_HEIGHT;
		} else if (rightD) {
			pX = this.x + Creature.DEFAULT_CREATURE_WIDTH * 2 - 30;
			pY = this.y - Creature.DEFAULT_CREATURE_HEIGHT;
		} else if (upD) {
			pX = this.x - Creature.DEFAULT_CREATURE_WIDTH - 2;
			pY = this.y - Creature.DEFAULT_CREATURE_HEIGHT + 20;
		} else {
			pX = this.x + Creature.DEFAULT_CREATURE_WIDTH + 4;
			pY = this.y + Creature.DEFAULT_CREATURE_HEIGHT * 2 - 15;
		}
	}

	@Override
	public void setPosition() {
		if (equipped && handler.getKeyManager().attack && !handler.getWorld().getEntityManager().getPlayer().getFall() &&
				!handler.getWorld().getEntityManager().getPlayer().getSlide()) {
			if (leftD) {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 22);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 15);
				rotate = 90;
			} else if (rightD) {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 43);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 79);
				rotate = -90;
			} else if (upD) {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 50);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 25);
				rotate = 180;
			} else {
				x = (int) (handler.getWorld().getEntityManager().getPlayer().getX() + 9);
				y = (int) (handler.getWorld().getEntityManager().getPlayer().getY() + 57);
				rotate = 0;
			}
		}
	}

	public void checkEquipped() {
		equipped = handler.getInventory().isBow();
	}

	@Override
	public void tick() {
		getDirection();
		setPosition();
		fire();
		bow.tick();
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
	}

	private BufferedImage getCurrentAnimationFrame() {
		return bow.getCurrentFrame();
	}

}
