package dev.SoulSaver.worlds;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.Chest;
import dev.SoulSaver.entities.Static.items.Potion;
import dev.SoulSaver.entities.Swords.BoomSword;
import dev.SoulSaver.entities.Swords.BowSword;
import dev.SoulSaver.entities.Swords.ElementalSword;
import dev.SoulSaver.entities.Swords.FanSword;
import dev.SoulSaver.entities.Swords.ShieldSword;
import dev.SoulSaver.entities.Swords.Sword;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.ItemUtil;
import dev.SoulSaver.utils.Utils;


/**
 * This class is the skeleton for all the worlds in the game.
 *
 */
public abstract class World {

	protected Handler handler;
	protected int width;
	protected int height;
	protected int tWidth = Tile.TILEWIDTH;
	protected int tHeight = Tile.TILEHEIGHT;
	protected int spawnX;
	protected int spawnY;
	protected static int location;
	protected int world;
	protected int[][] tiles;
	protected Boolean[] chest;
	protected Tile tile;
	protected ItemUtil IU;
	protected BoomSword boom;
	protected BowSword bow;
	protected ElementalSword ele;
	protected FanSword fan;
	protected ShieldSword shield;
	protected Sword sword;
	protected Potion potion;

	// Entities
	protected static EntityManager entityManager;

	public World(Handler handler, String path, int chests) {
		this.handler = handler;
		tile = new Tile();
		loadWorld(path);

		chest = new Boolean[chests];

		for (int i = 0; i < chest.length; i++) {
			setChests(i, false);
		}
	}
	
	//Stops all the music so the bagground musics are not running over each other.
	
	public void music(){
		JukeBox.stop("BG");
		JukeBox.stop("BG1");
		JukeBox.stop("BG2");
		JukeBox.stop("BG3");
		JukeBox.stop("BG4");
		JukeBox.stop("BG5");
		JukeBox.stop("BG6");
		JukeBox.stop("BG7");
		JukeBox.stop("BG8");
		JukeBox.stop("BG9");
		JukeBox.stop("BG10");
	}
	
	//Adds the swords to the worlds

	public void swords() {
		boom = new BoomSword(handler);
		bow = new BowSword(handler);
		ele = new ElementalSword(handler);
		fan = new FanSword(handler);
		shield = new ShieldSword(handler);
		sword = new Sword(handler);
		potion = handler.getInventory().getPotion();
	}

	//checks to see if the swords are equipped.
	public void swordsEquipped() {
		boom.setEquipped(handler.getInventory().isBoom());
		bow.setEquipped(handler.getInventory().isBow());
		ele.setEquipped(handler.getInventory().isEle());
		fan.setEquipped(handler.getInventory().isFan());
		shield.setEquipped(handler.getInventory().isShield());
		sword.setEquipped(handler.getInventory().isSword());
	}

	public Boolean getChest(int id) {
		return chest[id];
	}

	public void setChests(int id, Boolean b) {
		chest[id] = b;
	}

	public abstract void populateEntities();

	public int getWorld() {
		return world;
	}

	public ItemUtil getUtil() {
		return IU;
	}

	public void setWorld(int level) {
		this.world = level;
	}
	

	public static void setLocation(int house) {
		location = house;
	}

	public abstract void tick();

	public abstract void render(Graphics2D g);

	public Tile returnTile() {
		return tile;
	}
	
	/**
	 * returns the tile at the set location within the matrix of tiles.
	 * @param x
	 * @param y
	 * @return
	 */

	public int getTile(int x, int y) {
		if (x < 0 || y < 0 || x >= width || y >= height) {
			return 0;
		} else {
			return tiles[x][y];
		}
	}
	
	/**
	 * This goes through the entities in the world and if they are a chest then it looks for the number of items
	 * in the chest and pushes a random number of items into the stack that are needed for the chest.
	 */

	public void setItems() {
		for (Entity e : entityManager.getEntities()) {
			if (e instanceof Chest) {
				IU.setStack(e.getItems());
			}
		}
	}
	
	/**
	 * This method takes in the txt document that contains the numbers for the world.
	 * It parses in the numbers. The first two numbers are the width and height of the world
	 * The next two numbers are used for the spawn height and width of the player.
	 * The first two numbers are used to create a matrix and the rest of the numbers are placed into the matrix.
	 */

	private void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);

		tiles = new int[width][height];
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}
	
	

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public Potion getPotion(){
		return handler.getInventory().getPotion();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public BoomSword getBoom() {
		return boom;
	}

	public BowSword getBow() {
		return bow;
	}

	public ElementalSword getEle() {
		return ele;
	}

	public FanSword getFan() {
		return fan;
	}

	public ShieldSword getShield() {
		return shield;
	}

	public Sword getSword() {
		return sword;
	}

}
