package dev.SoulSaver.entities;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Comparator;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Player;

public class EntityManager {

	private Handler handler;
	private static Player player;
	private static ArrayList<Entity> entities;

	// Compares Entities in the Entity Array list and depending on where they
	// are on the screen it chooses who to render first
	private Comparator<Entity> renderSorter = new Comparator<Entity>() {
		@Override
		public int compare(Entity a, Entity b) {
			if (a.getY() + a.getHeight() < b.getY() + b.getHeight())
				return -1;
			return 1;
		}
	};

	public EntityManager(Handler handler, Player player) {
		this.handler = handler;
		this.player = player;
		entities = new ArrayList<Entity>();
		addEntity(player);

	}

	public void tick() {
		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.tick();
			if (!e.isActive())
				removeEntity(e);

		}
		entities.sort(renderSorter);
	}

	// Renders all the Entities in the Entity Array
	public void render(Graphics2D g) {
		for (Entity e : entities) {
			e.render(g);
		}
	}

	// Adds Entity to the Entity Array
	public void addEntity(Entity e) {
		entities.add(e);
	}

	// Removes Entity from the Entity Array
	public void removeEntity(Entity e) {
		entities.remove(e);
	}

	// GETTERS SETTERS

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public static Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void removePlayer() {
		removeEntity(player);
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}
}