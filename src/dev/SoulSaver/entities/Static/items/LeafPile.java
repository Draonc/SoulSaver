package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.Chest;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.entities.creatures.Enemies.Normal;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class LeafPile extends StaticEntity {
	private boolean chest, monster, hole, removed;

	public LeafPile(Handler handler, float x, float y, boolean chest, boolean monster, boolean hole) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.chest = chest;
		this.monster = monster;
		this.hole = hole;
		removed = false;
	}
	
	public boolean getChest(){
		return chest;
	}
	
	public boolean getMonster(){
		return monster;
	}
	
	public boolean getHole(){
		return hole;
	}

	public void remove() {
		if (chest) {
			handler.getWorld().getEntityManager().addEntity(new Chest(handler, x, y, 0, 1));
		}

		if (monster) {
			handler.getWorld().getEntityManager().addEntity(new Normal(handler, x, y, handler.getWorld().getWorld()));
		}

		if (hole) {
			handler.getWorld().getEntityManager().addEntity(new Hole(handler, x, x));
		}
	}

	public void isRemoved() {
		if (removed) {
			bounds.width = 0;
			bounds.height = 0;
		}
	}
	
	public void setRemoved(boolean b){
		removed = b;
	}

	@Override
	public void tick() {
		isRemoved();

	}

	@Override
	public void render(Graphics2D g) {
		if (!removed) {
			g.drawImage(Assets.leafPile, (int) (x - handler.getGameCamera().getxOffset()),
					(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		}
	}

}
