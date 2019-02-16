package dev.SoulSaver.entities.Static;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Entity;

public abstract class StaticEntity extends Entity {
	
	public StaticEntity(Handler handler, float x, float y, int width, int height){
		super(handler, x, y, width, height, 100);
		
		bounds.x = 0;
		bounds.y = 15;
		bounds.width = 64;
		bounds.height = 49;
	}

}
