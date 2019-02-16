package dev.SoulSaver.entities.Static.items;

import java.awt.Color;
import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.creatures.Creature;
import dev.SoulSaver.states.DigitalState;
import dev.SoulSaver.states.DungeonState;
import dev.SoulSaver.states.Fire_IceState;
import dev.SoulSaver.states.ForestState;
import dev.SoulSaver.states.GameState;
import dev.SoulSaver.states.InsideHouseState;
import dev.SoulSaver.states.MansionState;
import dev.SoulSaver.states.MazeState;
import dev.SoulSaver.states.ShipState;
import dev.SoulSaver.states.SkyState;
import dev.SoulSaver.states.State;
import dev.SoulSaver.states.SwampState;
import dev.SoulSaver.worlds.InsideHouse;
import dev.SoulSaver.worlds.OverWorld;

public class Transport extends Items {
	private int transport;

	public Transport(Handler handler, float x, float y, int transport) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		this.transport = transport;
		//bounds.height = 70;
	}
	
	@Override 
	public void action(){
		if(this.getRectangle().intersects(handler.getWorld().getEntityManager().getPlayer().getRectangle())){
			switch(transport){
			case 1:
				State.setState(new MazeState(handler));
				break;
			case 2:
				State.setState(new Fire_IceState(handler));
				break;
			case 3:
				State.setState(new SwampState(handler));
				break;
			case 4:
				State.setState(new MansionState(handler));
				break;
			case 5:
				State.setState(new ShipState(handler));
				break;
			case 6:
				State.setState(new DungeonState(handler));
				break;
			case 7:
				State.setState(new ForestState(handler));
				break;
			case 8:
				State.setState(new SkyState(handler));
				break;
			case 9:
				State.setState(new DigitalState(handler));
				break;
			case 10:
				InsideHouse.setLocation(1);
				State.setState(new InsideHouseState(handler));
				break;
			case 11:
				OverWorld.setLocation(1);
				State.setState(new GameState(handler));
				break;
			case 12:
				OverWorld.setLocation(2);
				State.setState(new GameState(handler));
				break;
			case 13:
				OverWorld.setLocation(3);
				State.setState(new GameState(handler));
				break;
			case 14:
				OverWorld.setLocation(4);
				State.setState(new GameState(handler));
				break;
			case 15:
				OverWorld.setLocation(5);
				State.setState(new GameState(handler));
				break;
			case 16:
				OverWorld.setLocation(6);
				State.setState(new GameState(handler));
				break;
			case 17:
				OverWorld.setLocation(7);
				State.setState(new GameState(handler));
				break;
			case 18:
				OverWorld.setLocation(8);
				State.setState(new GameState(handler));
				break;
			case 19:
				OverWorld.setLocation(9);
				State.setState(new GameState(handler));
				break;
			case 20:
				InsideHouse.setLocation(2);
				State.setState(new InsideHouseState(handler));
				break;
			case 21:
				OverWorld.setLocation(10);
				State.setState(new GameState(handler));
				break;
			case 22:
				OverWorld.setLocation(11);
				State.setState(new GameState(handler));
				break;
			case 23:
				InsideHouse.setLocation(3);
				State.setState(new InsideHouseState(handler));
				break;
			case 24:
				InsideHouse.setLocation(4);
				State.setState(new InsideHouseState(handler));
				break;
				
			}
		}
	}

	@Override
	public void tick() {
		action();
		
	}

	@Override
	public void render(Graphics2D g) {
		//g.setColor(Color.red);
		//g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
		//		(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
		
	}

}
