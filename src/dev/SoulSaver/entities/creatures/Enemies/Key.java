package dev.SoulSaver.entities.creatures.Enemies;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.EntityManager;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.CreaturesUtil;

public class Key extends StaticEntity{
	private static int keys = 0;

	public Key(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.width = 0;
		bounds.height = 0;
	}
	
	private void getKey(){
		if(CreaturesUtil.dist(EntityManager.getPlayer().getX() + 32, EntityManager.getPlayer().getY() + 32, x + 16, y + 16) < 32){
		keys++;
		JukeBox.play("KeyP");
		handler.getWorld().getEntityManager().removeEntity(this);
		}
	}
	
	public static void useKey(){
		JukeBox.play("KeyU");
			keys--;
	}
	
	public static int getKeys(){
		return keys;
	}

	@Override
	public void tick() {
		if(keys < 0)
			keys = 0;
		getKey();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.key,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width/2, height, null);
		
	}

}
