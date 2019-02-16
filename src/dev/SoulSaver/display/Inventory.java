package dev.SoulSaver.display;

import java.util.ArrayDeque;
import java.util.Queue;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.Static.items.Potion;

public class Inventory {
	private Handler handler;
	private int bombs, arrows, coins, potions, souls, hearts, counter, i;
	private float pX, pY;
	private Queue<String> endCode;
	private boolean boom, bow, ele, fan, shield, sword, start;
	private boolean boomP, bowP, eleP, fanP, shieldP, swordP, heartsP;
	private boolean[] soulList;

	private Potion potion;

	public Inventory() {
		bombs = 10;
		arrows = 10;
		coins = 10;
		potions = 2;
		hearts = 0;
		souls = 9;
		i = 1;

		boom = false;
		bow = false;
		ele = false;
		fan = false;
		shield = false;
		sword = false;

		boomP = false;
		bowP = false;
		eleP = false;
		fanP = false;
		shieldP = false;
		swordP = true;
		soulList = new boolean[91];

		for (Boolean b : soulList) {
			b = false;
		}

		potion = new Potion(handler);
		endCode = new ArrayDeque<String>();
	}

	//Pushes the letter into the queue that is registered from the button pressed.
	public void addCode(String letter) {
		endCode.add(letter);
		System.out.println(letter);
		counter++;
	}

	public boolean[] getSoulList() {
		return soulList;
	}

	public void setSoulList(boolean[] soulList) {
		this.soulList = soulList;
	}

	public void setSoul(int id, boolean b) {
		soulList[id] = b;
	}

	public boolean isCollected(int id) {
		return soulList[id];
	}

	public int getCounter() {
		return counter;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	/**
	 * This checks the code the player enters. It pops the queue adding it the the string.
	 * If the string is equal to the input code the final room opens up.
	 * 
	 * The code is the string minus the E which was just used to initialize code.
	 */

	public int checkCode() {
		int right = 0;
		String code = "E";
		if (counter == 10) {
			while (!endCode.isEmpty()) {
				code = code + endCode.remove();
			}
			//This is the easter egg code it is the konami code that has been used in many games.
			//Up, Up, Down, Down, Left, Right, Left, Right, B, A
			if (code.equals("EUUDDLRLRBA")) {
				right = 1;
				JukeBox.play("Recieved");
				counter = 0;
			} else if (code.equals("ELURABLDUDR")) {
				right = 2;
				JukeBox.play("Right");
				counter = 0;
			} else {
				JukeBox.play("Wrong");
				counter = 0;
			}
		}
		return right;
	}

	public void usePotion() {
		potions -= 1;
	}

	public void setPosition() {
		if (handler.getWorld().getEntityManager().getPlayer().isLeft()) {
			pX = handler.getWorld().getEntityManager().getPlayer().getX() - 64;
			pY = handler.getWorld().getEntityManager().getPlayer().getY();
		}

		if (handler.getWorld().getEntityManager().getPlayer().isRight()) {
			pX = handler.getWorld().getEntityManager().getPlayer().getX() + 64;
			pY = handler.getWorld().getEntityManager().getPlayer().getY();
		}

		if (handler.getWorld().getEntityManager().getPlayer().isUp()) {
			pX = handler.getWorld().getEntityManager().getPlayer().getX();
			pY = handler.getWorld().getEntityManager().getPlayer().getY() - 64;
		}

		if (handler.getWorld().getEntityManager().getPlayer().isDown()) {
			pX = handler.getWorld().getEntityManager().getPlayer().getX();
			pY = handler.getWorld().getEntityManager().getPlayer().getY() + 64;
		}

	}

	public void inHearts() {
		hearts += 1;
	}

	public int getHearts() {
		return hearts;
	}

	public void setHearts(int num) {
		this.hearts = num;
	}

	public boolean isHeartsP() {
		if (hearts <= 5) {
			return false;
		} else
			return true;
	}

	public boolean isBoom() {
		return boom;
	}

	public void setBoom(boolean boom) {
		this.boom = boom;
	}

	public boolean isBow() {
		return bow;
	}

	public void setBow(boolean bow) {
		this.bow = bow;
	}

	public boolean isEle() {
		return ele;
	}

	public void setEle(boolean ele) {
		this.ele = ele;
	}

	public boolean isFan() {
		return fan;
	}

	public void setFan(boolean fan) {
		this.fan = fan;
	}

	public boolean isShield() {
		return shield;
	}

	public void setShield(boolean shield) {
		this.shield = shield;
	}

	public boolean isSword() {
		return sword;
	}

	public void setSword(boolean sword) {
		this.sword = sword;
	}

	public boolean isBoomP() {
		return boomP;
	}

	public void setBoomP(boolean boomP) {
		this.boomP = boomP;
	}

	public boolean isBowP() {
		return bowP;
	}

	public void setBowP(boolean bowP) {
		this.bowP = bowP;
	}

	public boolean isEleP() {
		return eleP;
	}

	public void setEleP(boolean eleP) {
		this.eleP = eleP;
	}

	public boolean isFanP() {
		return fanP;
	}

	public void setFanP(boolean fanP) {
		this.fanP = fanP;
	}

	public boolean isShieldP() {
		return shieldP;
	}

	public void setShieldP(boolean shieldP) {
		this.shieldP = shieldP;
	}

	public boolean isSwordP() {
		return swordP;
	}

	public void setSwordP(boolean swordP) {
		this.swordP = swordP;
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public int getBombs() {
		return bombs;
	}

	public void setBombs(int num) {
		bombs += num;
	}

	public int getArrows() {
		return arrows;
	}

	public void setArrows(int num) {
		arrows += num;
	}

	public void setLArrows(int num) {
		arrows = num;
	}

	public void useArrow() {
		arrows--;
	}

	public int getCoins() {
		return coins;
	}

	public void useCoins(int amount) {
		coins -= amount;
	}

	public void setCoins(int num) {
		coins += num;
	}

	public void setLCoins(int num) {
		coins = num;
	}

	public int getPotions() {
		return potions;
	}

	public void setSouls(int soul) {
		souls += soul;
	}

	public int getSouls() {
		return souls;
	}

	public void addSoul() {
		souls += 1;
	}

	public void setLSouls(int num) {
		souls = num;
	}

	public void setPotions(int num) {
		potions += num;
	}

	public void setLPotions(int num) {
		potions = num;
	}

	public Potion getPotion() {
		return potion;
	}

}
