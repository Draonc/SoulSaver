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
import dev.SoulSaver.entities.creatures.Enemies.Mirror;
import dev.SoulSaver.entities.creatures.Enemies.Flying;
import dev.SoulSaver.entities.creatures.Enemies.Leash;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.entities.creatures.Enemies.Souls;
import dev.SoulSaver.entities.creatures.Enemies.Trail;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class SkyWorld extends World {

	public SkyWorld(Handler handler, String path, int chests) {
		super(handler, path, chests);
		world=8;
		entityManager = new EntityManager(handler, new Player(handler, spawnX, spawnY));
		IU = new ItemUtil(handler);		
		swords();
		populateEntities();
		setItems();
		
		music();
		JukeBox.load("/Music/SkyBG.mp3", "BG8");
		JukeBox.setVolume("BG8", -10);
		JukeBox.loop("BG8");
		
	}

	@Override
	public void populateEntities() {
		entityManager.addEntity(sword);
		entityManager.addEntity(bow);
		entityManager.addEntity(boom);
		entityManager.addEntity(shield);
		entityManager.addEntity(fan);
		entityManager.addEntity(ele);
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 14, 1));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 26, 1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 27, 1, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 64, 2));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 18, 2, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 19, 2, -1, -1, true, world));
		
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 11, 3));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 4, 3, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 4, 3, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 81, Tile.TILEHEIGHT * 35, 4));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 86, Tile.TILEHEIGHT * 50, 4, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 87, Tile.TILEHEIGHT * 50, 4, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 47, Tile.TILEHEIGHT * 60, 5));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 74, 5, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 74, 5, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 81, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 63, 6, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 64, 6, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 100, 7));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 107, 7, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 107, 7, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 92, 8));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 102, 8, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 102, 8, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 85, 9));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 107, 9, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 93, 10));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 108, 10, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 108, 10, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 55, 11));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 66, 11, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 66, 11, -1, -1, true, world));
		
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 48, 2, world, 71));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 60, 2, world, 72));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 110, 2, world, 73));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 70, 2, world, 74));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 20, 2, world, 75));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 4, 1, world, 76));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 111, 1, world, 77));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 111, 1, world, 78));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 67, 1, world, 79));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 96, 1, world, 80));
		
		
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 40, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 14, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 35, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 85, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 97, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 84, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 56, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 15, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 100, world));
		
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 40, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 34, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 69, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 77, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 102, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 100, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 74, Tile.TILEHEIGHT * 74, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 46, Tile.TILEHEIGHT * 60, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 18, world));
		
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 15, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 50, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 75, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 91, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 100, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 87, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 46, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 10, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 83, Tile.TILEHEIGHT * 37, world, false));
		
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 23, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 55, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 88, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 106, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 80, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 79, Tile.TILEHEIGHT *80, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 48, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 47, Tile.TILEHEIGHT * 30, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 22, world));
		
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 10, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 42, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 82, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 95, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 47, Tile.TILEHEIGHT * 92, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 72, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 50, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 22, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 18, world, false));
		
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 24, world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 40, world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 73, world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 92, world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 47, Tile.TILEHEIGHT * 96, world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 70, Tile.TILEHEIGHT * 76, world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 52, world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 27, world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 25, world));
		
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 22, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 23, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 22, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 23, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 28, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 29, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 28, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 29, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 44, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 45, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 47, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 43, Tile.TILEHEIGHT * 47, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 110, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 111, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 78, Tile.TILEHEIGHT * 89, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 79, Tile.TILEHEIGHT * 89, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 108, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 108, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 65, -1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 65, -1, -1, -1, true, world));
	
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 71, Tile.TILEHEIGHT * 6, 1, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 45, 2, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 105, 3, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 112, 4, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 45, 5, 2));
		
		entityManager.addEntity(new Transport(handler, 0, Tile.TILEHEIGHT * 2, 18));
		entityManager.addEntity(new Transport(handler, 0, Tile.TILEHEIGHT * 3, 18));
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
