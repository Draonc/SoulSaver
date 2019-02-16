package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Gorilla;
import dev.SoulSaver.creatures.Human;
import dev.SoulSaver.creatures.Player;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.PurchaseItem;
import dev.SoulSaver.entities.Static.items.ShopShelf;
import dev.SoulSaver.entities.Static.items.Transport;
import dev.SoulSaver.entities.Static.props.ClockSmall;
import dev.SoulSaver.entities.Static.props.FirePlace;
import dev.SoulSaver.entities.Static.props.Map;
import dev.SoulSaver.entities.Static.props.OpenStack;
import dev.SoulSaver.entities.Static.props.PlainNightStand;
import dev.SoulSaver.entities.Static.props.PlainStool;
import dev.SoulSaver.entities.Static.props.PlainTable;
import dev.SoulSaver.entities.Static.props.SackStack;
import dev.SoulSaver.entities.Static.props.TinyBed;
import dev.SoulSaver.entities.Static.props.WashBucket;
import dev.SoulSaver.entities.creatures.Enemies.Souls;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;

public class InsideHouse extends World{

	int sX, sY;
	static int door;
	
	public InsideHouse(Handler handler, String path, int chests){
		super(handler, path, chests);
		setSpawn();
		entityManager = new EntityManager(handler, new Player(handler, sX, sY));
		IU = new ItemUtil(handler);		
		swords();
		populateEntities();
		setItems();
		world = 0;
		
		music();
		JukeBox.load("/Music/BGMusic.mp3", "BG");
		JukeBox.setVolume("BG", -10);
		JukeBox.loop("BG");
	}
	
	public void populateEntities(){
		
		entityManager.addEntity(sword);
		entityManager.addEntity(bow);
		entityManager.addEntity(boom);
		entityManager.addEntity(shield);
		entityManager.addEntity(fan);
		entityManager.addEntity(ele);
		entityManager.addEntity(potion);
		//PCHouse
		entityManager.addEntity(new ClockSmall(handler, Tile.TILEWIDTH * 24, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 24, (Tile.TILEHEIGHT * 11) - 13, 22));
		entityManager.addEntity(new TinyBed(handler, Tile.TILEWIDTH * 20, (Tile.TILEHEIGHT * 3) + 32));
		entityManager.addEntity(new PlainNightStand(handler, Tile.TILEWIDTH * 21, (Tile.TILEHEIGHT * 3) + 32));
		entityManager.addEntity(new FirePlace(handler, Tile.TILEWIDTH * 22, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new PlainTable(handler, Tile.TILEWIDTH * 27, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new PlainStool(handler, Tile.TILEWIDTH * 28, Tile.TILEHEIGHT * 6));
		entityManager.addEntity(new OpenStack(handler, Tile.TILEWIDTH * 26, (Tile.TILEHEIGHT * 3) + 32));
		entityManager.addEntity(new WashBucket(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 9));
		entityManager.addEntity(new Souls(handler, Tile.TILEWIDTH * 20, Tile.TILEHEIGHT * 10, 1, 1, 0));
		
		//Shop
		entityManager.addEntity(new ClockSmall(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new Map(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 2));
		entityManager.addEntity(new Transport(handler, Tile.TILEWIDTH * 7, (Tile.TILEHEIGHT * 11) - 13, 21));
		entityManager.addEntity(new ShopShelf(handler, Tile.TILEWIDTH * 5, Tile.TILEHEIGHT * 4, 1));
		entityManager.addEntity(new ShopShelf(handler, Tile.TILEWIDTH * 11, Tile.TILEHEIGHT * 8, 1));
		entityManager.addEntity(new ShopShelf(handler, Tile.TILEWIDTH * 6, (Tile.TILEHEIGHT * 5), 3));
		entityManager.addEntity(new ShopShelf(handler, Tile.TILEWIDTH * 9, Tile.TILEHEIGHT * 4, 2));
		entityManager.addEntity(new ShopShelf(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 8, 2));
		entityManager.addEntity(new PlainStool(handler, Tile.TILEWIDTH * 3, Tile.TILEHEIGHT * 4));
		entityManager.addEntity(new SackStack(handler, Tile.TILEWIDTH * 11, (Tile.TILEHEIGHT * 3) + 32));
		
		entityManager.addEntity(new PurchaseItem(handler, Tile.TILEWIDTH * 7, (Tile.TILEHEIGHT * 6) + 5, 1));
		entityManager.addEntity(new PurchaseItem(handler, (Tile.TILEWIDTH * 5) - 5, Tile.TILEHEIGHT * 5, 2));
		entityManager.addEntity(new PurchaseItem(handler, (Tile.TILEWIDTH * 9) + 5, Tile.TILEHEIGHT * 5, 3));
		entityManager.addEntity(new PurchaseItem(handler, (Tile.TILEWIDTH * 3) + 5, Tile.TILEHEIGHT * 8 + 32, 4));
		entityManager.addEntity(new PurchaseItem(handler, (Tile.TILEWIDTH * 3) + 5, Tile.TILEHEIGHT * 10, 5));
		entityManager.addEntity(new PurchaseItem(handler, (Tile.TILEWIDTH * 11) - 5, Tile.TILEHEIGHT * 8 + 32, 6));
		entityManager.addEntity(new PurchaseItem(handler, (Tile.TILEWIDTH * 11) - 5, Tile.TILEHEIGHT * 10, 7));
		
		entityManager.addEntity((new Human(handler, Tile.TILEWIDTH * 44, Tile.TILEHEIGHT * 8, 11)));
		entityManager.addEntity(new Gorilla(handler, Tile.TILEWIDTH * 66, Tile.TILEHEIGHT * 8, 13));
		entityManager.addEntity((new Human(handler, Tile.TILEWIDTH * 7, Tile.TILEHEIGHT *8, 10)));
		
	}
	
	private void setSpawn(){
		switch(location){
		case 1: 
			sX = Tile.TILEWIDTH * 7;
			sY = (Tile.TILEHEIGHT * 10) - 5;
			break;
		case 2:
			sX = Tile.TILEWIDTH * 24;
			sY = (Tile.TILEHEIGHT * 10) - 5;
			break;
		case 3:
			sX = Tile.TILEWIDTH * 41;
			sY = Tile.TILEHEIGHT * 2;
			break;
		case 4:
			sX = Tile.TILEWIDTH * 62;
			sY = Tile.TILEHEIGHT * 2;
			break;
		case 5:
			sX = Tile.TILEWIDTH * 24;
			sY = (Tile.TILEHEIGHT * 5) - 5;
			break;
		default :
			sX = spawnX;
			sY = spawnY;
		}
	}
	
	public static void setDoor(int house){
		door = house;
	}
	
	
	public void tick(){
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

	@Override
	public void setItems() {
		// TODO Auto-generated method stub
		
	}	
}