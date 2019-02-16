package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.Timer;

public class Button extends StaticEntity {
	private int type;
	private BufferedImage image;
	private Timer timer;

	public Button(Handler handler, float x, float y, int type) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.type = type;
		setImage();
		bounds.y = 16;
		bounds.height = 32;
		bounds.width = 32;
		timer = new Timer();
	}

	public void setImage() {
		switch (type) {
		case 1:
			image = Assets.buttonUp;
			break;
		case 2:
			image = Assets.buttonDown;
			break;
		case 3:
			image = Assets.buttonLeft;
			break;
		case 4:
			image = Assets.buttonRight;
			break;
		case 5:
			image = Assets.buttonA;
			break;
		case 6:
			image = Assets.buttonB;
			break;
		}
	}

	public void press() {
		if (this.getCollisionBounds(0f, 0f).intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle())
				&& handler.getKeyManager().interact && timer.run(.5f)) {
			switch (type) {
			case 1:
				handler.getInventory().addCode("U");
				JukeBox.play("Button");
				timer.Start();
				break;
			case 2:
				handler.getInventory().addCode("D");
				JukeBox.play("Button");
				timer.Start();
				break;
			case 3:
				handler.getInventory().addCode("L");
				JukeBox.play("Button");
				timer.Start();
				break;
			case 4:
				handler.getInventory().addCode("R");
				JukeBox.play("Button");
				timer.Start();
				break;
			case 5:
				handler.getInventory().addCode("A");
				JukeBox.play("Button");
				timer.Start();
				break;
			case 6:
				handler.getInventory().addCode("B");
				JukeBox.play("Button");
				timer.Start();
				break;
			}
		}
	}

	@Override
	public void tick() {
		press();

	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

	}

}
