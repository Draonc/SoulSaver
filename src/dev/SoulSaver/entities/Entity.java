package dev.SoulSaver.entities;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;

public abstract class Entity {

	protected Handler handler;
	protected float x, y;
	protected int width, height, health, items, id;
	protected Rectangle bounds;
	protected boolean top, bottom, active;

	public Entity(Handler handler, float x, float y, int width, int height, int health) {
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
		active = true;
		top = false;
		bottom = false;

		bounds = new Rectangle(0, 0, width, height);
	}

	public abstract void tick();

	public abstract void render(Graphics2D g);

	public boolean checkEntityCollisions(float xOffset, float yOffset) {

		for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if (e.equals(this))
				continue;
			if (e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)))
				return true;
		}
		return false;
	}

	public boolean checkPlayerCollision(float xOffset, float yOffset) {
		Entity e = this;
		if (e.getCollisionBounds(xOffset, yOffset)
				.intersects(handler.getWorld().getEntityManager().getPlayer().getCollisionBounds(0f, 0f)))
			return true;
		else
			return false;
	}

	public Rectangle getCollisionBounds(float xOffset, float yOffset) {
		return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width,
				bounds.height);
	}

	public boolean intersects(Entity o) {
		return getRectangle().intersects(o.getRectangle());
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean b) {
		active = b;
	}

	public void setID(int id) {
		this.id = id;
	}

	public Rectangle getRectangle() {
		return new Rectangle((int) (x + bounds.x - 4), (int) (y + bounds.y - 4), (bounds.width + 10),
				(bounds.height + 10));
	}

	public Rectangle getBounds() {
		return bounds;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getItems() {
		return items;
	}
	
	public void setTop(boolean b){
		top = b;
	}
}
