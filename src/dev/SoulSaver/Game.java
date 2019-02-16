package dev.SoulSaver;

import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.data.LoadData;
import dev.SoulSaver.data.Music;
import dev.SoulSaver.data.SaveData;
import dev.SoulSaver.display.Display;
import dev.SoulSaver.display.HealthBar;
import dev.SoulSaver.display.Inventory;
import dev.SoulSaver.display.PrintScreen;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.gfx.GameCamera;
import dev.SoulSaver.input.KeyManager;
import dev.SoulSaver.states.GameOverState;
import dev.SoulSaver.states.GameState;
import dev.SoulSaver.states.IntroState;
import dev.SoulSaver.states.MenuState;
import dev.SoulSaver.states.PauseState;
import dev.SoulSaver.states.State;

/**
 * This is the class that contains overall information for the whole game.
 * It also contains the game loop, the display, and initializes the game.
 * Implements runnable to have the run method.
 */
public class Game implements Runnable {

	private Display display;
	private int width, height;
	private String title;

	private boolean running = false;
	private static boolean paused, male1, male2, female1, female2;

	private Thread thread;


	private BufferStrategy bs;
	private Graphics2D g;
	private HealthBar healthbar;
	private PrintScreen printScreen;
	
	private Music music;

	// States
	public static State menuState;
	public static State pauseState;
	public static State introState;
	public static State gameOver;

	// Input
	private KeyManager keyManager;

	// Camera
	private GameCamera gameCamera;

	// Handler
	private Handler handler;
	
	private Inventory inventory;
	
	private SaveData save;
	private LoadData load;

	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		inventory = new Inventory();
		paused = false;
		
		male1=false;
		male2=false;
		female1=false;
		female2=false;
		
	
	}

	/**
	 * This method initializes the programs needed to start the game.
	 * 
	 * Important things: The display, the key listener, the Assets, the Jukebox, and setting the first state.
	 */
	private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		JukeBox.init();
		handler = new Handler(this);
		healthbar = new HealthBar(handler, 100, 10);
		printScreen = new PrintScreen(handler, 0, 0);
		music = new Music();
		save = new SaveData(handler);
		load = new LoadData(handler);

		gameCamera = new GameCamera(handler, 0, 0);

		menuState = new MenuState(handler);
		pauseState = new PauseState(handler);
		introState = new IntroState(handler);
		gameOver = new GameOverState(handler);
		State.setState(introState);
	}

	public HealthBar getHealthBar() {
		return healthbar;
	}

	public void setHealthBar(HealthBar healthbar) {
		this.healthbar=healthbar;
	}
	
	public PrintScreen getPrintScreen(){
		return printScreen;
	}
	
	public void setPrintScreen(PrintScreen printScreen){
		this.printScreen = printScreen;
	}
	
	/**
	 * Tick methods contain the methods that need to be called constantly. 
	 * The methods listed in the tick method are called 60 times per second.
	 */

	private void tick() {
		keyManager.tick();
		states();
	}
	
	
	/**
	 * Checks to see if the game has been paused if true then it sets the pause state.
	 * If not it returns to the previous state.
	 */
	private void states(){
		if (paused) {
			pauseState.tick();
		} else if (State.getState() != null)
			State.getState().tick();
		
	}
	
	/**
	 *This is the method that renders drawings to the screen.
	 *The render method is called 60 times per second so the drawings
	 *are constantly updated. 
	 *
	 *This specific render draws the canvas and adds a triple buffer strategy.
	 *It also clears the old images at the end so the new images are not just drawn on top.
	 */

	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = (Graphics2D) bs.getDrawGraphics();
		// Clear Screen
		g.clearRect(0, 0, width, height);
		// Draw Here!

		if (paused) {
			pauseState.render(g);
		} else if (State.getState() != null)
			State.getState().render(g);

		// End Drawing!
		bs.show();
		g.dispose();

	}
	
	/**
	 * This is the game loop. It keeps the game running at a constant 60
	 * frames per second if possible.
	 */

	public void run() {

		init();

		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;

		while (running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;

			if (delta >= 1) {
				tick();
				render();
				ticks++;
				delta--;
			}

			if (timer >= 1000000000) {
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}

		stop();

	}

	public KeyManager getKeyManager() {
		return keyManager;
	}

	public GameCamera getGameCamera() {
		return gameCamera;
	}
	
	public Inventory getInventory(){
		return inventory;
	}
	
	public SaveData save(){
		return save;
	}
	
	public LoadData load(){
		return load;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	/**
	 * Tests to see if the game is running if not it starts the thread.
	 * If the game is running it ignores this.
	 */

	public synchronized void start() {
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
		if (!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public State getPauseState(){
		return pauseState;
	}

	public boolean isPaused() {
		return paused;
	}

	public static void setPaused(boolean b) {
		paused = b;
	}

	public static boolean isMale1() {
		return male1;
	}

	public static void setMale1(boolean male1) {
		Game.male1 = male1;
	}

	public static boolean isMale2() {
		return male2;
	}

	public static void setMale2(boolean male2) {
		Game.male2 = male2;
	}

	public static boolean isFemale1() {
		return female1;
	}

	public static void setFemale1(boolean female1) {
		Game.female1 = female1;
	}

	public static boolean isFemale2() {
		return female2;
	}

	public static void setFemale2(boolean female2) {
		Game.female2 = female2;
	}

}