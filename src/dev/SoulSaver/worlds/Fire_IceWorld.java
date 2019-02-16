package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.Chest;
import dev.SoulSaver.entities.Static.items.IcePiller;
import dev.SoulSaver.entities.Static.items.InteractiveBoard;
import dev.SoulSaver.entities.Static.items.Transport;
import dev.SoulSaver.entities.Static.items.fireIceSwitch;
import dev.SoulSaver.entities.Static.props.FireDragonStatue;
import dev.SoulSaver.entities.Static.props.FireRockLarge;
import dev.SoulSaver.entities.Static.props.FireRockSmall;
import dev.SoulSaver.entities.Static.props.IceDragonStatue;
import dev.SoulSaver.entities.Static.props.IceShardLarge;
import dev.SoulSaver.entities.Static.props.IceShardMedium;
import dev.SoulSaver.entities.creatures.Enemies.Archer;
import dev.SoulSaver.entities.creatures.Enemies.Armor;
import dev.SoulSaver.entities.creatures.Enemies.Flying;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.entities.creatures.Enemies.Souls;
import dev.SoulSaver.entities.creatures.Enemies.Trail;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class Fire_IceWorld extends World {

	public Fire_IceWorld(Handler handler, String path, int chests) {
		super(handler, path, chests);
		world=2;
		entityManager = new EntityManager(handler, new Player(handler, spawnX, spawnY));
		IU = new ItemUtil(handler);		
		swords();
		populateEntities();
		setItems();
		
		music();
		JukeBox.load("/Music/FireIceBG.mp3", "BG2");
		JukeBox.setVolume("BG2", -10);
		JukeBox.loop("BG2");
		
	}

	@Override
	public void populateEntities() {
		entityManager.addEntity(sword);
		entityManager.addEntity(bow);
		entityManager.addEntity(boom);
		entityManager.addEntity(shield);
		entityManager.addEntity(fan);
		entityManager.addEntity(ele);
		
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 5,1,world, 11));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 65,1,world, 12));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 12,1,world, 13));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 34,1,world, 14));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 53,1,world, 15));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 58,1,world, 16));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 66,2,world, 17));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 66,2,world, 18));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 56, Tile.TILEHEIGHT * 82,2,world, 19));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 82,2,world, 20));
		
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 5,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 11,world));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 11,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 57,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 58,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 38,world));
		entityManager.addEntity(new Trail(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 45,world,true));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 37,world));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 79, Tile.TILEHEIGHT * 37,world));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 68,world, true));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 45, Tile.TILEHEIGHT * 68,world));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 76,world,false));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 75,world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 71,world));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 63, Tile.TILEHEIGHT * 71,world));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 62,world,false));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 62,world));
		
		
		entityManager.addEntity(new IcePiller(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 48, false));
		entityManager.addEntity(new IcePiller(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 48, false));
		entityManager.addEntity(new IcePiller(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 25, true));
		entityManager.addEntity(new IcePiller(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 26, true));
		entityManager.addEntity(new IcePiller(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 17, true));
		entityManager.addEntity(new IcePiller(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 17, true));
		entityManager.addEntity(new IcePiller(handler, Tile.TILEWIDTH * 75, Tile.TILEHEIGHT * 66, true));
		entityManager.addEntity(new IcePiller(handler, Tile.TILEWIDTH * 74, Tile.TILEHEIGHT * 66, true));
		entityManager.addEntity(new IcePiller(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 11, true));
		entityManager.addEntity(new IcePiller(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 11, true));
		
		entityManager.addEntity(new fireIceSwitch(handler, Tile.TILEWIDTH * 15, Tile.TILEHEIGHT * 32, true));
		entityManager.addEntity(new fireIceSwitch(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 32, false));
		entityManager.addEntity(new fireIceSwitch(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 27, true));
		entityManager.addEntity(new fireIceSwitch(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 27, false));
		entityManager.addEntity(new fireIceSwitch(handler, Tile.TILEWIDTH * 59, Tile.TILEHEIGHT * 55, true));
		entityManager.addEntity(new fireIceSwitch(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 55, false));
		entityManager.addEntity(new fireIceSwitch(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 3, true));
		entityManager.addEntity(new fireIceSwitch(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 3, false));
		
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 34));
		entityManager.addEntity(new FireRockLarge(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 35));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 35));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 46));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 46));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 42));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 75));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 64, Tile.TILEHEIGHT * 72));
		entityManager.addEntity(new FireRockLarge(handler, Tile.TILEWIDTH * 57, Tile.TILEHEIGHT * 81));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 65, Tile.TILEHEIGHT * 77));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 70));
		entityManager.addEntity(new FireRockLarge(handler, Tile.TILEWIDTH * 68, Tile.TILEHEIGHT * 18));
		entityManager.addEntity(new FireRockLarge(handler, Tile.TILEWIDTH * 67, Tile.TILEHEIGHT * 18));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 16));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 69, Tile.TILEHEIGHT * 23));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 22));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 67, Tile.TILEHEIGHT * 24));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 60, Tile.TILEHEIGHT * 52));
		entityManager.addEntity(new FireRockLarge(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 54));
		entityManager.addEntity(new FireRockLarge(handler, Tile.TILEWIDTH * 61, Tile.TILEHEIGHT * 53));
		entityManager.addEntity(new FireRockSmall(handler, Tile.TILEWIDTH * 58, Tile.TILEHEIGHT * 51));
		
		
		entityManager.addEntity(new IceShardLarge(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 35));
		entityManager.addEntity(new IceShardMedium(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 32));
		entityManager.addEntity(new IceShardLarge(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 39));
		entityManager.addEntity(new IceShardMedium(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 28));
		entityManager.addEntity(new IceShardLarge(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 41));
		entityManager.addEntity(new IceShardMedium(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 28));
		entityManager.addEntity(new IceShardMedium(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 12));
		entityManager.addEntity(new IceShardLarge(handler, Tile.TILEWIDTH * 8, Tile.TILEHEIGHT * 16));
		entityManager.addEntity(new IceShardMedium(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 18));
		entityManager.addEntity(new IceShardLarge(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 10));
		entityManager.addEntity(new IceShardMedium(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT * 20));
		entityManager.addEntity(new IceShardMedium(handler, Tile.TILEWIDTH * 82, Tile.TILEHEIGHT * 32));
		entityManager.addEntity(new IceShardLarge(handler, Tile.TILEWIDTH * 79, Tile.TILEHEIGHT * 33));
		entityManager.addEntity(new IceShardMedium(handler, Tile.TILEWIDTH * 80, Tile.TILEHEIGHT * 35));
		entityManager.addEntity(new IceShardLarge(handler, Tile.TILEWIDTH * 77, Tile.TILEHEIGHT * 46));
		entityManager.addEntity(new IceShardMedium(handler, Tile.TILEWIDTH * 74, Tile.TILEHEIGHT * 31));
		
		entityManager.addEntity(new FireDragonStatue(handler, Tile.TILEWIDTH * 13, Tile.TILEHEIGHT * 38));
		entityManager.addEntity(new IceDragonStatue(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 32));
		
		//entityManager.addEntity(new InteractiveBoard(handler, Tile.TILEWIDTH * 67, Tile.TILEHEIGHT * 19,world));
		//entityManager.addEntity(new InteractiveBoard(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 34,world));
		//This board will explain the fire and ice switch briefly.
		entityManager.addEntity(new InteractiveBoard(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 3, 1, 0, 4, 0));
		
		
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 74, Tile.TILEHEIGHT * 68, 1, 2));
		entityManager.addEntity(new Chest(handler, Tile.TILEWIDTH * 17, Tile.TILEHEIGHT * 3, 2, 1));
		
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 1, 12));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 1, 12));
		
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
