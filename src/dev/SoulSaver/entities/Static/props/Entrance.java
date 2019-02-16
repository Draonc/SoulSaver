package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Entrance extends StaticEntity {
	private int h;
	private BufferedImage image;
	
	
	public Entrance(Handler handler, float x, float y, int world) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		setImage(world);
	}
	
	public void setImage(int world){
		switch (world) {
		case 1:
			//Maze
			image = Assets.mazeEntrance;
			h = 3;
			bounds.y = 64;
			bounds.width = Creature.DEFAULT_CREATURE_WIDTH * 3;
			bounds.height = Creature.DEFAULT_CREATURE_HEIGHT * 2;
			break;
		case 2:
			//Fire-ice
			image = Assets.fire_IceEntrance;
			h = 2;
			bounds.y = 64;
			bounds.width = Creature.DEFAULT_CREATURE_WIDTH * 3;
			bounds.height = Creature.DEFAULT_CREATURE_HEIGHT;
			break;
		case 3:
			//Swamp
			image = Assets.swampEntrance;
			h = 2;
			bounds.y = 64;
			bounds.width = Creature.DEFAULT_CREATURE_WIDTH * 3;
			bounds.height = Creature.DEFAULT_CREATURE_HEIGHT;
			break;
		case 4:
			//Mansion
			image = Assets.mansionEntrance;
			h = 3;
			bounds.y = 64;
			bounds.width = Creature.DEFAULT_CREATURE_WIDTH * 3;
			bounds.height = Creature.DEFAULT_CREATURE_HEIGHT * 2;
			break;
		case 5:
			//Ship
			image = Assets.shipEntrance;
			h = 2;
			bounds.y = 64;
			bounds.width = Creature.DEFAULT_CREATURE_WIDTH * 3;
			bounds.height = Creature.DEFAULT_CREATURE_HEIGHT;
			break;
		case 6:
			//Dungeon
			image = Assets.DungeonEntrance;
			h = 2;
			bounds.y = 64;
			bounds.width = Creature.DEFAULT_CREATURE_WIDTH * 3;
			bounds.height = Creature.DEFAULT_CREATURE_HEIGHT;
			break;
		case 7:
			//Forest
			image = Assets.forestEntrance;
			h = 2;
			bounds.y = 64;
			bounds.width = Creature.DEFAULT_CREATURE_WIDTH * 3;
			bounds.height = Creature.DEFAULT_CREATURE_HEIGHT;
			break;
		case 8:
			//Sky
			image = Assets.skyEntrance;
			h = 2;
			bounds.y = 64;
			bounds.width = Creature.DEFAULT_CREATURE_WIDTH * 3;
			bounds.height = Creature.DEFAULT_CREATURE_HEIGHT;
			break;
		case 9:
			//Digital
			image = Assets.digitalEntrance;
			h = 2;
			bounds.y = 64;
			bounds.width = Creature.DEFAULT_CREATURE_WIDTH * 3;
			bounds.height = Creature.DEFAULT_CREATURE_HEIGHT;
			break;
		case 10:
			//Digital
			image = Assets.heavenEntrance;
			h = 2;
			bounds.y = 64;
			bounds.width = Creature.DEFAULT_CREATURE_WIDTH * 3;
			bounds.height = Creature.DEFAULT_CREATURE_HEIGHT;
			break;
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width * 3, height * h, null);
		
		
		//g.setColor(Color.blue);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//		(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}

}
