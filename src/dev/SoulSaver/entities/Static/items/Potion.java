package dev.SoulSaver.entities.Static.items;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.data.JukeBox;

public class Potion extends Items {
	private boolean equipped;

	public Potion(Handler handler) {
		super(handler, 0, 0, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		bounds.width = 0;
		bounds.height = 0;
		equipped = true;
	}

	public boolean isEquipped() {
		return equipped;
	}

	public void setEquipped(boolean b) {
		equipped = b;
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
	}

	@Override
	public void action() {
		if (equipped) {
			
		}
	}

}
