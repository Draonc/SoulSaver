package dev.SoulSaver;

/**
 * This class is a handler. It allows the user to more easily access information within the code.
 * Using the handler class allows for a simple way to call methods, and classes within the code without
 * having to go through the main game class which allows coders to access information without searching through 
 * code that has nothing to do with what the need and potentially changing information.
 */

import dev.SoulSaver.data.LoadData;
import dev.SoulSaver.data.SaveData;
import dev.SoulSaver.display.HealthBar;
import dev.SoulSaver.display.Inventory;
import dev.SoulSaver.gfx.GameCamera;
import dev.SoulSaver.input.KeyManager;
import dev.SoulSaver.states.State;
import dev.SoulSaver.worlds.World;

public class Handler {
	
	private Game game;
	private World world;

	public Handler(Game game){
		this.game = game;
	}
	
	public SaveData save(){
		return game.save();
	}
	
	public LoadData load(){
		return game.load();
	}
	
	public GameCamera getGameCamera(){
		return game.getGameCamera();
	}
	
	public Inventory getInventory(){
		return game.getInventory();
	}
	
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}
	
	public HealthBar getHealthBar(){
		return game.getHealthBar();
	}
	
	public State getPauseState(){
		return game.getPauseState();
	}
	
	public int getWidth(){
		return game.getWidth();
	}
	
	public int getHeight(){
		return game.getHeight();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
	
}
