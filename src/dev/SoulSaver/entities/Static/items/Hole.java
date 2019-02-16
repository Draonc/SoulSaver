package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.tiles.Tile;

public class Hole extends StaticEntity {

	public Hole(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		// TODO Auto-generated constructor stub
	}
	
	public void action(){
		for(Entity e : handler.getWorld().getEntityManager().getEntities()){
			if(e.getCollisionBounds(0f, 0f).intersects(this.getRectangle()));
				if(e instanceof Player)
					((Player)e).hurt();
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

}
