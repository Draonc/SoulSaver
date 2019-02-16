package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.gfx.Assets;

public class Window extends Items{
	private boolean open, added;
	private int id;

	public Window(Handler handler, float x, float y, int id) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

		open = true;
		added = false;
		this.id = id;
	}
	
	public void setOpen(boolean b){
		open = b;
	}
	
	public int getId(){
		return id;
	}

	@Override
	public void tick() {
		action();
		
	}

	@Override
	public void render(Graphics2D g) {
		if(open)
			g.drawImage(Assets.windowOpen,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height * 2, null);
		else
			g.drawImage(Assets.windowClosed,(int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height * 2, null);
	}

	@Override
	public void action() {
		if(open && !added){
			handler.getWorld().getEntityManager().addEntity(new LightRay(handler, x + 105, y + 96, 3, false, false, false, false, true));
			added=true;
		}
		
		if(!open)
			added=false;
	}

}
