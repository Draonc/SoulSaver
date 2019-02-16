package dev.SoulSaver.display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.Dialogues.Dialogue;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.Timer;

public class PrintScreen {
	private boolean print, dialogue, chest, riddle;
	private Handler handler;
	private Timer timer = new Timer();
	private BufferedImage item1, item2, item3, item4;
	private int item1N, item2N, item3N, item4N, items, dia1, dia2, dia3;
	private String string1, string2, string3;

	public PrintScreen(Handler handler, float x, float y) {
		this.handler = handler;

	}

	public void setPrint(boolean b) {
		print = b;
	}

	public void setChest(boolean b) {
		chest = b;
	}

	public void setDialogue(boolean b) {
		dialogue = b;
	}

	public void setRiddle(boolean b) {
		riddle = b;
	}

	public void setDia1(int num) {
		dia1 = num;
	}

	public void setDia2(int num) {
		dia2 = num;
	}

	public void setDia3(int num) {
		dia3 = num;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public BufferedImage getImage(int num) {
		BufferedImage image = null;
		switch (handler.getWorld().getUtil().getStack()) {
		case "bomb":
			image = Assets.coin5;
			handler.getGame().getInventory().setCoins(num);
			break;
		case "potion":
			image = Assets.potion;
			handler.getGame().getInventory().setPotions(num);
			break;
		case "arrows":
			image = Assets.arrow;
			handler.getGame().getInventory().setArrows(num);
			break;
		case "coins":
			image = Assets.coin5;
			handler.getGame().getInventory().setCoins(num);
			break;
		}

		return image;
	}

	public void setImage(int num) {
		if (num >= 1) {
			item1N = handler.getWorld().getUtil().getNum();
			item1 = getImage(item1N);
		}

		if (num >= 2) {
			item2N = handler.getWorld().getUtil().getNum();
			item2 = getImage(item2N);
		}

		if (num >= 3) {
			item3N = handler.getWorld().getUtil().getNum();
			item3 = getImage(item3N);
		}

		if (num >= 4) {
			item4N = handler.getWorld().getUtil().getNum();
			item4 = getImage(item4N);
		}
	}

	public BufferedImage drawImage(int num) {
		BufferedImage image = item1;
		if (num == 1)
			image = item1;

		if (num == 2)
			image = item2;

		if (num == 3)
			image = item3;

		if (num == 4)
			image = item4;

		return image;
	}

	public int drawNumber(int num) {
		int image = 0;
		if (num == 1)
			image = item1N;

		if (num == 2)
			image = item2N;

		if (num == 3)
			image = item3N;

		if (num == 4)
			image = item4N;

		return image;
	}


	public void tick() {
	}

	public void render(Graphics2D g) {

		g.drawImage(Assets.slot, (Tile.TILEWIDTH * 6) - 32, 10, Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		if (handler.getWorld().getEle().isEquipped()) {
			g.drawImage(Assets.fireIceSword, (Tile.TILEWIDTH * 6) - 11, 15, Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		}
		if (handler.getWorld().getBow().isEquipped()) {
			g.drawImage(Assets.bowSword[0], (Tile.TILEWIDTH * 5) + 32, 20, Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		}
		if (handler.getWorld().getFan().isEquipped()) {
			g.drawImage(Assets.fanSword[2], (Tile.TILEWIDTH * 6) - 22, 20, Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		}
		if (handler.getWorld().getSword().isEquipped()) {
			g.drawImage(Assets.sword[0], (Tile.TILEWIDTH * 6) - 11, 15, Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		}
		if (handler.getWorld().getBoom().isEquipped()) {
			g.drawImage(Assets.boomSwordFull, (Tile.TILEWIDTH * 6) - 11, 20, Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		}
		if (handler.getWorld().getShield().isEquipped()) {
			g.drawImage(Assets.shieldSwordDown, (Tile.TILEWIDTH * 6) - 11, 25, Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		}

		g.drawImage(Assets.slot, (Tile.TILEWIDTH * 7), 10, Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		if (handler.getWorld().getPotion().isEquipped()) {
			g.drawImage(Assets.potion, (Tile.TILEWIDTH * 7), 0, Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
		}


		if (print) {
			g.drawImage(Assets.textBox, 0, Tile.TILEHEIGHT * 9, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 3, null);
			if (chest) {
				g.setColor(Color.BLACK);
				g.setFont(new Font("Serif", Font.BOLD, 25));
				for (int i = 1; i <= items; i++) {
					if (i <= 2) {
						g.drawImage(drawImage(i), Tile.TILEWIDTH * 2, (int) (Tile.TILEHEIGHT * (8 + i)), Tile.TILEWIDTH,
								Tile.TILEHEIGHT, null);
						g.drawString(" X " + drawNumber(i), Tile.TILEWIDTH * 3, (int) (Tile.TILEHEIGHT * (9 + i) - 10));
					} else if (i > 2) {
						g.drawImage(drawImage(i), Tile.TILEWIDTH * 5, (int) (Tile.TILEHEIGHT * (8 + i - 2)),
								Tile.TILEWIDTH, Tile.TILEHEIGHT, null);
						g.drawString(" X " + drawNumber(i), Tile.TILEWIDTH * 6,
								(int) (Tile.TILEHEIGHT * (9 + i - 2) - 10));
					}
				}
				if (timer.run(3.5f)) {
					chest = false;
					print = false;
				}
			}
			
			if (riddle) {
				g.setColor(Color.BLACK);
				g.setFont(new Font("Serif", Font.BOLD, 25));
				string1 = Dialogue.loadFileAsString("/dialogue/Riddles.txt", dia1);
				string2 = Dialogue.loadFileAsString("/dialogue/Riddles.txt", dia2);
				string3 = Dialogue.loadFileAsString("/dialogue/Riddles.txt", dia3);
				g.drawString(string1, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 10);
				g.drawString(string2, Tile.TILEWIDTH * 2, (Tile.TILEHEIGHT * 11) - 32);
				g.drawString(string3, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 11);

			}
			
			if (timer.run(5f)) {
				riddle = false;
				print = false;
			}
			
			if (dialogue) {
				g.setColor(Color.BLACK);
				g.setFont(new Font("Serif", Font.BOLD, 25));
				string2 = Dialogue.loadFileAsString("/dialogue/dialogue1", dia2);
				g.drawString(string2, Tile.TILEWIDTH * 2, (Tile.TILEHEIGHT * 11) - 32);

			}
			
			if (timer.run(3.5f)) {
				dialogue = false;
				print = false;
			}
		}
		// if (print) {
		// g.drawImage(Assets.textBox, 0, 640, Tile.TILEWIDTH * 16,
		// Tile.TILEHEIGHT * 2, null);
		// g.setColor(Color.BLACK);
		// g.setFont(new Font("Serif", Font.BOLD, 30));
		// g.drawString("You have found courage", 350, 710);
		// if (timer.run(2))
		// print = false;
		// }
	}

	public Timer getTimer() {
		return timer;
	}

}
