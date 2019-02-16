package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.MazeWorld;
import dev.SoulSaver.worlds.World;



public class MazeState extends State {
	
	private World world;
	
	public MazeState(Handler handler){
		super(handler);
		world = new MazeWorld(handler, "/worlds/MazeWorld.txt", 10);
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
