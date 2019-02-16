package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.DigitalWorld;
import dev.SoulSaver.worlds.World;



public class DigitalState extends State {
	
	private World world;
	
	public DigitalState(Handler handler){
		super(handler);
		world = new DigitalWorld(handler, "/worlds/DigitalWorld.txt", 10);
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
