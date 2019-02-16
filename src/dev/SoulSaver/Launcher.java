package dev.SoulSaver;
/**
* This Soul Saver a 2d top down role playing game.
* The player must collect 100 souls through out 
* multiple dungeons within the game.
* Once the souls are collected the player can input 
* the code given or an easter egg code to get an alternate ending.
* 
* Controls: Movement W/A/S/D or arrow keys
* 			Fighting F
* 			Potion   E
* 			Pause 	 P
* 			Interact SpaceBar* 
*
* @author  Adam Barron, Candice Sandefur, Winston Smith.
* @version 1.0
* @since   12-5-2016 
*/
public class Launcher {

	public static void main(String[] args){
		Game game = new Game("Soul Saver", 1024, 768);
		game.start();
	}
	
}