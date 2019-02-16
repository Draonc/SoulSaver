package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.ForestWorld;
import dev.SoulSaver.worlds.World;



public class ForestState extends State {
	
	private World world;
	
	public ForestState(Handler handler){
		super(handler);
		world = new ForestWorld(handler, "/worlds/ForestWorld.txt", 10);
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
