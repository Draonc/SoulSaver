package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.Timer;

public class MTrail extends NPC{
	private int rotation;
	private boolean left, right, ice;
	private BufferedImage image;
	private Timer timer2;

	public MTrail(Handler handler, float x, float y, int world,boolean left, boolean right, boolean ice) {
		super(handler, x, y, 1f, false, 100);
		timer2= new Timer();
		
		timer.Start();
		timer2.Start();
		
		this.world=world;
		this.left=left;
		this.right=right;
		this.ice=ice;
		setAnimation(world);
		setPosition();
	}

	@Override
	public void action() {
			xMove = 0;
			yMove = 0;
		
		if (this.getCollisionBounds(0f, 0f).intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle()) && timer.run(.8f)) {
			handler.getWorld().getEntityManager().getPlayer().hurt();
			timer.Start();
		}

		if (timer2.run(1.5f)) {
			active=false;
		}
	}
	
	public void setPosition(){
		if(left || right){
			rotation=0;
		}else {
			rotation=90;
		}
	}

	public void setAnimation(int world) {
		switch (world) {
		case 1:
			// Maze
			image = Assets.sandTrail;
			break;
		case 2:
			// Fire-ice
			if(ice)
			image = Assets.iceTrail;
			else
				image=Assets.fireTrail;
			break;
		case 3:
			// Swamp
			image = Assets.swampTrail;
			break;
		case 4:
			// Mansion
			image=Assets.ghostTrail;
			break;
		case 5:
			// Ship
			image = Assets.swampTrail;
			break;
		case 6:
			// Dungeon
			break;
		case 7:
			// Forest
			image = Assets.slugTrail;
			break;
		case 8:
			// Sky
			image = Assets.cloudTrail;
			break;
		case 9:
			//Digital
			image = Assets.tronBikeTrail;
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

