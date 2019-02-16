package dev.SoulSaver.entities.Swords;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.Timer;

public abstract class Weapon extends Creature {
	protected Boolean upD, leftD, rightD, downD, equipped, purchased;
	protected int xD,yD, rotate;
	protected Timer timer, hurtTimer;

	public Weapon(Handler handler) {
		super(handler, 0, 0, Tile.TILEWIDTH, Tile.TILEHEIGHT, 100);
		timer = new Timer();
		hurtTimer = new Timer();
		leftD=false;
		rightD=false;
		upD=false;
		downD=true;
		equipped=false;
		purchased=false;
	}

	//Sets the direction of the sword
	public void getDirection(){
		upD=handler.getWorld().getEntityManager().getPlayer().isUp();
		leftD=handler.getWorld().getEntityManager().getPlayer().isLeft();
		rightD=handler.getWorld().getEntityManager().getPlayer().isRight();
		downD=handler.getWorld().getEntityManager().getPlayer().isDown();
	}
	
	public void attack(){
		for(Entity e : handler.getWorld().getEntityManager().getEntities()){
			if(e instanceof NPC){
				if(e.getCollisionBounds(0f, 0f).intersects(this.getRectangle())){
					((NPC)e).damage();
				}
			}
		}
	}
	
	public Boolean isEquipped(){
		return equipped;
	}
	
	public void setEquipped(boolean b){
		equipped=b;
	}
	
	public Boolean Purchased(){
		return purchased;
	}
	
	public void setPurchased(boolean b){
		purchased=b;
	}
	
	public abstract void setPosition();

	@Override
	public abstract void tick();

	@Override
	public abstract void render(Graphics2D g);

}
