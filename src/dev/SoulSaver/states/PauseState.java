package dev.SoulSaver.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.creatures.Enemies.Key;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.Timer;

public class PauseState extends State {

	private static boolean pause, slot1;
	public static Timer timer;
	private int curOption, totOptions;

	public PauseState(Handler handler) {
		super(handler);

		pause = false;
		curOption = 0;
		timer = new Timer();
		totOptions = 6;

		JukeBox.load("/Music/PauseClose.wav", "PauseClose");
	}

	public static void setPause(boolean b) {
		pause = b;
	}

	public static boolean getPause() {
		return pause;
	}

	public Timer getTimer() {
		return timer;
	}

	@Override
	public void tick() {
		Input();
	}
	
	public void setSlot(boolean b){
		slot1 = b;
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.pauseBG, 0, 0, 1024, 768, null);

		if (handler.getInventory().isSwordP())
			g.drawImage(Assets.sword[0], (int) (Tile.TILEWIDTH * 2) + 22, (int) (Tile.TILEHEIGHT * 2.5) + 10,
					Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		if (handler.getInventory().isBoomP())
			g.drawImage(Assets.boomSwordFull, (int) (Tile.TILEWIDTH * 2) + 22, (int) (Tile.TILEHEIGHT * 4.5) + 10,
					Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		if (handler.getInventory().isBowP())
			g.drawImage(Assets.bowSword[0], (int) (Tile.TILEWIDTH * 5), (int) (Tile.TILEHEIGHT * 2.5) + 10,
					Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		if (handler.getInventory().isEleP())
			g.drawImage(Assets.fireIceSword, (int) (Tile.TILEWIDTH * 5) + 22, (int) (Tile.TILEHEIGHT * 4.5) + 10,
					Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		if (handler.getInventory().isShieldP())
			g.drawImage(Assets.shieldSwordDown, (int) (Tile.TILEWIDTH * 8) + 22, (int) (Tile.TILEHEIGHT * 2.5) + 10,
					Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		if (handler.getInventory().isFanP())
			g.drawImage(Assets.fanSword[2], (int) (Tile.TILEWIDTH * 8) + 10, (int) (Tile.TILEHEIGHT * 4.5) + 10,
					Tile.TILEWIDTH, Tile.TILEHEIGHT, null);

		g.setColor(Color.BLACK);
		g.setFont(new Font("Serif", Font.BOLD, 25));

		g.drawImage(Assets.key, (int) (Tile.TILEWIDTH * 3), (int) (Tile.TILEHEIGHT * 7.5), Tile.TILEWIDTH / 2,
				Tile.TILEHEIGHT, null);
		g.drawString(" X " + Key.getKeys(), Tile.TILEWIDTH * 4, (int) (Tile.TILEHEIGHT * 8.4));
		g.drawImage(Assets.potion, (int) (Tile.TILEWIDTH * 3), (int) (Tile.TILEHEIGHT * 9.5), Tile.TILEWIDTH,
				Tile.TILEHEIGHT, null);
		g.drawString(" X " + handler.getInventory().getPotions(), Tile.TILEWIDTH * 4, (int) (Tile.TILEHEIGHT * 10.4));
		g.drawImage(Assets.arrow, (int) (Tile.TILEWIDTH * 6), (int) (Tile.TILEHEIGHT * 7.5), Tile.TILEWIDTH,
				Tile.TILEHEIGHT, null);
		g.drawString(" X " + handler.getInventory().getArrows(), Tile.TILEWIDTH * 7, (int) (Tile.TILEHEIGHT * 8.25));
		g.drawImage(Assets.coin5, (int) (Tile.TILEWIDTH * 6), (int) (Tile.TILEHEIGHT * 9.5), Tile.TILEWIDTH,
				Tile.TILEHEIGHT, null);
		g.drawString(" X " + handler.getInventory().getCoins(), Tile.TILEWIDTH * 7, (int) (Tile.TILEHEIGHT * 10.4));

		g.setFont(new Font("Serif", Font.BOLD, 50));
		g.drawString(handler.getInventory().getSouls() + " ", (int) (Tile.TILEWIDTH * 12.5), Tile.TILEHEIGHT * 4);
		g.drawString((100 - handler.getInventory().getSouls()) + " ", (int) (Tile.TILEWIDTH * 12.5),
				Tile.TILEHEIGHT * 6);

		if (handler.getInventory().getSouls() >= 10)
			g.drawImage(Assets.buttonLeft, (int) (Tile.TILEWIDTH * 11.5), (Tile.TILEHEIGHT * 6) + 32, Tile.TILEWIDTH,
					Tile.TILEHEIGHT, null);
		if (handler.getInventory().getSouls() >= 20)
			g.drawImage(Assets.buttonUp, (int) (Tile.TILEWIDTH * 12.5), (Tile.TILEHEIGHT * 6) + 32, Tile.TILEWIDTH,
					Tile.TILEHEIGHT, null);
		if (handler.getInventory().getSouls() >= 30)
			g.drawImage(Assets.buttonRight, (int) (Tile.TILEWIDTH * 13.5), (Tile.TILEHEIGHT * 6) + 32, Tile.TILEWIDTH,
					Tile.TILEHEIGHT, null);
		if (handler.getInventory().getSouls() >= 40)
			g.drawImage(Assets.buttonA, (int) (Tile.TILEWIDTH * 11.5), (Tile.TILEHEIGHT * 7) + 16, Tile.TILEWIDTH,
					Tile.TILEHEIGHT, null);
		if (handler.getInventory().getSouls() >= 50)
			g.drawImage(Assets.buttonB, (int) (Tile.TILEWIDTH * 12.5), (Tile.TILEHEIGHT * 7) + 16, Tile.TILEWIDTH,
					Tile.TILEHEIGHT, null);
		if (handler.getInventory().getSouls() >= 60)
			g.drawImage(Assets.buttonLeft, (int) (Tile.TILEWIDTH * 13.5), (Tile.TILEHEIGHT * 7) + 16, Tile.TILEWIDTH,
					Tile.TILEHEIGHT, null);
		if (handler.getInventory().getSouls() >= 70)
			g.drawImage(Assets.buttonDown, (int) (Tile.TILEWIDTH * 11.5), Tile.TILEHEIGHT * 8, Tile.TILEWIDTH,
					Tile.TILEHEIGHT, null);
		if (handler.getInventory().getSouls() >= 80)
			g.drawImage(Assets.buttonUp, (int) (Tile.TILEWIDTH * 12.5), Tile.TILEHEIGHT * 8, Tile.TILEWIDTH,
					Tile.TILEHEIGHT, null);
		if (handler.getInventory().getSouls() >= 90)
			g.drawImage(Assets.buttonDown, (int) (Tile.TILEWIDTH * 13.5), Tile.TILEHEIGHT * 8, Tile.TILEWIDTH,
					Tile.TILEHEIGHT, null);
		if (handler.getInventory().getSouls() >= 100)
			g.drawImage(Assets.buttonRight, (int) (Tile.TILEWIDTH * 12.5), (Tile.TILEHEIGHT * 9) - 16, Tile.TILEWIDTH,
					Tile.TILEHEIGHT, null);
		if (slot1) {
			if (curOption == 0 /* && handler.getInventory().isSwordP() */) {
				g.drawImage(Assets.selectionBox, (int) (Tile.TILEWIDTH * 2), (int) (Tile.TILEHEIGHT * 2.5),
						Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
			} // else{
				// curOption++;
				// }

			if (curOption == 1 /* && handler.getInventory().isBoomP() */) {
				g.drawImage(Assets.selectionBox, (int) (Tile.TILEWIDTH * 2), (int) (Tile.TILEHEIGHT * 4.5),
						Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
			} // else{
				// curOption++;
				// }

			if (curOption == 2 /* && handler.getInventory().isBowP() */) {
				g.drawImage(Assets.selectionBox, (int) (Tile.TILEWIDTH * 5), (int) (Tile.TILEHEIGHT * 2.5),
						Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
			} // else{
				// curOption++;
				// }

			if (curOption == 3 /* && handler.getInventory().isEleP() */) {
				g.drawImage(Assets.selectionBox, (int) (Tile.TILEWIDTH * 5), (int) (Tile.TILEHEIGHT * 4.5),
						Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
			} // else{
				// curOption++;
				// }

			if (curOption == 4 /* && handler.getInventory().isShieldP() */) {
				g.drawImage(Assets.selectionBox, (int) (Tile.TILEWIDTH * 8), (int) (Tile.TILEHEIGHT * 2.5),
						Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
			} // else{
				// curOption++;
				// }

			if (curOption == 5 /* && handler.getInventory().isFanP() */) {
				g.drawImage(Assets.selectionBox, (int) (Tile.TILEWIDTH * 8) + 10, (int) (Tile.TILEHEIGHT * 4.5) + 10,
						Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
			} // else{
				// curOption++;
				// }

		}

	}

	private void removeEquipped() {
		if (slot1) {
			handler.getInventory().setSword(false);
			handler.getInventory().setEle(false);
			handler.getInventory().setShield(false);
			handler.getInventory().setBoom(false);
			handler.getInventory().setBow(false);
			handler.getInventory().setFan(false);
		}
	}

	private void selectOption() {
		if (slot1) {
			if (curOption == 0) {
				// if (handler.getInventory().isSwordP()){
				handler.getInventory().setSword(true);
				// }
			}

			if (curOption == 3) {
				if (handler.getInventory().isEleP())
					handler.getInventory().setEle(true);
			}

			if (curOption == 4) {
				if (handler.getInventory().isShieldP())
					handler.getInventory().setShield(true);
			}

			if (curOption == 1) {
				if (handler.getInventory().isBoomP()){
					handler.getInventory().setBoom(true);
				System.out.println("Test");
				}
			}

			if (curOption == 2) {
				if (handler.getInventory().isBowP())
					handler.getInventory().setBow(true);
			}

			if (curOption == 5) {
				if (handler.getInventory().isFanP())
					handler.getInventory().setFan(true);
			}
		}

		handler.getGame().setPaused(false);
	}

	public void Input() {
		if(handler.getKeyManager().save){
			handler.save().Save();
		}
		
		if(handler.getKeyManager().saveQ){
			handler.save().Save();
			System.exit(0);
		}
		
		if (handler.getKeyManager().slot1) {
			curOption = 0;
			slot1 = true;
		}

		if (handler.getKeyManager().pause && timer.run(.5f)) {
			handler.getWorld().getEntityManager().getPlayer().getTimer().Start();
			handler.getGame().setPaused(false);
			JukeBox.play("PauseClose");
		}

		if (handler.getKeyManager().up && curOption > 0 && timer.run(.5f)) {
			curOption--;
			timer.Start();
		}

		if (handler.getKeyManager().down && curOption < totOptions && timer.run(.5f)) {
			curOption++;
			timer.Start();
		}

		if (handler.getKeyManager().enter && timer.run(.5f)) {
			removeEquipped();
			selectOption();
		}
	}

}
