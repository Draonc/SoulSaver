package dev.SoulSaver.utils;

import java.util.Random;
import java.util.Stack;

import dev.SoulSaver.Handler;

public class ItemUtil {
	private Stack items;
	private Handler handler;

	public ItemUtil(Handler handler) {
		this.handler = handler;
		items = new Stack();
	}

	// This method needs to pick a random number 1-4 and return it.
	public int random() {
		Random r = new Random();
		int x = r.nextInt(4) + 1;
		return x;
	}

	
	//Pushes the number of items into the stack that is passed into the parameters
	public void setStack(int num) {
		for (int i = 0; i < num; i++) {
			items.push(getItem());
		}
	}

	//Pops and items from the stack
	public String getStack() {
		return (String) items.pop();
	}

	public int getNum() {
		int numberOfItems;

		switch (random()) {
		case 1:
			numberOfItems = 1;
			break;

		case 2:
			numberOfItems = 2;
			break;

		case 3:
			numberOfItems = 4;
			break;

		case 4:
			numberOfItems = 5;
			break;

		default:
			numberOfItems = 1;
		}
		return numberOfItems;
	}

	// This needs to have a switch case that uses the random method and sets an
	// item depending on the number.
	public String getItem() {
		String item;

		switch (random()) {
		case 1:
			item = "bomb";
			break;

		case 2:
			item = "potion";
			break;

		case 3:
			item = "coins";
			break;

		case 4:
			item = "arrows";
			break;

		default:
			item = "coins";
		}
		return item;

	}
}
