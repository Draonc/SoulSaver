package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.Chest;
import dev.SoulSaver.entities.Static.items.ClimbRope;
import dev.SoulSaver.entities.Static.items.Crate;
import dev.SoulSaver.entities.Static.items.InteractiveBoard;
import dev.SoulSaver.entities.Static.items.ShipHole;
import dev.SoulSaver.entities.Static.items.Switch;
import dev.SoulSaver.entities.Static.items.TempWall;
import dev.SoulSaver.entities.Static.items.Transport;
import dev.SoulSaver.entities.Static.props.Map;
import dev.SoulSaver.entities.Static.props.RopeLadder;
import dev.SoulSaver.entities.creatures.Enemies.Archer;
import dev.SoulSaver.entities.creatures.Enemies.Flying;
import dev.SoulSaver.entities.creatures.Enemies.Leash;
import dev.SoulSaver.entities.creatures.Enemies.Mirror;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.entities.creatures.Enemies.Souls;
import dev.SoulSaver.entities.creatures.Enemies.Trail;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class ShipWorld extends World {

	public ShipWorld(Handler handler, String path, int chests) {
		super(handler, path, chests);
		world=5;
		entityManager = new EntityManager(handler, new Player(handler, spawnX, spawnY));
		IU = new ItemUtil(handler);		
		swords();
		populateEntities();
		setItems();
		
		music();
		JukeBox.load("/Music/ShipBG.mp3", "BG5");
		JukeBox.setVolume("BG5", -10);
		JukeBox.loop("BG5");
		
	}

	@Override
	public void populateEntities() {
		entityManager.addEntity(sword);
		entityManager.addEntity(bow);
		entityManager.addEntity(boom);
		entityManager.addEntity(shield);
		entityManager.addEntity(fan);
		entityManager.addEntity(ele);
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 7, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 7));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 7 , Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 7));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 12, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 11));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 12 , Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 11));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 3, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 24));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 23 , Tile.TILEWIDTH * 55, Tile.TILEHEIGHT * 4));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 30, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 30));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 30 , Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 30));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 22, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 23));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 22 , Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 23));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 31, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 30));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 51, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 50));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 24, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 43));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 44, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 23));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 51, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 32));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 31 , Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 52));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 51, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 32));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 31 , Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 52));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 29, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 49));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 50 , Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 28));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 53, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 52));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 53 , Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 52));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 52, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 53));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 52 , Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 53));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 13, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 32));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 33 , Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 12));
		
		entityManager.addEntity(new ShipHole(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 8, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 48));
		entityManager.addEntity(new ClimbRope(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 47 , Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 9));
		
		entityManager.addEntity(new Map(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT));
		
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 24, 2, world, 41));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 30, 2, world, 42));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 32, 2, world, 43));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 45, 2, world, 44));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 46, 2, world, 45));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 46, 2, world, 46));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 13, 1, world, 47));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 32, 1, world, 48));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 22, 1, world, 49));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 47, 1, world, 50));
		
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 4, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 3, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 24, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 53, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 47, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 48, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 22, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 27, world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 50, world));
		
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 29, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 50, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 47, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 45, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 26, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 4, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 7, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 12, world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 13, world));
		
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 4, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 1, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 7, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 28, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 53, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 46, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 44, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 22, world, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 27, world, false));
		
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 30, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 50, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 51, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 9, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 12, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 6, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 4, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 52, world));
		entityManager.addEntity(new Leash(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 33, world));
		
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 25, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 29, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 45, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 52, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 34, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 4, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 8, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 10, world, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 5, world, false));
		
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 25, world));

		entityManager.addEntity(new Crate(handler, Tile.TILEWIDTH * 28 , Tile.TILEHEIGHT * 32, world));
		entityManager.addEntity(new Crate(handler, Tile.TILEWIDTH * 30 , Tile.TILEHEIGHT * 7, world));
		entityManager.addEntity(new Crate(handler, Tile.TILEWIDTH * 35 , Tile.TILEHEIGHT * 7, world));
		entityManager.addEntity(new Crate(handler, Tile.TILEWIDTH * 34 , Tile.TILEHEIGHT * 9, world));
		entityManager.addEntity(new Crate(handler, Tile.TILEWIDTH * 34 , Tile.TILEHEIGHT * 10, world));
		entityManager.addEntity(new Crate(handler, Tile.TILEWIDTH * 33 , Tile.TILEHEIGHT * 10, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 42, 1));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 49, 3, 2, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 48, 2));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 49, 1, 4, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 42, 3));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 53, 1, 2, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 48, 4));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 53, 3, 4, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 32, 5));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 31, 5, -1, -1, true, world));

		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 22, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 28, 6, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 24, 7));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 27, 7, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 24, 8));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 24, 8));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 24, 8));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 44, 9));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 53, 9, -1, -1, true, world));
		
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 45, 10));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 50, 10, -1, -1, true, world));
		
		entityManager.addEntity(new InteractiveBoard(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 27, 2, 1, 2, 3));
		
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 9, 1, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 2, 2, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 30, 3, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 42, 4, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 44, 5, 2));
		
		entityManager.addEntity(new RopeLadder(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 15, (Tile.TILEHEIGHT) + 5, 15));
		
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
