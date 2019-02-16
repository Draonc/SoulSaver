package dev.SoulSaver.creatures;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;


/**
 * This Class sets up all the non monster, non player characters in the game.
 *
 */
public class Human extends NPC {
	private int dia;

	public Human(Handler handler, float x, float y, int world) {
		super(handler, x, y, 1f, true, 1000);
		setAnimation(world);
		dia = world;
	}
	
	public void setDia(int dia){
		this.dia = dia;
	}

	@Override
	public void tick() {
		look();
		action();
		walk();
		move();
		Speak(dia);
		animUp.tick();
		animDown.tick();
		animLeft.tick();
		animRight.tick();
	}
	
	/**
	 * Sets animation of the human.
	 */

	@Override
	public void setAnimation(int world) {
		switch (world) {
		case 1:
			animUp = new Animation(300, Assets.man6_up);
			animDown = new Animation(300, Assets.man6_down);
			animLeft = new Animation(300, Assets.man6_left);
			animRight = new Animation(300, Assets.man6_right);
			break;
		case 2:
			animUp = new Animation(300, Assets.lady7_up);
			animDown = new Animation(300, Assets.lady7_down);
			animLeft = new Animation(300, Assets.lady7_left);
			animRight = new Animation(300, Assets.lady7_right);
			break;
		case 3:
			animUp = new Animation(300, Assets.man4_up);
			animDown = new Animation(300, Assets.man4_down);
			animLeft = new Animation(300, Assets.man4_left);
			animRight = new Animation(300, Assets.man4_right);
			break;
		case 4:
			animUp = new Animation(300, Assets.lady5_up);
			animDown = new Animation(300, Assets.lady5_down);
			animLeft = new Animation(300, Assets.lady5_left);
			animRight = new Animation(300, Assets.lady5_right);
			break;
		case 5:
			animUp = new Animation(300, Assets.man1_up);
			animDown = new Animation(300, Assets.man1_down);
			animLeft = new Animation(300, Assets.man1_left);
			animRight = new Animation(300, Assets.man1_right);
			break;
		case 6:
			animUp = new Animation(300, Assets.man8_up);
			animDown = new Animation(300, Assets.man8_down);
			animLeft = new Animation(300, Assets.man8_left);
			animRight = new Animation(300, Assets.man8_right);
			break;
		case 7:
			animUp = new Animation(300, Assets.lady8_up);
			animDown = new Animation(300, Assets.lady8_down);
			animLeft = new Animation(300, Assets.lady8_left);
			animRight = new Animation(300, Assets.lady8_right);
			break;
		case 8:
			animUp = new Animation(300, Assets.man5_up);
			animDown = new Animation(300, Assets.man5_down);
			animLeft = new Animation(300, Assets.man5_left);
			animRight = new Animation(300, Assets.man5_right);
			break;
		case 9:
			animUp = new Animation(300, Assets.child4_up);
			animDown = new Animation(300, Assets.child4_down);
			animLeft = new Animation(300, Assets.child4_left);
			animRight = new Animation(300, Assets.child4_right);
			break;
		case 10:
			animUp = new Animation(300, Assets.man7_up);
			animDown = new Animation(300, Assets.man7_down);
			animLeft = new Animation(300, Assets.man7_left);
			animRight = new Animation(300, Assets.man7_right);
			break;
			
		case 11:
			animUp = new Animation(300, Assets.child1_up);
			animDown = new Animation(300, Assets.child1_down);
			animLeft = new Animation(300, Assets.child1_left);
			animRight = new Animation(300, Assets.child1_right);
			break;
		}

	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);

	}

}
