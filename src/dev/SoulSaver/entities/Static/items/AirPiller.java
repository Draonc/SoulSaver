package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.entities.creatures.Enemies.FanBlast;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;
import dev.SoulSaver.utils.Timer;

public class AirPiller extends StaticEntity {
	private boolean operate;
	private int id,id2;
	private Timer timer;
	private boolean fired;

	public AirPiller(Handler handler, float x, float y, boolean operate, int id, int id2) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.operate = operate;
		this.id = id;
		this.id2 = id2;
		fired = false;
		timer = new Timer();
		timer.Start();
		bounds.height = height * 2;
		

	}
	
	public void action(){
		if(operate && timer.run(.5f) ){
			handler.getWorld().getEntityManager().addEntity(new FanBlast(handler, x-50, y + 90, true, false, false, false));
			timer.Start();
		}
	}
	
	public int getId(){
		return id;
	}
	
	public int getId2(){
		return id2;
	}
	
	public void setOperate(){
		if(operate)
			operate = false;
		else
			operate = true;
	}

	@Override
	public void tick() {
		action();
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.airPiller, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height * 2, null);
		
	}

}
