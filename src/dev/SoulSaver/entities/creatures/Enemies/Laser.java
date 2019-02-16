
package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.CreaturesUtil;

public class Laser extends NPC{
	private float pX, pY;

	public Laser(Handler handler, float x, float y, int world) {
		super(handler, x, y, .7f, false, 4);
		this.world = world;
		
		timer.Start();
		
		setAnimation(world);
	}

	@Override
	public void tick() {
		shootBeam();
	}
	
	public void shootBeam(){
		if(CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 32,	y + 32) < 100){
			setDirection();
			handler.getWorld().getEntityManager().addEntity(new LaserBeam(handler, pX, pY, world, left, right));
			timer.Start();
		}		
	}
	
	public void setDirection(){
		if (left) {
			pX = this.x - 64;
			pY = this.y;
		} else if (right) {
			pX = this.x + 64;
			pY = this.y;
		} else if (up) {
			pX = this.x;
			pY = this.y - 64;
		} else {
			pX = this.x;
			pY = this.y + 64;
		}
	}

	@Override
	public void setAnimation(int world) {
		switch (world) {
		case 1:
			//Maze
			break;
		case 2:
			//Fire-ice
			break;
		case 3:
			//Swamp
			break;
		case 4:
			//Mansion
			break;
		case 5:
			//Ship
			break;
		case 6:
			//Dungeon
			break;
		case 7:
			//Forest
			break;
		case 8:
			//Sky
			break;
		case 9:
			break;
		}
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

	}

}
