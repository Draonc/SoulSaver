package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.Chest;
import dev.SoulSaver.entities.Static.DungeonDoorL;
import dev.SoulSaver.entities.Static.items.AirPiller;
import dev.SoulSaver.entities.Static.items.Switch;
import dev.SoulSaver.entities.Static.items.TempWall;
import dev.SoulSaver.entities.Static.items.Transport;
import dev.SoulSaver.entities.creatures.Enemies.Archer;
import dev.SoulSaver.entities.creatures.Enemies.Armor;
import dev.SoulSaver.entities.creatures.Enemies.Leash;
import dev.SoulSaver.entities.creatures.Enemies.Mirror;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.entities.creatures.Enemies.Souls;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class ForestWorld extends World {

	public ForestWorld(Handler handler, String path, int chests) {
		super(handler, path, chests);
		world=7;
		entityManager = new EntityManager(handler, new Player(handler, spawnX, spawnY));
		IU = new ItemUtil(handler);		
		swords();
		populateEntities();
		setItems();
		
		music();
		JukeBox.load("/Music/ForestBG.mp3", "BG3");
		JukeBox.setVolume("BG3", -10);
		JukeBox.loop("BG3");
		
	}

	@Override
	public void populateEntities() {
		entityManager.addEntity(sword);
		entityManager.addEntity(bow);
		entityManager.addEntity(boom);
		entityManager.addEntity(shield);
		entityManager.addEntity(fan);
		entityManager.addEntity(ele);
		
		/* Leaf Piles
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 77, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 76, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 75, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 77, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 76, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 75, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 77, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 76, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 75, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 74, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 73, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 75, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 74, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 75, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 74, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 76, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 74, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 74, false, false, false));
		entityManager.addEntity(new LeafPile(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 74, false, false, false));
		*/
		
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 1, 1, 3));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 60, 2, 3));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 10, 3, 4));
		
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 62, 7));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 62, 7));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 63, 7));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 69, 7));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 66, 7));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 75, 7));
		
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 77, 7));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 43, 7));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 75, 7));
		
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 20, 7));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 35, 7));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 26, 7));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 16, 7));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 16, 7));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 23, 7));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 14, 7));
		
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 14, 7));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 7, 7));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 18, 7));
		
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 42, 7));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 53, 7));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 56, 7));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 29, 7));
		
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 60, 1, 7, 61));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 54, 1, 7, 62));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 54, 1, 7, 63));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 21, 1, 7, 64));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 3, 1, 7, 65));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 3, 1, 7, 66));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 2, 1, 7, 67));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 44, 1, 7, 68));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 44, 1, 7, 69));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 76, 1, 7, 70));
		
		entityManager.addEntity(new AirPiller(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 27, true, 1, 3));
		entityManager.addEntity(new AirPiller(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 29, true, 2, 1));
		entityManager.addEntity(new AirPiller(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 28, true, 2, 3));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 33, 1));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 31, 2));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 32, 3));
		
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 59, 1));
		
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 16, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 16, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 16, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 16, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 19, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 19, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 20, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 22, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 22, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 22, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 23, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 23, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 23, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 29, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 27, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 27, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 29, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 29, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 30, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 30, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 32, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 34, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 34, -1, -1, -1, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 34, -1, -1, -1, true, 6));

		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 80, 17));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 80, 17));
		
		
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
