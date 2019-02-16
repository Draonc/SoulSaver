package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.DungeonWorld;
import dev.SoulSaver.worlds.World;



public class DungeonState extends State {
	
	private World world;
	
	public DungeonState(Handler handler){
		super(handler);
		world = new DungeonWorld(handler, "/worlds/DungeonWorld.txt", 10);
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
