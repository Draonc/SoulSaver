package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.SwampWorld;
import dev.SoulSaver.worlds.World;



public class SwampState extends State {
	
	private World world;
	
	public SwampState(Handler handler){
		super(handler);
		world = new SwampWorld(handler, "/worlds/SwampWorld.txt", 10);
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
