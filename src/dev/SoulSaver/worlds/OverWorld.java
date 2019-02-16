package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Gorilla;
import dev.SoulSaver.creatures.Human;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.Houses.Serp1R;
import dev.SoulSaver.entities.Static.Houses.Serp2R;
import dev.SoulSaver.entities.Static.Houses.Serp3R;
import dev.SoulSaver.entities.Static.Houses.Turn1O;
import dev.SoulSaver.entities.Static.Houses.Turn2O;
import dev.SoulSaver.entities.Static.items.Button;
import dev.SoulSaver.entities.Static.items.Transport;
import dev.SoulSaver.entities.Static.props.Entrance;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class OverWorld extends World {
	private int sX, sY;
	private boolean added, Eadded;

	public OverWorld(Handler handler, String path, int chests) {
		super(handler, path, chests);

		setSpawn();
		entityManager = new EntityManager(handler, new Player(handler, sX, sY));
		IU = new ItemUtil(handler);
		swords();
		populateEntities();
		setItems();
		world = 0;
		added = false;
		Eadded = false;

		music();
		JukeBox.load("/Music/BGMusic.mp3", "BG");
		JukeBox.setVolume("BG", -10);
		JukeBox.loop("BG");

	}

	public void setSpawn() {
		switch (location) {
		case 0:
			sX = spawnX;
			sY = spawnY;
			break;
		case 1:
			sX = Tile.TILEWIDTH * 6;
			sY = Tile.TILEHEIGHT * 9;
			break;
		case 2:
			sX = Tile.TILEWIDTH * 6;
			sY = Tile.TILEHEIGHT * 55;
			break;
		case 3:
			sX = Tile.TILEWIDTH * 43;
			sY = Tile.TILEHEIGHT * 55;
			break;
		case 4:
			sX = Tile.TILEWIDTH * 18;
			sY = Tile.TILEHEIGHT * 56;
			break;
		case 5:
			sX = (Tile.TILEWIDTH * 55) - 19;
			sY = (Tile.TILEHEIGHT * 51) + 15;
			break;
		case 6:
			sX = Tile.TILEWIDTH * 6;
			sY = Tile.TILEHEIGHT * 31;
			break;
		case 7:
			sX = Tile.TILEWIDTH * 30;
			sY = Tile.TILEHEIGHT * 55;
			break;
		case 8:
			sX = Tile.TILEWIDTH * 53;
			sY = Tile.TILEHEIGHT * 2;
			break;
		case 9:
			sX = Tile.TILEWIDTH * 55;
			sY = Tile.TILEHEIGHT * 30;
			break;
		case 10:
			sX = Tile.TILEWIDTH * 20;
			sY = Tile.TILEHEIGHT * 30;
			break;
		case 11:
			sX = Tile.TILEWIDTH * 46;
			sY = (Tile.TILEHEIGHT * 24) + 16;
			break;
		case 12:
			sX = 0;
			sY = 0;
			break;
		}
	}

	public void populateEntities() {
		entityManager.addEntity(sword);
		entityManager.addEntity(bow);
		entityManager.addEntity(boom);
		entityManager.addEntity(shield);
		entityManager.addEntity(fan);
		entityManager.addEntity(ele);
		entityManager.addEntity(potion);

		entityManager.addEntity(new Entrance(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 6, 1));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 8, 1));
		entityManager.addEntity(new Human(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 10, 1));

		entityManager.addEntity(new Entrance(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 53, 2));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 54, 2));
		entityManager.addEntity(new Human(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 50, 2));

		entityManager.addEntity(new Entrance(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 53, 3));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 43, Tile.TILEHEIGHT * 54, 3));
		entityManager.addEntity(new Human(handler, Tile.TILEWIDTH * 43, Tile.TILEHEIGHT * 50, 3));

		entityManager.addEntity(new Entrance(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 53, 4));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 55, 4));
		entityManager.addEntity(new Human(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 50, 4));

		entityManager.addEntity(new Entrance(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 52, 5));
		entityManager.addEntity(new Transport(handler, (Tile.TILEWIDTH * 55) - 19, (Tile.TILEHEIGHT * 52) + 15, 5));
		entityManager.addEntity(new Human(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 48, 5));

		entityManager.addEntity(new Entrance(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 29, 6));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 30, 6));
		entityManager.addEntity(new Human(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 34, 6));

		entityManager.addEntity(new Entrance(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 53, 7));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 54, 7));
		entityManager.addEntity(new Human(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 50, 7));

		entityManager.addEntity(new Entrance(handler, Tile.TILEWIDTH * 52, 0, 8));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT, 8));
		entityManager.addEntity(new Human(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 5, 8));

		entityManager.addEntity(new Entrance(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 28, 9));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 29, 9));
		entityManager.addEntity(new Human(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 33, 9));

		// NPCs

		// Houses
		entityManager.addEntity(new Serp1R(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 18));
		entityManager.addEntity(new Serp2R(handler, (Tile.TILEWIDTH * 23) + 20, Tile.TILEHEIGHT * 18));
		entityManager.addEntity(new Serp3R(handler, Tile.TILEWIDTH * 14, (Tile.TILEHEIGHT * 24) - 43));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 29, 10));

		entityManager.addEntity(new Turn1O(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 16));
		entityManager.addEntity(new Turn2O(handler, (Tile.TILEWIDTH * 42) + 20, Tile.TILEHEIGHT * 16));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 46, (Tile.TILEHEIGHT * 23) + 16, 20));
	}

	public void ending() {
		if (handler.getInventory().getSouls() >= 100) {
			if (!added) {
				entityManager.addEntity(new Button(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 8, 1));
				entityManager.addEntity(new Button(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 10, 2));
				entityManager.addEntity(new Button(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 9, 3));
				entityManager.addEntity(new Button(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 9, 4));
				entityManager.addEntity(new Button(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 9, 5));
				entityManager.addEntity(new Button(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 9, 6));
				entityManager.addEntity(new Entrance(handler, (Tile.TILEWIDTH * 33) - 32, Tile.TILEHEIGHT * 3, 10));
				added = true;

			}

			if (handler.getInventory().getCounter() == 10) {
				int enter = handler.getInventory().checkCode();
				if (enter == 2) {
					entityManager.addEntity(new Transport(handler, (Tile.TILEWIDTH * 34) - 32, Tile.TILEHEIGHT * 4, 23));
					Eadded = true;
				}

				if (enter == 1) {
					entityManager.addEntity(new Transport(handler, (Tile.TILEWIDTH * 34) - 32, Tile.TILEHEIGHT * 4, 24));
					Eadded = true;
				}
			}
		}
	}

	public void tick() {
		if (!Eadded) {
			ending();
		}
		entityManager.tick();
	}

	public void render(Graphics2D g) {
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width,
				(handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height,
				(handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);

		for (int y = yStart; y < yEnd; y++) {
			for (int x = xStart; x < xEnd; x++) {
				tile.render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()), getTile(x, y));
			}
		}
		// Entities
		entityManager.render(g);

		handler.getGame().getPrintScreen().render(g);

	}
}