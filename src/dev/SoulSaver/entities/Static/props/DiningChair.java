package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class DiningChair extends StaticEntity{
	private BufferedImage image;

	public DiningChair(Handler handler, float x, float y, int chair) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.x = 16;
		bounds.y = 80;
		bounds.width = 32;
		bounds.height = 48;
		setImage(chair);
	}
	
	public void setImage(int chair){
		if(chair == 1){
			image = Assets.diningChairDown;
		}
		
		if(chair == 2){
			image = Assets.diningChairUp;
		}
		
		if(chair == 3){
			image = Assets.diningChairLeft;
		}
		
		if(chair == 4){
			image = Assets.diningChairRight;
		}
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height * 2, null);
	}

}
