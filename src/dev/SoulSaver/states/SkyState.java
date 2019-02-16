package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.SkyWorld;
import dev.SoulSaver.worlds.World;



public class SkyState extends State {
	
	private World world;
	
	public SkyState(Handler handler){
		super(handler);
		world = new SkyWorld(handler, "/worlds/SkyWorld.txt", 10);
		handler.setWorld(world);
	}
	
	@Override
	public void tick() {
		world.tick();
	}

	@Override
	public void render(Graphics2D g) {
		world.render(g);
	}

}
