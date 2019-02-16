package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.Chest;
import dev.SoulSaver.entities.Static.items.Transport;
import dev.SoulSaver.entities.Static.props.DigitalPiller;
import dev.SoulSaver.entities.creatures.Enemies.Armor;
import dev.SoulSaver.entities.creatures.Enemies.Mirror;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.entities.creatures.Enemies.Souls;
import dev.SoulSaver.entities.creatures.Enemies.Trail;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class DigitalWorld extends World {

	public DigitalWorld(Handler handler, String path, int chests) {
		super(handler, path, chests);
		world=9;
		entityManager = new EntityManager(handler, new Player(handler, spawnX, spawnY));
		IU = new ItemUtil(handler);		
		swords();
		populateEntities();
		setItems();
		music();
		JukeBox.load("/Music/DigitalBG.mp3", "BG9");
		JukeBox.setVolume("BG9", -10);
		JukeBox.loop("BG9");
	}

	@Override
	public void populateEntities() {
		entityManager.addEntity(sword);
		entityManager.addEntity(bow);
		entityManager.addEntity(boom);
		entityManager.addEntity(shield);
		entityManager.addEntity(fan);
		entityManager.addEntity(ele);
		
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 22,2,world, 81));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 19,1,world, 82));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 69,1,world, 83));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 55,2,world, 84));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 55,2,world, 85));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 83,1,world, 86));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 22,1,world, 87));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 39,1,world, 88));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 14,1,world, 89));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 86, Tile.TILEHEIGHT * 30,1,world, 90));
		
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 5, 1, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 7, 2, 1));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 11, 3, 1));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 86, Tile.TILEHEIGHT * 26, 4, 1));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 77, 5, 1));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 80, 6, 1));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 80, 7, 1));
		
		entityManager.addEntity(new DigitalPiller(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 50));
		entityManager.addEntity(new DigitalPiller(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 50));
		entityManager.addEntity(new DigitalPiller(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 57));
		entityManager.addEntity(new DigitalPiller(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 57));
		entityManager.addEntity(new DigitalPiller(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 43));
		entityManager.addEntity(new DigitalPiller(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 47));
		entityManager.addEntity(new DigitalPiller(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new DigitalPiller(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 32));
		
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 81,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 42,world));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 30,world,true));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 40,world,true));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 35,world,true));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 44,world,true));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 42,world,true));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 32,world,true));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 70, Tile.TILEHEIGHT * 32,world,true));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 70, Tile.TILEHEIGHT * 50,world,true));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 48,world,true));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 31,world,true));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 12,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 31,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 31,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 9,world));
		entityManager.addEntity(new Armor (handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 9,world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 53,world));
		entityManager.addEntity(new Armor (handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 21,world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 22,world));
		entityManager.addEntity(new Normal (handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 22,world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 21,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 12,world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 12,world));
		
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 75, Tile.TILEHEIGHT * 0, 19));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 0, 19));
		
	}

	@Override
	public void tick() {
		entityManager.tick();
		
	}

	@Override
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
