package dev.SoulSaver.display;

import java.awt.Font;
import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.Timer;

public class HealthBar {

	private Handler handler;
	private static int curHealth;
	private int totHealth;
	private static int width;
	private static int height;
	private static boolean print = false;
	private static Timer timer = new Timer();
	private static Boolean hurt;

	Font myFont = new Font("Serif", Font.BOLD, 30);

	public HealthBar(Handler handler, float x, float y) {
		this.handler = handler;
		totHealth = 3;
		curHealth = totHealth;
		width = 48;
		height = 48;
		hurt = false;
	}

	public void incHealth() {
		++curHealth;
		++totHealth;
		if (curHealth > totHealth)
			curHealth = totHealth;
	}

	private void death() {
		if (curHealth == 0) {
			//JukeBox.close("/Music/DrowningBG.mp3");
			//JukeBox.close("/Music/HeightsBG.mp3");
			//JukeBox.close("/Music/HeightsBG.mp3");
			//JukeBox.close("/Music/DeathBG.mp3");
			//JukeBox.close("/Music/FailureBG.mp3");
			//JukeBox.close("/Music/ForgottenBG.mp3");
			//JukeBox.close("/Music/CrumbleBG.mp3");
			//JukeBox.close("/Music/InjuryBG.mp3");
			//JukeBox.close("/Music/LostBG.mp3");
			//JukeBox.close("/Music/RiddleBG.mp3");
			//JukeBox.close("/Music/BGMusic.mp3");
			//JukeBox.load("/Music/GameOverBG.mp3", "GOBG");
			//JukeBox.setVolume("GOBG", -10);
			//JukeBox.loop("GOBG");
		}
	}

	public void replenish(int value) {
		curHealth = curHealth + value;
		if (curHealth > totHealth)
			curHealth = totHealth;
	}

	public void decHealth() {
		JukeBox.play("Hurt");
		--curHealth;
		if (curHealth < 0)
			curHealth = 0;

		hurt = true;
	}

	public static Boolean getHurt() {
		return hurt;
	}

	public static void setHurt(Boolean b) {
		hurt = b;
	}

	public static int getCurHealth() {
		return curHealth;
	}

	public int getTotHealth() {
		return totHealth;
	}

	public void inCurHealth() {
		curHealth++;
	}

	public void incTotHealth() {
		totHealth++;
	}
	
	public void setTotHealth(int health){
		this.totHealth = health;
	}
	
	public void setCurHealth(int health){
		this.curHealth = health;
	}

	public static void setPrint(Boolean b) {
		print = b;
	}

	public static boolean getPrint() {
		return print;
	}

	public void tick() {
		death();
	}

	public void render(Graphics2D g) {
		
		if (curHealth <= 11) {
			for (int i = 0; i < curHealth; i++) {
				g.drawImage(Assets.heartFull, 100 + ((width / 2) * i), 10, width / 2, height / 2, null);
			}
		}

		if (curHealth > 8) {
			for (int i = 0; i < 11; i++) {
				g.drawImage(Assets.heartFull, 100 + ((width / 2) * i), 10, width / 2, height / 2, null);
			}

			for (int i = 0; i < curHealth - 11; i++) {
				g.drawImage(Assets.heartFull, 100 + ((width / 2) * i), 32, width / 2, height / 2, null);
			}

		}

		if (totHealth <= 11) {
			for (int i = 0; i < totHealth; i++) {
				g.drawImage(Assets.heartEmpty, 100 + ((width / 2) * i), 10, width / 2, height / 2, null);
			}
		}

		if (totHealth > 11) {
			for (int i = 0; i < 11; i++) {
				g.drawImage(Assets.heartEmpty, 100 + ((width / 2) * i), 10, width / 2, height / 2, null);
			}

			for (int i = 0; i < totHealth - 11; i++) {
				g.drawImage(Assets.heartEmpty, 100 + ((width / 2) * i), 10, width / 2, height / 2, null);
			}

		}
		//if (print) {
		//	g.drawImage(Assets.textBox, 0, 640, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 2, null);
		//	g.setColor(Color.BLACK);
		//	g.setFont(new Font("Serif", Font.BOLD, 30));
		//	g.drawString("You have found courage", 350, 710);
		//	if (timer.run(2))
		//		print = false;
		//}
	}

	public static Timer getTimer() {
		return timer;
	}
}
