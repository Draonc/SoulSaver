package dev.SoulSaver.data;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import dev.SoulSaver.Handler;

public class LoadData {

	private int curHealth, totHealth, hearts, arrows, coins, potions, souls, i;
	private boolean male1, male2, female1, female2;
	private boolean boomP, bowP, eleP, fanP, shieldP, swordP;
	private boolean[] soulList = new boolean[91]; 
	private String path = System.getProperty("user.home");;
	private Handler handler;
	
	public LoadData(Handler handler){
		this.handler = handler;
	}

	public void Load() {
		set();
		path="SoulSaver.sav";
		// Wrap all in a try/catch block to trap I/O errors.
		try {
			// Open file to read from, named SavedObjects.sav.
			FileInputStream saveFile = new FileInputStream(path);

			// Create an ObjectInputStream to get the objects from the save
			// file.
			ObjectInputStream save = new ObjectInputStream(saveFile);

			// Now we do the restore.
			// readObject() returns a generic Object, we cast those back
			// into their original class type.
			// For primitive types, we use the corresponding reference class.
			curHealth = (Integer) save.readObject();
			totHealth = (Integer) save.readObject();
			hearts = (Integer) save.readObject();
			arrows = (Integer) save.readObject();
			coins = (Integer) save.readObject();
			potions = (Integer) save.readObject();
			i = (Integer) save.readObject();
			souls = (Integer) save.readObject();
			
			male1 = (boolean) save.readObject();
			male2 = (boolean) save.readObject();;
			female1 = (boolean) save.readObject();
			female2  = (boolean) save.readObject();
			
			boomP = (boolean) save.readObject();
			bowP = (boolean) save.readObject();
			eleP = (boolean) save.readObject();
			fanP = (boolean) save.readObject();
			shieldP = (boolean) save.readObject();
			swordP = (boolean) save.readObject();
			
			soulList = (boolean[]) save.readObject();
			

			// Close the file.
			save.close(); // This also closes saveFile.
		} catch (Exception exc) {
			exc.printStackTrace(); // If there was an error, print the info.
		}
		
		set();
	}
	
	public void set(){
		if(curHealth == 0){
			handler.getHealthBar().setCurHealth(3);
		}else{
			handler.getHealthBar().setCurHealth(curHealth);
		}
		
		handler.getHealthBar().setTotHealth(totHealth);
		handler.getInventory().setHearts(hearts);
		handler.getInventory().setLArrows(arrows);
		handler.getInventory().setLPotions(potions);
		handler.getInventory().setI(i);
		handler.getInventory().setLCoins(coins);
		handler.getInventory().setLSouls(souls);
		
		handler.getGame().setMale1(male1);
		handler.getGame().setMale2(male2);
		handler.getGame().setFemale1(female1);
		handler.getGame().setFemale2(female2);
		
		handler.getInventory().setBoomP(boomP);
		handler.getInventory().setBowP(bowP);
		handler.getInventory().setEleP(eleP);
		handler.getInventory().setFanP(fanP);
		handler.getInventory().setShieldP(shieldP);
		handler.getInventory().setSwordP(swordP);
		
		handler.getInventory().setSoulList(soulList);
	}
	
}
