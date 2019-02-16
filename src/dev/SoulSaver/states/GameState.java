package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.OverWorld;
import dev.SoulSaver.worlds.World;



public class GameState extends State {
	
	private World world;
	
	public GameState(Handler handler){
		super(handler);
		world = new OverWorld(handler, "/worlds/OverWorld.txt", 10);
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
