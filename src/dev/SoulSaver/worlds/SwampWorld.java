package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.Chest;
import dev.SoulSaver.entities.Static.items.Switch;
import dev.SoulSaver.entities.Static.items.TempWall;
import dev.SoulSaver.entities.Static.items.Transport;
import dev.SoulSaver.entities.creatures.Enemies.Archer;
import dev.SoulSaver.entities.creatures.Enemies.Armor;
import dev.SoulSaver.entities.creatures.Enemies.Flying;
import dev.SoulSaver.entities.creatures.Enemies.Leash;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.entities.creatures.Enemies.Souls;
import dev.SoulSaver.entities.creatures.Enemies.Trail;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class SwampWorld extends World {

	public SwampWorld(Handler handler, String path, int chests) {
		super(handler, path, chests);
		world=3;
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
		
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 85, (Tile.TILEHEIGHT * 8) - 16, 1));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 27, 1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 26, 1, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 57, (Tile.TILEHEIGHT * 30) - 16, 2));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 18, 2, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 19, 2, -1, -1, true, world));
		
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 15, (Tile.TILEHEIGHT * 3) - 16, 3));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 24, 3, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 24, 3, -1, -1, true, world));
		
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 15, (Tile.TILEHEIGHT * 34) - 16, 4));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 14, 4, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 15, 4, -1, -1, true, world));
		
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 5, (Tile.TILEHEIGHT * 48) - 16, 5));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 26, 5, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 27, 5, -1, -1, true, world));
		
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 44, (Tile.TILEHEIGHT * 59) - 16, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 57, 6, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 57, 6, -1, -1, true, world));
		
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 72, (Tile.TILEHEIGHT * 78) - 16, 7));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 62, 7, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 62, 7, -1, -1, true, world));
		
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 63, (Tile.TILEHEIGHT * 42) - 16, 8));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 65, 8, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 65, 8, -1, -1, true, world));
		
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 85, (Tile.TILEHEIGHT * 63) - 16, 9));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 70, 9, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 71, 9, -1, -1, true, world));
		
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 27, 2, world, 21));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 14, 2, world, 22));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 38, 2, world, 23));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 55, 2, world, 24));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 37, 2, world, 25));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 7, 1, world, 26));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 43, 1, world, 27));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 83, 1, world, 28));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 63, 1, world, 29));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 87, Tile.TILEHEIGHT * 73, 1, world, 30));
		
		
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 70, Tile.TILEHEIGHT * 65, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 75, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 79, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 69, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 73, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 28, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 20, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 30, world));
		
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 74, Tile.TILEHEIGHT * 61, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 86, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 70, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 61, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 27, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 19, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 18, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 73, Tile.TILEHEIGHT * 29, world));
		
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 73, Tile.TILEHEIGHT * 73, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 48, Tile.TILEHEIGHT * 75, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 84, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 64, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 30, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 20, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 16, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 75, Tile.TILEHEIGHT * 16, world, false));
		
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 69, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 72, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 72, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 19, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 21, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 7, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 7, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 77, Tile.TILEHEIGHT * 30, world));
		
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 62, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 84, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 75, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 85, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 60, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 17, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 7, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 23, world, false));
		
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 65, world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 65, world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 65, world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 65, world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 65, world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 65, world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 48, Tile.TILEHEIGHT * 65, world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 65, world));
		
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 83, Tile.TILEHEIGHT * 7, 1, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 3, 2, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 63, 3, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 26, 4, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 78, 5, 2));
		
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 89, Tile.TILEHEIGHT * 2, 13));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 89, Tile.TILEHEIGHT * 3, 13));
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
