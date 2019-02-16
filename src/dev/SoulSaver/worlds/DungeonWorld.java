package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.DungeonDoorL;
import dev.SoulSaver.entities.Static.items.Switch;
import dev.SoulSaver.entities.Static.items.TempWall;
import dev.SoulSaver.entities.Static.items.Transport;
import dev.SoulSaver.entities.creatures.Enemies.Archer;
import dev.SoulSaver.entities.creatures.Enemies.Armor;
import dev.SoulSaver.entities.creatures.Enemies.Flying;
import dev.SoulSaver.entities.creatures.Enemies.Key;
import dev.SoulSaver.entities.creatures.Enemies.Mirror;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.entities.creatures.Enemies.Souls;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class DungeonWorld extends World {

	public DungeonWorld(Handler handler, String path, int chests) {
		super(handler, path, chests);
		world=6;
		entityManager = new EntityManager(handler, new Player(handler, spawnX, spawnY));
		IU = new ItemUtil(handler);		
		swords();
		populateEntities();
		setItems();
		
		music();
		JukeBox.load("/Music/DungeonBG.mp3", "BG6");
		JukeBox.setVolume("BG6", -10);
		JukeBox.loop("BG6");
		
	}

	@Override
	public void populateEntities() {
		entityManager.addEntity(sword);
		entityManager.addEntity(bow);
		entityManager.addEntity(boom);
		entityManager.addEntity(shield);
		entityManager.addEntity(fan);
		entityManager.addEntity(ele);
		
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 37, Tile.TILEHEIGHT * 98, 6));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 40, Tile.TILEHEIGHT * 78, 6));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 78, 6));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 54, 6));
		entityManager.addEntity(new Normal(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 54, 6));
		
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 41, 6));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 43, 6));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 45, 6));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 8, 6));
		entityManager.addEntity(new Mirror(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 8, 6));
		
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 94, 6));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 98, 6));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 12, Tile.TILEHEIGHT * 102, 6));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 7, 6));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 9, 6));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 7, 6));
		entityManager.addEntity(new Archer(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 9, 6));
		
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 97, 6));
		entityManager.addEntity(new Armor(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 96, 6));
		
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 41, Tile.TILEHEIGHT * 86, 6, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 87, 6, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 88, 6, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 36, Tile.TILEHEIGHT * 84, 6, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 87, 6, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 14, Tile.TILEHEIGHT * 84, 6, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 86, 6, false));
		entityManager.addEntity(new Flying(handler, Tile.TILEWIDTH * 18, Tile.TILEHEIGHT * 91, 6, false));
		
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 87, 1, 6, 51));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 87, 1, 6, 52));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 51, Tile.TILEHEIGHT * 87, 1, 6, 53));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 14, 1, 6, 54));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 14, 1, 6, 55));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 30, 1, 6, 56));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 30, 1, 6, 57));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 76, 1, 6, 58));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 16, Tile.TILEHEIGHT * 76, 2, 6, 59));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 38, Tile.TILEHEIGHT * 1, 2, 6, 60));
		
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 88));
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 53, Tile.TILEHEIGHT * 88));
		entityManager.addEntity(new Key(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 9));
		
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 32, 1));
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 32, 1));
		entityManager.addEntity(new DungeonDoorL(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 5, 1));
		
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 1, 0));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 114, 0));
		
		//ID -1
		int id = -1;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 16, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 14, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 16, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 17, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 18, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 19, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 19, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 14, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 15, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 16, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 16, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 16, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 16, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 17, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 18, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 19, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 20, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 20, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 20, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 34, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 22, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 22, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 22, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 22, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 23, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 23, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 23, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 23, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 23, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 24, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 24, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 24, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 24, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 24, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 24, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 24, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 25, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 25, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 25, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 26, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 26, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 26, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 26, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 26, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 26, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 27, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 27, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 27, id, id, id, true, 6));
		
		//ID 1
		id = 1;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 28, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 28, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 28, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 29, id));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 29, id));
		
		//ID 2
		id = 2;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 25, id, id, id, false, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 25, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 27, id));
		
		//ID 3
		id = 3;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 25, id, id, id, false, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 25, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 27, id));
		
		//ID 4
		id = 4;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 26, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 24, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 13, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 24, id));
		
		//ID 5
		id = 5;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 26, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 26, id, id, 6, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 27, id));
		
		//ID 6
		id = 6;
		//Wall #2 of ID 5
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 22, id));
		
		//ID 7
		id = 7;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 23, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 22, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 23, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 23, id));
		
		//ID 8
		id = 8;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 24, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 24, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 19, Tile.TILEHEIGHT * 27, id));
		
		//ID 9
		id = 9;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 14, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 19, id));
		
		//ID 10
		id = 10;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 20, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 26, Tile.TILEHEIGHT * 20, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 25, Tile.TILEHEIGHT * 14, id));
		
		//ID 11
		id = 11;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 14, id, 12, 14, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 14, id, id, 14, false, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 14, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 16, id));
		
		//ID 12
		id = 12;
		//Wall #1 of ID 11
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 14, id, id, 13, false, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 21, Tile.TILEHEIGHT * 16, id));
		
		//ID 13
		id = 13;
		//Wall #2 of ID 12
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 16, id));
		
		//ID 14
		id = 14;
		//Wall #1 of ID 11
		//Wall #2 of ID 11
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 23, Tile.TILEHEIGHT * 16, id));
		
		//ID 15
		id = 15;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 26, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 25, id, id, id, false, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 22, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 24, id));
	
		//ID 16
		id = 16;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 21, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 25, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 22, id));
		
		//ID 17
		id = 17;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 17, id, id, id, true, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 15, id));
		
		//ID 18
		id = 18;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 14, id, 19, 20, false, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 14, id, id, 23, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 32, Tile.TILEHEIGHT * 14, id, id, 21, false, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 16, id));
		
		//ID 19
		id = 19;
		//Wall #1 of ID 18
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 15, id, id, 23, false, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 16, id, id, id, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 17, id, id, id, false , 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 35, Tile.TILEHEIGHT * 17, id));
		
		//ID 20
		id = 20;
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 14, id, id, id, true, 6));
		//Wall #1 of ID 18
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 16, id));
		
		//ID 21
		id = 21;
		//Wall #3 of ID 18
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 33, Tile.TILEHEIGHT * 14, id, id, 22, true, 6));
		entityManager.addEntity(new TempWall(handler, Tile.TILEWIDTH * 31, Tile.TILEHEIGHT * 17, id, id, id, false, 6));
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 29, Tile.TILEHEIGHT * 18, id));
		
		//ID 22
		id = 22;
		//Wall #2 of ID 21
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 24 , id));
		
		//ID 23
		id = 23;
		//Wall #2 of ID 18
		//Wall #1 of ID 19
		entityManager.addEntity(new Switch(handler, Tile.TILEWIDTH * 30, Tile.TILEHEIGHT * 20, id));
		
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 114, 16));
		
		
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
