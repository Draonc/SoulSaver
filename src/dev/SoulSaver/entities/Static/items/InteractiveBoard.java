package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class InteractiveBoard extends Items {
	private BufferedImage image;
	private int dia1, dia2, dia3;

	public InteractiveBoard(Handler handler, float x, float y, int type, int dia1, int dia2, int dia3) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.width = width * 2;
		setImage(type);
		this.dia1 = dia1;
		this.dia2 = dia2;
		this.dia3 = dia3;
	}

	@Override
	public void action() {
		if(this.getCollisionBounds(0f, 0f).intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle()) && handler.getKeyManager().interact){
			System.out.println("Interact");
			
			handler.getGame().getPrintScreen().setDia1(dia1);
			handler.getGame().getPrintScreen().setDia2(dia2);
			handler.getGame().getPrintScreen().setDia3(dia3);
			
			handler.getGame().getPrintScreen().setPrint(true);
			handler.getGame().getPrintScreen().setRiddle(true);
			handler.getGame().getPrintScreen().getTimer().Start();
		}
	}
	
	public void setImage(int type){
		if(type == 1){
			image = Assets.riddleStone;
		}
		
		if(type == 2){
			image = Assets.riddleWood;
		}
	}

	@Override
	public void tick() {
		action();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(image,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width * 2, height, null);
	}

}
