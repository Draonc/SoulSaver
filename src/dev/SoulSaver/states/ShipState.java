package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.ShipWorld;
import dev.SoulSaver.worlds.World;



public class ShipState extends State {
	
	private World world;
	
	public ShipState(Handler handler){
		super(handler);
		world = new ShipWorld(handler, "/worlds/ShipWorld.txt", 10);
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
