package dev.SoulSaver.states;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.data.SaveData;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.Timer;
import dev.SoulSaver.worlds.OverWorld;

public class GameOverState extends State {

	private int curOption;
	private Timer timer;
	private Boolean save = false, exit = false, done = false;
	private SaveData data;

	public GameOverState(Handler handler) {
		super(handler);
		timer = new Timer();
		timer.Start();
		curOption = 0;
		handler.getHealthBar().replenish(3);
		
		JukeBox.stop("BG");
		JukeBox.stop("BG1");
		JukeBox.stop("BG2");
		JukeBox.stop("BG3");
		JukeBox.stop("BG4");
		JukeBox.stop("BG5");
		JukeBox.stop("BG6");
		JukeBox.stop("BG7");
		JukeBox.stop("BG8");
		JukeBox.stop("BG9");
		
		JukeBox.load("/Music/GameOverBG.mp3", "BG10");
		JukeBox.setVolume("BG10", -10);
		JukeBox.loop("BG10");
		
	}

	@Override
	public void tick() {
		handler.getHealthBar().tick();
		input();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.gameOverBG, 0, 0, 1024, 763, null);
		if (curOption == 0)
			g.drawImage(Assets.selectionBox, 325, 318, 370, 40, null);
		else if (curOption == 1)
			g.drawImage(Assets.selectionBox, 373, 436, 275, 40, null);
		else if (curOption == 2)
			g.drawImage(Assets.selectionBox, 457, 552, 113, 40, null);

	}

	private void input() {
		if (handler.getKeyManager().up && curOption > 0 && timer.run(.5f)) {
			curOption--;
			timer.Start();
		}

		if (handler.getKeyManager().down && curOption < 2 && timer.run(.5f)) {
			curOption++;
			timer.Start();
		}

		if (handler.getKeyManager().enter && timer.run(.5f)){
			selectOption();
			curOption = 0;
		}
			
	}

	private void selectOption() {
			if (curOption == 0){
				handler.save().Save();
				State.setState(new GameState(handler));
			}
			
			if (curOption == 1){
				handler.save().Save();
				System.exit(0);
			}	
			
			if (curOption == 2)
				System.exit(0);	
	}
}
