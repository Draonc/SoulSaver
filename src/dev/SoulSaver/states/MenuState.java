package dev.SoulSaver.states;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Game;
import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.data.LoadData;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.Timer;
import dev.SoulSaver.worlds.InsideHouse;

public class MenuState extends State {

	private int curOption, totOption, width, height;
	private Boolean newGame;
	
	private Animation male1Anim, male2Anim, female1Anim, female2Anim;

	public MenuState(Handler handler) {
		super(handler);
		timer = new Timer();
		timer.Start();
		newGame = false;
		
		width = 64;
		height = 64;
		
		male1Anim = new Animation(300, Assets.player_downM1);
		male2Anim = new Animation(300, Assets.player_downTessema);
		female1Anim = new Animation(300, Assets.player_downF1);
		female2Anim = new Animation(300, Assets.player_downF2);
	}

	public void setOptions() {
		if (!newGame) {
			totOption = 1;
		} else
			totOption = 3;
	}

	@Override
	public void tick() {
		male1Anim.tick();
		male2Anim.tick();
		female1Anim.tick();
		female2Anim.tick();
		
		input();
		setOptions();
	}

	@Override
	public void render(Graphics2D g) {
		if (!newGame) {
			g.drawImage(Assets.menuBG, 0, 0, 1024, 768, null);

			if (curOption == 0)
				g.drawImage(Assets.selectionBox, 365, 390, 325, 75, null);
			else if (curOption == 1)
				g.drawImage(Assets.selectionBox, 365, 515, 325, 75, null);
		} else {
			g.drawImage(Assets.menuBGCS, 0, 0, 1024, 768, null);

			if (curOption == 0){
				g.drawImage(getCurrentAnimation(), 384, 288, width, height, null);
				g.drawImage(male2Anim.getImage(1), 640, 288, width, height, null);
				g.drawImage(female1Anim.getImage(1), 384, 484, width, height, null);
				g.drawImage(female2Anim.getImage(1), 640, 484, width, height, null);
				g.drawImage(Assets.selectionBox, 379, 283, 74, 74, null);
			}
			else if (curOption == 1){
				g.drawImage(male1Anim.getImage(1), 384, 288, width, height, null);
				g.drawImage(getCurrentAnimation(), 640, 288, width, height, null);
				g.drawImage(female1Anim.getImage(1), 384, 484, width, height, null);
				g.drawImage(female2Anim.getImage(1), 640, 484, width, height, null);
				g.drawImage(Assets.selectionBox, 635, 283, 74, 74, null);
			}
			else if (curOption == 2){
				g.drawImage(male1Anim.getImage(1), 384, 288, width, height, null);
				g.drawImage(male2Anim.getImage(1), 640, 288, width, height, null);
				g.drawImage(getCurrentAnimation(), 384, 484, width, height, null);
				g.drawImage(female2Anim.getImage(1), 640, 484, width, height, null);
				g.drawImage(Assets.selectionBox, 379, 479, 74, 74, null);
			}
			else if (curOption == 3){
				g.drawImage(male1Anim.getImage(1), 384, 288, width, height, null);
				g.drawImage(male2Anim.getImage(1), 640, 288, width, height, null);
				g.drawImage(female1Anim.getImage(1), 384, 484, width, height, null);
				g.drawImage(getCurrentAnimation(), 640, 484, width, height, null);
				g.drawImage(Assets.selectionBox, 635, 479, 74, 74, null);
			}
		}

	}
	
	
	private BufferedImage getCurrentAnimation() {
		BufferedImage image = null;
		if (newGame && curOption==0) {
			image = male1Anim.getCurrentFrame();
		} else if (newGame && curOption == 1) {
			image = male2Anim.getCurrentFrame();
		} else if (newGame && curOption ==2){
			image = female1Anim.getCurrentFrame();
		} else if (newGame && curOption == 3) {
			image = female2Anim.getCurrentFrame();
		}
		return image;
	}
	
	
	
	

	private void input() {
		if (handler.getKeyManager().up && curOption > 0 && timer.run(.5f)) {
			curOption--;
			timer.Start();
			JukeBox.play("Move");
		}

		if (handler.getKeyManager().down && curOption < totOption && timer.run(.5f)) {
			curOption++;
			timer.Start();
			JukeBox.play("Move");
		}

		if (handler.getKeyManager().enter && timer.run(.5f)) {
			selectOption();
			timer.Start();
			curOption = 0;
			JukeBox.play("Select");
		}
	}

	private void selectOption() {
		if (!newGame) {
			if (curOption == 0)
				newGame = true;

			if (curOption == 1) {
				handler.load().Load();
				InsideHouse.setLocation(5);
				State.setState(new InsideHouseState(handler));
			}
		} else {
			if (curOption == 0) {
				Game.setMale1(true);
				InsideHouse.setLocation(5);
				State.setState(new InsideHouseState(handler));
			}
			if (curOption == 1) {
				Game.setMale2(true);
				InsideHouse.setLocation(5);
				State.setState(new InsideHouseState(handler));
			}
			if (curOption == 2) {
				Game.setFemale1(true);
				InsideHouse.setLocation(5);
				State.setState(new InsideHouseState(handler));
			}

			if (curOption == 3) {
				Game.setFemale2(true);
				InsideHouse.setLocation(5);
				State.setState(new InsideHouseState(handler));
			}
		}

	}
}
