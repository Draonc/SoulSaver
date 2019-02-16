package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.Fire_IceWorld;
import dev.SoulSaver.worlds.World;



public class Fire_IceState extends State {
	
	private World world;
	
	public Fire_IceState(Handler handler){
		super(handler);
		world = new Fire_IceWorld(handler, "/worlds/FireIceWorld.txt", 10);
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
