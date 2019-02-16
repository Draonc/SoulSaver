package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.worlds.InsideHouse;
import dev.SoulSaver.worlds.World;

public class InsideHouseState extends State{
	private World world;

	public InsideHouseState(Handler handler) {
		super(handler);
		world =  new InsideHouse(handler, "/worlds/InsideHouses.txt", 0);
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
