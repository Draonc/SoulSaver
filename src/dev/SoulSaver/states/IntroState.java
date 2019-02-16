package dev.SoulSaver.states;

import java.awt.Color;
import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.utils.Timer;

public class IntroState extends State {
	private int alpha;
	private int ticks;

	private Timer timer = new Timer();
	private final int FADE_IN = 60;
	private final int LENGTH = 60;
	private final int FADE_OUT = 60;

	public IntroState(Handler handler) {
		super(handler);
		ticks = 0;
		timer.Start();
	}

	public void update() {
		if(handler.getKeyManager().enter){
			State.setState(handler.getGame().menuState);
			handler.getGame().menuState.timer.Start();
		}
		
		ticks++;
		if (ticks < FADE_IN) {
			alpha = (int) (255 - 255 * (1.0 * ticks / FADE_IN));
			if (alpha < 0)
				alpha = 0;
		}
		if (ticks > FADE_IN + LENGTH) {
			alpha = (int) (255 * (1.0 * ticks - FADE_IN - LENGTH) / FADE_OUT);
			if (alpha > 255)
				alpha = 255;
		}
		if (ticks > FADE_IN + LENGTH + FADE_OUT) {
			State.setState(handler.getGame().menuState);
		}
	}

	@Override
	public void render(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 1024, 768);
		g.drawImage(Assets.intro, 0, 0, 1024, 768, null);
		g.setColor(new Color(0, 0, 0, alpha));
		g.fillRect(0, 0, 1024, 768);
	}

	public void Input() {
		if (handler.getKeyManager().enter) {
			State.setState(handler.getGame().menuState);
		}
	}

	@Override
	public void tick() {
		update();
	}
}
