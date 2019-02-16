package dev.SoulSaver.entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.Timer;

public class PurchaseItem extends StaticEntity {
	private BufferedImage image;
	private int model, hearts;
	private int w, h;
	private Timer timer;

	public PurchaseItem(Handler handler, float x, float y, int model) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.model = model;
		hearts = 0;
		setImage(model);
		timer = new Timer();
		
		timer.Start();

	}

	public void setImage(int model) {
		switch (model) {
		case 1:
			if (!handler.getInventory().isBoomP()) {
				image = Assets.boomSwordFull;
				w =20;
				h = -20;
			} else {
				image = Assets.soldOut;
				w = 0;
				h = -25;
			}
			break;
		case 2:
			if (!handler.getInventory().isBowP()) {
				image = Assets.bowSword[0];
				w = 0;
				h = -10;
			} else {
				image = Assets.soldOut;
				w = 0;
				h = -25;
			}
			break;
		case 3:
			if (!handler.getInventory().isEleP()) {
				image = Assets.fireIceSword;
				w = 20;
				h = -10;
			} else {
				image = Assets.soldOut;
				w = 0;
				h = -25;
			}
			break;
		case 4:
			if (!handler.getInventory().isShieldP()) {
				image = Assets.shieldSwordDown;
				w = 20;
				h = -10;
			} else {
				image = Assets.soldOut;
				w = 0;
				h = -25;
			}
			break;
		case 5:
			if (!handler.getInventory().isFanP()) {
				image = Assets.fanSword[2];
				w = 0;
				h = -20;
			} else {
				image = Assets.soldOut;
				w = 0;
				h = -25;
			}
			break;
		case 6:
			image = Assets.potion;
			w = 5;
			h = -32;
			break;
		case 7:
			if (handler.getInventory().getHearts()<5) {
				image = Assets.heartFull;
				w = 10;
				h = -32;
			} else {
				image = Assets.soldOut;
				w = 0;
				h = -25;
			}
			break;

		}
	}

	public void purchase() {
		if (handler.getWorld().getEntityManager().getPlayer().getRectangle().intersects(this.getRectangle())
				&& handler.getKeyManager().interact && timer.run(.75f)) {
			switch (model) {
			case 1:
				if (handler.getInventory().getCoins() >= 10) {
					JukeBox.play("Coin");
					handler.getInventory().setBoomP(true);
					handler.getInventory().useCoins(10);
				}
				break;
			case 2:
				if (handler.getInventory().getCoins() >= 10) {
					JukeBox.play("Coin");
					handler.getInventory().setBowP(true);
					handler.getInventory().useCoins(10);
				}
				break;
			case 3:
				if (handler.getInventory().getCoins() >= 10) {
					JukeBox.play("Coin");
					handler.getInventory().setEleP(true);
					handler.getInventory().useCoins(10);
				}
				break;
			case 4:
				if (handler.getInventory().getCoins() >= 10) {
					JukeBox.play("Coin");
					handler.getInventory().setShieldP(true);
					handler.getInventory().useCoins(10);
				}
				break;
			case 5:
				if (handler.getInventory().getCoins() >= 10) {
					JukeBox.play("Coin");
					handler.getInventory().setFanP(true);
					handler.getInventory().useCoins(10);
				}
				break;
			case 6:
				if (handler.getInventory().getCoins() >= 5) {
					JukeBox.play("Coin");
					handler.getInventory().setPotions(1);
					handler.getInventory().useCoins(5);
				}
				break;
			case 7:
				if (handler.getInventory().getCoins() >= 10 && handler.getInventory().getHearts()<5) {
					JukeBox.play("Coin");
					handler.getInventory().inHearts();
					handler.getGame().getHealthBar().incTotHealth();
					handler.getGame().getHealthBar().inCurHealth();
					handler.getInventory().useCoins(10);
				}
				break;
			}
			timer.Start();
		}
	}

	@Override
	public void tick() {
		purchase();
		setImage(model);

	}

	@Override
	public void render(Graphics2D g) {

		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset() + w),
				(int) (y - handler.getGameCamera().getyOffset() + h), width, height, null);

		//g.setColor(Color.blue);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//		(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}

}
