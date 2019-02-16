package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class ShipBanister extends StaticEntity {
	private BufferedImage image;
	
	public ShipBanister(Handler handler, float x, float y, int banister) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.y = 48;
		bounds.height = 20;
		setImage(banister);
	}
	
	public void setImage(int banister){
		if(banister == 1){
			image = Assets.shipBanister;
		}
		
		if(banister == 2){
			image = Assets.shipBanisterBroken;
		}
		
		if(banister == 3){
			image = Assets.shipBanisterLeft;
		}
		
		if(banister == 4){
			image = Assets.shipBanisterRight;
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
