package dev.SoulSaver.creatures;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.CreaturesUtil;

public class Gorilla extends NPC {
	private float startX, startY;
	private boolean reviving, started;
	private int dia;

	public Gorilla(Handler handler, float x, float y, int dia) {
		super(handler, x, y, 1f, true, 10000);
		startX = x;
		startY = y;
		down = false;
		left = true;
		xMove = -speed;
		started = false;
		setAnimation(1);
		this.dia = dia;
	}

	@Override
	public void tick() {
		animUp.tick();
		animDown.tick();
		animLeft.tick();
		animRight.tick();
		action();
		move();
		walk();
		speak(dia);

	}

	public void speak(int dia) {
		if (y < 195) {
			System.out.println("leaving");
			if (!started){
				timer.Start();
				started = true;
			}
			handler.getGame().getPrintScreen().setDia2(dia);
			handler.getGame().getPrintScreen().setPrint(true);
			handler.getGame().getPrintScreen().setDialogue(true);
			handler.getGame().getPrintScreen().getTimer().Start();
			if (timer.run(3.5f)) {
				handler.getWorld().getEntityManager().removeEntity(this);
			}
		}

	}

	public void action() {
		if (CreaturesUtil.dist(startX, startY, x, y) > 250 && !reviving) {
			if (left) {
				xMove = speed;
			}

			if (right) {
				xMove = -speed;
			}
		}

		if (CreaturesUtil.dist(x, y, handler.getWorld().getEntityManager().getPlayer().getX(),
				handler.getWorld().getEntityManager().getPlayer().getY()) < 64) {
			reviving = true;
			xMove = 0;
			yMove = 0;
			if (timer.run(2f)) {
				xMove = 0;
				yMove = -speed;
			}
		}
	}

	@Override
	public void setAnimation(int world) {
		animLeft = new Animation(300, Assets.gorilla_Left);
		animRight = new Animation(300, Assets.gorilla_Right);
		animUp = new Animation(300, Assets.gorilla_Up);
		animDown = new Animation(300, Assets.player_downTessema);
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

	}

}
