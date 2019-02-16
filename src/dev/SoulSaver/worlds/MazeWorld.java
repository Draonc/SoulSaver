package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.Chest;
import dev.SoulSaver.entities.Static.items.InteractiveBoard;
import dev.SoulSaver.entities.Static.items.Target;
import dev.SoulSaver.entities.Static.items.TempWall;
import dev.SoulSaver.entities.Static.items.Transport;
import dev.SoulSaver.entities.Static.props.MazeFountain;
import dev.SoulSaver.entities.Static.props.MazeSkeleton;
import dev.SoulSaver.entities.Static.props.MazeStatue;
import dev.SoulSaver.entities.creatures.Enemies.Archer;
import dev.SoulSaver.entities.creatures.Enemies.Mirror;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.entities.creatures.Enemies.Souls;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class MazeWorld extends World {

	public MazeWorld(Handler handler, String path, int chests) {
		super(handler, path, chests);
		world=1;
		entityManager = new EntityManager(handler, new Player(handler, spawnX, spawnY));
		IU = new ItemUtil(handler);		
		swords();
		populateEntities();
		setItems();
		
		music();
		JukeBox.load("/Music/MazeBG.mp3", "BG1");
		JukeBox.setVolume("BG1", -10);
		JukeBox.loop("BG1");
	}

	@Override
	public void populateEntities() {
		entityManager.addEntity(sword);
		entityManager.addEntity(bow);
		entityManager.addEntity(boom);
		entityManager.addEntity(shield);
		entityManager.addEntity(fan);
		entityManager.addEntity(ele);
		
		//This board will explain the fire and ice switch briefly.
		entityManager.addEntity(new InteractiveBoard(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 1, 0, 5, 0, world));
		
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT, 1));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 2, 1, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 3, 1, -1, -1, true, world));
		
		
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT, 2));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 6, 2, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 6, 2, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 5, 2, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 5, 2, -1, -1, true, world));
		
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 11, 3));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 14, 3, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 14, 3, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 13, 3, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 13, 3, -1, -1, true, world));
		
		
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 27, 4));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 33, 4, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 33, 4, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 34, 4, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 34, 4, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 62, Tile.TILEHEIGHT * 35, 4, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 35, 4, -1, -1, true, world));
		
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 37, 5));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 74, 5, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 74, 5, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 73, 5, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 73, 5, -1, -1, true, world));
		
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 84, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 74, 6, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 74, 6, -1, -1, true, world));
		
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 71, Tile.TILEHEIGHT * 34, 7));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 62, 7, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 62, 7, -1, -1, true, world));
		
		
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 77, Tile.TILEHEIGHT * 38, 8));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 73, Tile.TILEHEIGHT * 17, 8, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 73, Tile.TILEHEIGHT * 18, 8, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 74, Tile.TILEHEIGHT * 17, 8, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 74, Tile.TILEHEIGHT * 18, 8, -1, -1, true, world));
		
		
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 7, 12));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 28, 12, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 29, 12, -1, -1, true, world));
		
		
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 82, 13));
		entityManager.addEntity(new Target(handler, Tile.TILEWIDTH * 85, Tile.TILEHEIGHT * 82, 14));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 75, Tile.TILEHEIGHT * 84, 14, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 84, 14, -1, -1, true, world));
		
		
		
		entityManager.addEntity(new MazeFountain(handler,( Tile.TILEWIDTH * 52 + 32), Tile.TILEHEIGHT * 50));
		entityManager.addEntity(new MazeStatue(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 47));
		entityManager.addEntity(new MazeStatue(handler, Tile.TILEWIDTH * 50, Tile.TILEHEIGHT * 53));
		entityManager.addEntity(new MazeStatue(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 47));
		entityManager.addEntity(new MazeStatue(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 53));
		
		
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 24, 9, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 25, 9, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 24, 9, -1, -1, true, world));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 25, 9, -1, -1, true, world));
		
		entityManager.addEntity(new MazeSkeleton(handler, Tile.TILEWIDTH * 47, Tile.TILEHEIGHT * 85));
		entityManager.addEntity(new MazeSkeleton(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 83));
		entityManager.addEntity(new MazeSkeleton(handler, Tile.TILEWIDTH * 47, Tile.TILEHEIGHT * 55));
		entityManager.addEntity(new MazeSkeleton(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 53));
		entityManager.addEntity(new MazeSkeleton(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 51));
		entityManager.addEntity(new MazeSkeleton(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 45));
		entityManager.addEntity(new MazeSkeleton(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 22));
		entityManager.addEntity(new MazeSkeleton(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 60));
		
		
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 70, Tile.TILEHEIGHT * 36, 1, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 9, 2, 1));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 9, 3, 3));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 78, 4, 1));
		
		entityManager.addEntity(new MazeStatue(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 69));
		entityManager.addEntity(new MazeStatue(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 69));
		entityManager.addEntity(new MazeStatue(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 69));
		
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 25,world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 30,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 59,world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 72,world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 24,world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 4, Tile.TILEHEIGHT * 11,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 59,world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 52, Tile.TILEHEIGHT * 47,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 61,world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 72,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 81,world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 81,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 64,world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 82,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 78, Tile.TILEHEIGHT * 82,world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 86, Tile.TILEHEIGHT * 50,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 86, Tile.TILEHEIGHT * 61,world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 70, Tile.TILEHEIGHT * 26,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 64,world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 16,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 49, Tile.TILEHEIGHT * 23,world));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 49, Tile.TILEHEIGHT * 17,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 54, Tile.TILEHEIGHT * 23,world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 77, Tile.TILEHEIGHT * 51,world));
		
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 24,1,world, 1));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 81,1,world, 2));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 70,1,world, 3));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 43, Tile.TILEHEIGHT * 72,2,world, 4));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 42, Tile.TILEHEIGHT * 72,2,world, 5));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 76, Tile.TILEHEIGHT * 88,1,world, 6));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 96, Tile.TILEHEIGHT * 25,1,world, 7));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 84, Tile.TILEHEIGHT * 26,1,world, 8));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 46, Tile.TILEHEIGHT * 18,2,world, 9));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 18,2,world, 10));
		
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 0, 11));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 0, 11));
	
		
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
