package dev.SoulSaver.creatures;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.Swords.BoomSword;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.Timer;

/**
 * This class sets up the begining frame for any entity that is considered a creature.
 * Is sets up the moving speed, health, and interaction with tiles.
 */
public abstract class Creature extends Entity {

	public static final float DEFAULT_SPEED = 5f;
	public static final int DEFAULT_CREATURE_WIDTH = 64, DEFAULT_CREATURE_HEIGHT = 64;

	protected int health, w, h;
	protected float speed;
	protected float xMove, yMove;
	protected boolean up, down, left, right, fall, slide, pit, Running, setFrame;
	protected Timer fallTimer, hittimer;

	public Creature(Handler handler, float x, float y, int width, int height, int health) {
		super(handler, x, y, width, height, health);
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
		fall = false;
		slide = false;
		fallTimer = new Timer();
		hittimer = new Timer();
		Running = false;
		setFrame = true;
	}

	public void setDirection() {
		up = false;
		down = false;
		right = false;
		left = false;
	}

	public boolean checkInput() {
		return (handler.getKeyManager().up || handler.getKeyManager().down || handler.getKeyManager().left
				|| handler.getKeyManager().right);
	}

	/**
	 * Checks to see if the creature is moving into a certain type of tile.
	 */
	public void move() {
		sliding();
		falling();
		pit();
		if (!checkEntityCollisions(xMove, 0f))
			moveX();
		if (!checkEntityCollisions(0f, yMove))
			moveY();
	}


	/**
	 * Sets up the generic horizontal movement of the creature. 
	 * If it collides with a solid tile it stops the creature from moving forward.
	 */
	public void moveX() {
		if (xMove > 0) {// Moving right
			int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;

			if (!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					&& !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
				x += xMove;
			} else if (this instanceof BoomSword) {
				xMove = -speed;
			} else {
				x = tx * Tile.TILEWIDTH - bounds.x - bounds.width - 1;
				slide = false;
			}

		} else if (xMove < 0) {// Moving left
			int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;

			if (!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					&& !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
				x += xMove;
			} else if (this instanceof BoomSword) {
				xMove = speed;
			} else {
				x = tx * Tile.TILEWIDTH + Tile.TILEWIDTH - bounds.x;
				slide = false;
			}
		}
	}

	public void moveY() {
		if (yMove < 0) {// Up
			int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;

			if (!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
					&& !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
				y += yMove;
			} else if (this instanceof BoomSword) {
				yMove = speed;
			} else {
				y = ty * Tile.TILEHEIGHT + Tile.TILEHEIGHT - bounds.y;
				slide = false;
			}

		} else if (yMove > 0) {// Down
			int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

			if (!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
					&& !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
				y += yMove;
			} else if (this instanceof BoomSword) {
				yMove = -speed;
			} else {
				y = ty * Tile.TILEHEIGHT - bounds.y - bounds.height - 1;
				slide = false;
			}
		}
	}

	/**
	 * Checks to see if the creature has stepped on a tile that can hurt them.
	 * If they have then it causes damage.
	 */
	public void pit() {
		if (!(this instanceof BoomSword)) {
			if (xMove > 0) {// Moving right
				int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;

				if (collisionWithDanger(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
						&& collisionWithDanger(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {

					xMove = -speed * 15;
					if (this instanceof Player) {
						hurt();
					}
					setDirection();
					left = true;

				}

			} else if (xMove < 0) {// Moving left
				int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;

				if (collisionWithDanger(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
						&& collisionWithDanger(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
					xMove = speed * 15;
					if (this instanceof Player) {
						hurt();
					}
					setDirection();
					right = true;

				}
			}

			if (yMove < 0) {// Up
				int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;

				if (collisionWithDanger((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
						&& collisionWithDanger((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
					yMove = speed * 15;
					hurt();
					setDirection();
					down = true;
				}

			} else if (yMove > 0) {// Down
				int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

				if (collisionWithDanger((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
						&& collisionWithDanger((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
					yMove = -speed * 15;
					hurt();
					setDirection();
					up = true;
				}
			}
		}
	}
	
	/**
	 * Checks to see if the creature has stepped on a tile they can fall through.
	 * If so it tells them to fall and damages them.
	 */

	public void falling() {
		if (xMove > 0) {// Moving right
			int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;

			if (collisionWithDeepTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					&& collisionWithDeepTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
				if (!Running) {
					fallTimer.Start();
					w = 40;
					fall = true;
					xMove = -speed * 5;
					Running = true;

				}
			}

		} else if (xMove < 0) {// Moving left
			int tx = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;

			if (collisionWithDeepTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					&& collisionWithDeepTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
				if (!Running) {
					fallTimer.Start();
					w = -40;
					fall = true;
					xMove = speed * 5;
					Running = true;
				}
			}
		}

		if (yMove < 0) {// Up
			int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;

			if (collisionWithDeepTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
					&& collisionWithDeepTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
				if (!Running) {
					fallTimer.Start();
					h = -40;
					fall = true;
					yMove = speed * 5;
					Running = true;
				}
			}

		} else if (yMove > 0) {// Down
			int ty = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

			if (collisionWithDeepTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
					&& collisionWithDeepTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)) {
				if (!Running) {
					fallTimer.Start();
					h = 70;
					fall = true;
					yMove = -speed * 5;
					Running = true;

				}
			}
		}

		if (fallTimer.run(.75f) && fall) {
			h = 0;
			w = 0;
			hurt();
			Running = false;
			fall = false;
			setFrame = true;
		}
	}

	/**
	 * Checks to see if a creature has stepped on a tile that they can slide across
	 * if they have they are told to slide.
	 */
	public void sliding() {
		int tx = (int) (x + xMove + bounds.x + bounds.width) / Tile.TILEWIDTH;
		int tx2 = (int) (x + xMove + bounds.x) / Tile.TILEWIDTH;
		int ty = (int) (y + yMove + bounds.y) / Tile.TILEHEIGHT;
		int ty2 = (int) (y + yMove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

		if (!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
				|| !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)
				|| !collisionWithTile(tx2, (int) (y + bounds.y) / Tile.TILEHEIGHT)
				|| !collisionWithTile(tx2, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)
				|| !collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
				|| !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)
				|| !collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty2)
				|| !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty2)) {

			if (collisionWithSlideTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					|| collisionWithSlideTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)
					|| collisionWithSlideTile(tx2, (int) (y + bounds.y) / Tile.TILEHEIGHT)
					|| collisionWithSlideTile(tx2, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)
					|| collisionWithSlideTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty)
					|| collisionWithSlideTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)
					|| collisionWithSlideTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty2)
					|| collisionWithSlideTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty2)) {
				this.slide = true;
			} else {
				this.slide = false;
			}
		}
	}
	
	/**
	 * These methods check the tiles based on their key to see their attributes,
	 */

	protected boolean collisionWithTile(int x, int y) {
		return handler.getWorld().returnTile().isSolid(handler.getWorld().getTile(x, y));
	}

	protected boolean collisionWithDeepTile(int x, int y) {
		return handler.getWorld().returnTile().isDeep(handler.getWorld().getTile(x, y));
	}

	protected boolean collisionWithSlideTile(int x, int y) {
		return handler.getWorld().returnTile().isSlide(handler.getWorld().getTile(x, y));
	}

	protected boolean collisionWithDanger(int x, int y) {
		return handler.getWorld().returnTile().isHurtful(handler.getWorld().getTile(x, y));
	}
	
	public void hurt(){
		
	}


	// GETTERS SETTERS
	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

}
