package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.MansionWorld;
import dev.SoulSaver.worlds.World;



public class MansionState extends State {
	
	private World world;
	
	public MansionState(Handler handler){
		super(handler);
		world = new MansionWorld(handler, "/worlds/MansionWorld.txt", 10);
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
