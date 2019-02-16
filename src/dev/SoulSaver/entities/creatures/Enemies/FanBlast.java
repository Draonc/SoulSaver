package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.Static.Chest;
import dev.SoulSaver.entities.Static.items.Hole;
import dev.SoulSaver.entities.Static.items.LeafPile;
import dev.SoulSaver.entities.Static.items.Switch;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.CreaturesUtil;
import dev.SoulSaver.utils.Timer;

public class FanBlast extends NPC {
	private int rotation;
	private float startX, startY;
	private boolean piller;
	private boolean up, down, left, right;
	private Timer timer;

	public FanBlast(Handler handler, float x, float y, boolean piller, boolean up, boolean left, boolean right) {
		super(handler, x, y, .75f, false, 100);
		
		this.left = left;
		this.right = right;
		this.up = up;
		startX = x;
		startY = y;
		timer = new Timer();
		timer.Start();
		
		this.piller = piller;
		
		setPosition();
	}

	@Override
	public void tick() {
		action();
		move();

	}
	
	public void setPosition() {
		if (piller || left) {
			rotation = -90;
			bounds.x = 25;
			bounds.y = -64;
			bounds.width = 25;
			bounds.height = 64;
			xMove = -speed;
		} else if (right) {
			rotation = 90;
			bounds.x = -50;
			bounds.y = 0;
			bounds.width = 25;
			bounds.height = 64;
			xMove = speed;
		} else if(up) {
			rotation = 0;
			bounds.x = 0;
			bounds.y = 30;
			bounds.width = 64;
			bounds.height = 25;
			yMove = -speed;
		}else{
			rotation = 180;
			bounds.x = -64;
			bounds.y = -48;
			bounds.width = 64;
			bounds.height = 25;
			yMove = speed;
		}
	}

	@Override
	public void action() {
		if(timer.run(.5f))
			this.active = false;
		
		if(this.getCollisionBounds(0f, 0f).intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle())){
			handler.getWorld().getEntityManager().getPlayer().setPushed(true);
			handler.getWorld().getEntityManager().getPlayer().setxMove(xMove);
			handler.getWorld().getEntityManager().getPlayer().setyMove(yMove);
		}else{
			handler.getWorld().getEntityManager().getPlayer().setPushed(false);
		}
		for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if (e instanceof Switch) {
				if (e.getCollisionBounds(0f, 0f).intersects(this.getRectangle())) {
					((Switch) e).action();
				}
			}
		}

		for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if (e instanceof NPC) {
				if (e.getCollisionBounds(0f, 0f).intersects(this.getRectangle())) {
					((NPC) e).setxMove(xMove);
					((NPC) e).setyMove(yMove);

				}
			}
		}
	}

	@Override
	public void setAnimation(int world) {
	}

	@Override
	public void render(Graphics2D g) {
		AffineTransform at = AffineTransform.getTranslateInstance((int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()));
		at.rotate(Math.toRadians(rotation));
		at.scale(2, 2);

		g.drawImage(Assets.fanBlast, at, null);

		//g.setColor(Color.blue);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//		(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}

}
