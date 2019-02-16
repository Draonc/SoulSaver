package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class ClimbRope extends Items {
	private float nX, nY;

	public ClimbRope(Handler handler, float x, float y, float nX, float nY) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.nX = nX;
		this.nY = nY;
		bounds.x = 26;
		bounds.y = 32;
		bounds.width = 6;
		bounds.height = 32;
	}

	@Override
	public void action() {
		if(this.getRectangle().intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle()) && handler.getKeyManager().interact){
			handler.getWorld().getEntityManager().getPlayer().setX(nX);
			handler.getWorld().getEntityManager().getPlayer().setY(nY);
		}
	}

	@Override
	public void tick() {
		action();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.climbRope, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);		
		
	}

}
