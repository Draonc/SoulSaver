package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.Chest;
import dev.SoulSaver.entities.Static.DungeonDoorL;
import dev.SoulSaver.entities.Static.DungeonDoorU;
import dev.SoulSaver.entities.Static.items.Painting;
import dev.SoulSaver.entities.Static.items.Switch;
import dev.SoulSaver.entities.Static.items.Transport;
import dev.SoulSaver.entities.Static.items.Window;
import dev.SoulSaver.entities.creatures.Enemies.Flying;
import dev.SoulSaver.entities.creatures.Enemies.Key;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.entities.creatures.Enemies.Souls;
import dev.SoulSaver.entities.creatures.Enemies.Trail;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class MansionWorld extends World {

	public MansionWorld(Handler handler, String path, int chests) {
		super(handler, path, chests);
		world=4;
		entityManager = new EntityManager(handler, new Player(handler, spawnX, spawnY));
		IU = new ItemUtil(handler);		
		swords();
		populateEntities();
		setItems();
		
		music();
		JukeBox.load("/Music/MansionBG.mp3", "BG4");
		JukeBox.setVolume("BG4", -10);
		JukeBox.loop("BG4");
		
	}

	@Override
	public void populateEntities() {
		entityManager.addEntity(sword);
		entityManager.addEntity(bow);
		entityManager.addEntity(boom);
		entityManager.addEntity(shield);
		entityManager.addEntity(fan);
		entityManager.addEntity(ele);
		
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 2, 1, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 2, 2, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 20, 3, 3));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 20, 4, 3));
		
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 1, Tile.TILEHEIGHT * 6, 4, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 1, Tile.TILEHEIGHT * 8, 4, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 6, 4, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 8, 4, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 6, 4, false));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 6, 4, false));
		
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 10, 4));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 10, 4));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 10, 4));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 10, 4));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 65, 4));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 65, 4));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 49, 4));
		
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 6, 4, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 8, 4, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 6, 4, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 39, Tile.TILEHEIGHT * 8, 4, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 61, 4, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 61, 4, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 67, 4, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 67, 4, false));
		
		
		
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 7, 1));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 7, 1));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 11, 4));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 11, 3));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 49, 3));
		entityManager.addEntity(new DungeonDoorU(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 49, 4));
		
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 41, 1));
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 41, 1));
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 1));
		
		//Light-emitting paintings. The last argument tells you what direction I want them facing.
		//I can't test where they're spawning, but they should be on the walls.
		 entityManager.addEntity(new Painting(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 58, 2));
		 entityManager.addEntity(new Painting(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 58, 2));
		 entityManager.addEntity(new Painting(handler, Tile.TILEWIDTH * 10, Tile.TILEHEIGHT * 59, 3));
		 entityManager.addEntity(new Painting(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 27, 4));
		 entityManager.addEntity(new Painting(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 27, 3));
		// entityManager.addEntity(new Painting(handler, Tile.TILEWIDTH * 0, Tile.TILEHEIGHT * 9));
		 //entityManager.addEntity(new Painting(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 58));
		  
		
		//I'm not sure how to make the windows look natural.
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 2, 1));
		entityManager.addEntity(new Window(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 0, 1));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 2, 2));
		entityManager.addEntity(new Window(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 0, 2));
		
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 6, Tile.TILEHEIGHT * 66, 1, 4, 31));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 2, 1, 4, 32));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 2, 1, 4, 33));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 23, 1, 4, 34));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 23, 1, 4, 35));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 25, 1, 4, 36));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 25, 1, 4, 37));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 29, 2, 4, 38));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 29, 2, 4, 39));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 66, 1, 4, 40));
		//The souls directly above and below this comment are the same soul, but ^ is passive and the one below runs.
		//entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 66, 2, 4));
		
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 59, 14));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 59, 14));
		
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
