package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.CreaturesUtil;

public class LaserBeam extends NPC {
	private int rotation;
	private boolean left, right;
	private BufferedImage image;

	public LaserBeam(Handler handler, float x, float y, int world,boolean left, boolean right) {
		super(handler, x, y, 1f, false, 100);
		timer.Start();
		
		this.world=world;
		this.left=left;
		this.right=right;
		setAnimation(world);
	}

	@Override
	public void action() {
			xMove = 0;
			yMove = 0;
		
		if (this.getCollisionBounds(0f, 0f).intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle()) && timer.run(.8f)) {
			handler.getWorld().getEntityManager().getPlayer().hurt();
			timer.Start();
		}

		if (CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32,	y + 32) > 100) {
			active=false;
		}
	}
	
	public void setPosition(){
		if(left || right){
			rotation=90;
		}else {
			rotation=0;
		}
	}

	public void setAnimation(int world) {
		switch (world) {
		case 1:
			// Maze
			image = Assets.sandLaser;
			break;
		case 2:
			// Fire-ice
			image = Assets.iceLaser;
			break;
		case 3:
			// Swamp
			break;
		case 4:
			// Mansion
			image = Assets.pictureLaser;
			break;
		case 5:
			// Ship
			image = Assets.cannonLaser;
			break;
		case 6:
			// Dungeon
			image = Assets.dungeonLaser;
			break;
		case 7:
			// Forest
			image = Assets.treeLaser;
			break;
		case 8:
			// Sky
			image = Assets.rainLaser;
			break;
		case 9:
			//Digital
			image = Assets.digitalLaser;
			break;
		}
	}

	@Override
	public void tick(){
		action();
		move();

	}

	@Override
	public void render(Graphics2D g) {
		
		AffineTransform at=AffineTransform.getTranslateInstance((int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()));
		at.rotate(Math.toRadians(rotation));
		at.scale(2, 2);
		
		g.drawImage(image,at,null);
	}
}