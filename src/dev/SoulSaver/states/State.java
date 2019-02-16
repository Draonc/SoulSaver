package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.utils.Timer;



public abstract class State {

	private static State currentState = null;
	protected Timer timer;
	protected String path;
	
	
	//clears the current state and sets the new one
	public static void setState(State state){
		currentState = null;
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	//CLASS
	
	protected Handler handler;
	
	public State(Handler handler){
		this.handler = handler;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics2D g);
	
}

