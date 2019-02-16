package dev.SoulSaver.entities.Static.items;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.Timer;

public class LightRay extends StaticEntity {
	private BufferedImage image;
	private int rotation, length;
	private boolean left, right, window, up, down;
	private Timer timer;

	public LightRay(Handler handler, float x, float y, int length, boolean up, boolean down, boolean left,
			boolean right, boolean window) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		this.left = left;
		this.right = right;
		this.up = up;
		this.down = down;
		this.window = window;
		this.length = length;

		timer = new Timer();

		timer.Start();
		image = Assets.light;
	}

	public void setPosition() {
		if(window && right){
			rotation = -180;
			bounds.x = -80;
			bounds.y = -96;
			bounds.width = 70;
			bounds.height = 48;
		}else if(window && left){
			rotation = 180;
			bounds.x = -80;
			bounds.y = -96;
			bounds.width = 70;
			bounds.height = 48;
		}else if(window && up){
			rotation = 90;
			bounds.x = -96;
			bounds.y = 0;
			bounds.width = 48;
			bounds.height = 70;
		}else if(window && down){
			rotation = 90;
			bounds.x = -96;
			bounds.y = 28;
			bounds.width = 48;
			bounds.height = 70;
		}else if (window && !up && !down && !left && !right) {
			rotation = 90;
			bounds.x = -96;
			bounds.y = 28;
			bounds.width = 48;
			bounds.height = 70;
		} else if (right && !window) {
			rotation = -180;
			bounds.x = -320;
			bounds.y = -96;
			bounds.width = 330;
			bounds.height = 48;
		} else if (left && !window) {
			rotation = 180;
			bounds.x = -320;
			bounds.y = -96;
			bounds.width = 320;
			bounds.height = 48;
		} else if(up && !window) {
			rotation = 90;
			bounds.x = -96;
			bounds.y = 0;
			bounds.width = 48;
			bounds.height = 320;
		}else{
			rotation = -90;
			bounds.x = 48;
			bounds.y = -320;
			bounds.width = 48;
			bounds.height = 320;
		}
	}

	public void action() {
		for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if (e instanceof Normal) {
				if (((Normal) e).isVampire()) {
					if (e.getCollisionBounds(0f, 0f).intersects(this.getRectangle()))
						((Normal) e).damage();;
				}
			}
			if (e instanceof BlackFire) {
				if (e.getCollisionBounds(0f, 0f).intersects(this.getRectangle()))
					e.setActive(false);
			}
			if(e instanceof LightTarget){
				if(e.getCollisionBounds(0f, 0f).intersects(this.getRectangle())){
					((LightTarget)e).setHit(true);
				}
			}
		}

		if ((timer.run(2f) || !handler.getKeyManager().attack)  && !window) {
			this.active = false;
		}
	}

	@Override
	public void tick() {
		setPosition();
		action();

	}

	@Override
	public void render(Graphics2D g) {

		AffineTransform at = AffineTransform.getTranslateInstance((int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()));
		at.rotate(Math.toRadians(rotation));
		at.scale(length, 3);

		g.drawImage(image, at, null);

		//g.setColor(Color.blue);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//		(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);

	}

}
