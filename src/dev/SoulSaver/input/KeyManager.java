package dev.SoulSaver.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * This class sets up the keys that are used in the game
 *
 */
public class KeyManager implements KeyListener {

	private boolean[] keys;
	public boolean up, down, left, right, slot1, slot2, attack, interact, enter, pause, esc, save, saveQ;
	private static Character lastKey = null;

	public KeyManager() {
		keys = new boolean[256];
	}

	public void tick() {
		up = keys[KeyEvent.VK_W] || keys[KeyEvent.VK_UP];
		down = keys[KeyEvent.VK_S] || keys[KeyEvent.VK_DOWN];
		left = keys[KeyEvent.VK_A] || keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_D]|| keys[KeyEvent.VK_RIGHT];
		attack = keys[KeyEvent.VK_F];
		slot1 = keys[KeyEvent.VK_Q];
		slot2 = keys[KeyEvent.VK_E];
		interact = keys[KeyEvent.VK_SPACE];
		pause = keys[KeyEvent.VK_P];
		esc = keys[KeyEvent.VK_ESCAPE];
		enter = keys[KeyEvent.VK_ENTER];
		save = keys[KeyEvent.VK_1];
		saveQ = keys[KeyEvent.VK_2];

	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	public void isPressed(){
		
	}
	
	public void isHeld(){
		
	}
	
	public void isReleased(){
		
	}
	
	public void set(int k , boolean b){
		//for(int i = 0; i < numKeys; i ++)
			
	}

}
