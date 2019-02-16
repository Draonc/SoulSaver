package dev.SoulSaver.entities.Static.items;

import java.awt.Color;
import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;

public class LightTarget extends StaticEntity{
	private boolean hit;
	private int id;

	public LightTarget(Handler handler, float x, float y, int id) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		hit = false;
		this.id = id;
	}
	
	public void action(){
		if(hit){
			for(Entity e : handler.getWorld().getEntityManager().getEntities()){
				if(e instanceof TempWall){
					if(((TempWall)e).checkID(id)){
						((TempWall)e).remove();
					}
				}
			}
		}
	}

	public void setHit(boolean b){
		hit = b;
	}
	@Override
	public void tick() {
		action();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.target,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
		
		g.setColor(Color.red);
		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
				(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}

}
