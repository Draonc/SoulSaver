package dev.SoulSaver.entities.Static.Houses;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Turn2O extends StaticEntity{

	public Turn2O(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.y = 54;
		bounds.width = (Tile.TILEWIDTH * 8) * 2/3;
		bounds.height = ((Tile.TILEHEIGHT * 11) * 2/3) + 3;
	}

	@Override
	public void tick() {		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.turn2O,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), (Tile.TILEWIDTH * 8) * 2/3, (Tile.TILEWIDTH * 14) * 2/3, null);
	
		//g.setColor(Color.red);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),	(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}
}
