package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;
import java.util.Random;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.utils.Timer;

public abstract class Items extends StaticEntity {
	private Random rand;
	protected Timer timer;

	public Items(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		rand = new Random();
		
		timer = new Timer();
	}
	
	public void remove(){
		handler.getWorld().getEntityManager().removeEntity(this);
	}
	
	public abstract void action();
	
	@Override
	public abstract void tick();

	@Override
	public abstract void render(Graphics2D g);

}
