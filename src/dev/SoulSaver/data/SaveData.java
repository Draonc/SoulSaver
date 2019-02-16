package dev.SoulSaver.data;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import dev.SoulSaver.Handler;
import dev.SoulSaver.display.HealthBar;

public class SaveData {

	private int curHealth, totHealth, hearts, arrows, coins, potions, souls, i;
	private boolean boomP, bowP, eleP, fanP, shieldP, swordP, male1, male2, female1, female2;
	private boolean[] soulList = new boolean[91];
	private String path = null;
	private Handler handler;

	public SaveData(Handler handler) {
		this.handler = handler;
	}

	public void get() {
		curHealth = handler.getHealthBar().getCurHealth();
		totHealth = handler.getHealthBar().getTotHealth();
		hearts = handler.getInventory().getHearts();
		arrows = handler.getInventory().getArrows();
		coins = handler.getInventory().getCoins();
		potions = handler.getInventory().getPotions();
		souls = handler.getInventory().getSouls();
		i = handler.getInventory().getI();

		male1 = handler.getGame().isMale1();
		male2 = handler.getGame().isMale2();
		female1 = handler.getGame().isFemale1();
		female2 = handler.getGame().isFemale2();

		boomP = handler.getInventory().isBoomP();
		bowP = handler.getInventory().isBowP();
		eleP = handler.getInventory().isEleP();
		fanP = handler.getInventory().isFanP();
		shieldP = handler.getInventory().isShieldP();
		swordP = handler.getInventory().isSwordP();

		soulList = handler.getInventory().getSoulList();
		path = System.getProperty("user.home");
	}

	public void Save() {
		get();
		path = "SoulSaver.sav";
		try {
			FileOutputStream saveFile = new FileOutputStream(path);

			// Create an ObjectOutputStream to put the objects into the save
			// file.
			ObjectOutputStream save = new ObjectOutputStream(saveFile);

			// Now we do the save.
			save.writeObject(curHealth);
			save.writeObject(totHealth);
			save.writeObject(hearts);
			save.writeObject(arrows);
			save.writeObject(coins);
			save.writeObject(potions);
			save.writeObject(i);
			save.writeObject(souls);
			save.writeObject(male1);
			save.writeObject(male2);
			save.writeObject(female1);
			save.writeObject(female2);
			save.writeObject(boomP);
			save.writeObject(bowP);
			save.writeObject(eleP);
			save.writeObject(fanP);
			save.writeObject(shieldP);
			save.writeObject(swordP);
			save.writeObject(soulList);

			// Close the file.
			save.close(); // This also closes saveFile.
		} catch (Exception exc) {
			exc.printStackTrace(); // If there was an error, print the info.
		}
	}
}
