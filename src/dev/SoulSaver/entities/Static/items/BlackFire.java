package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.NPC;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;

public class BlackFire extends NPC{
	private Animation anim;
	
	public BlackFire(Handler handler, float x, float y) {
		super(handler, x, y, 0, false, 1);
		anim = new Animation(300, Assets.blackFire);
	}

	@Override
	public void tick() {
		anim.tick();
		attack();
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}
	
	
	protected BufferedImage getCurrentAnimationFrame() {
			return anim.getCurrentFrame();
	}

	@Override
	public void setAnimation(int world) {
		// TODO Auto-generated method stub
		
	}

}
