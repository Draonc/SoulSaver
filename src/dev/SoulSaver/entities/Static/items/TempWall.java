package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class TempWall extends Items {
	private int id1, id2, id3;
	private boolean solid;
	private BufferedImage image;

	public TempWall(Handler handler, float x, float y, int id1, int id2, int id3, boolean solid, int world) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		this.id1 = id1;
		this.id2 = id2;
		this.id3 = id3;

		this.solid = solid;
		setImage(world);
	}
	
	public void setImage(int world){
		switch (world) {
		case 1:
			//Maze
			image = Assets.mazeWallTemp;
			break;
		case 2:
			//Fire-ice
			image = Assets.fireFloor2;
			break;
		case 3:
			//Swamp
			image = Assets.vines;
			break;
		case 4:
			//Mansion
			image = Assets.mansionTempWall;
			break;
		case 5:
			//Ship
			image = Assets.shipTempWall;
			break;
		case 6:
			//Dungeon
			image = Assets.dungeonTempWall;
			break;
		case 7:
			//Forest
			image = Assets.bramble;
			break;
		case 8:
			//Sky
			image = Assets.skyTempWall;
			break;
		case 9:
			//Digital
			image = Assets.digitalTempWall;
			break;
		}
	}

	public void remove() {
		active = false;
	}

	public void isSolid() {
		if (solid) {
			bounds.width = Tile.TILEWIDTH;
			bounds.height = Tile.TILEHEIGHT;
		} else {
			bounds.width = 0;
			bounds.height = 0;
		}
	}

	@Override
	public void tick() {
		isSolid();

	}

	public boolean checkID(int id) {
		if (id1 == id || id2 == id || id3 == id) {
			return true;
		} else {
			return false;
		}
	}

	public void changeSolid() {
		if (solid) 
			solid = false;
		else
			solid = true;
	}

	@Override
	public void render(Graphics2D g) {
		if (solid) {
			g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
					(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		}
	}

	@Override
	public void action() {
	}

}
