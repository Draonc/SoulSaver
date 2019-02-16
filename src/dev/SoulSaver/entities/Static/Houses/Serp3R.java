package dev.SoulSaver.entities.Static.Houses;

import java.awt.Color;
import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Serp3R extends StaticEntity {

	public Serp3R(Handler handler, float x, float y) {
		super(handler, x, y,Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 16;
		bounds.y = 16;
		bounds.width = (Tile.TILEWIDTH * 6) * 2/3;
		bounds.height = ((Tile.TILEHEIGHT * 8) * 2/3) - 8;
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.serp3R, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), (Tile.TILEWIDTH * 6) * 2/3, (Tile.TILEHEIGHT * 10) * 2/3, null);
		//g.setColor(Color.red);

		//		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//		(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}

}
