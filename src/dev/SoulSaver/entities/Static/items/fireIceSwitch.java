package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Entity;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.entities.Swords.ElementalSword;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class fireIceSwitch extends StaticEntity {
	private BufferedImage image;
	private boolean ice;

	public fireIceSwitch(Handler handler, float x, float y, boolean ice) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.ice = ice;
		setImage();
	}
	
	public void action(){
		for(Entity e : handler.getWorld().getEntityManager().getEntities()){
			if(e instanceof ElementalSword){
				if(e.getCollisionBounds(0f, 0f).intersects(this.getRectangle())){
					if(ice){
						handler.getWorld().getEle().setBlue(true);
					}else
						handler.getWorld().getEle().setBlue(false);
				}
			}
		}
	}
	
	public void setImage(){
		if(ice)
			image = Assets.iceSwitch;
		else
			image = Assets.fireSwitch;
	}

	@Override
	public void tick() {
	action();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
	}

}
