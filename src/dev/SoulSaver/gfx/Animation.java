 package dev.SoulSaver.gfx;

import java.awt.image.BufferedImage;

/**
 * This class cycles though an array of buffered images and to make it seem as if the
 * image is moving.
 *
 */

public class Animation {
	
	private int speed, index;
	private long lastTime, timer;
	private BufferedImage[] frames;
	
	public Animation(int speed, BufferedImage[] frames){
		this.speed = speed;
		this.frames = frames;
		index = 0;
		timer = 0;
		lastTime = System.currentTimeMillis();
	}
	
	public void tick(){
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		
		if(timer > speed){
			index++;
			timer = 0;
			if(index >= frames.length)
				index = 0;
		}
	}
	
	public boolean end(){
		if(index >= frames.length)
			return true;
		else
			return false;
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public BufferedImage getCurrentFrame(){
		return frames[index];
	}
	
	public BufferedImage getImage(int frame){
		return frames[frame];
	}

}
