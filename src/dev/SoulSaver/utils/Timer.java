package dev.SoulSaver.utils;

public class Timer {
	private final int NANOSECONDS = 1000000000;
	private boolean timerStarted;
	private long beginTime, timeDifference;
	
	public Timer(){
		timerStarted = false;
		beginTime = 0;
		timeDifference = 0;
	}
	
	public void Start(){
		timerStarted = true;
		beginTime = System.nanoTime();
	}
	
	public void Stop(){
		timerStarted = false;
		beginTime = 0;
	}
	
	public boolean run(float i){
		while((i * NANOSECONDS) > (System.nanoTime() - beginTime)){
			return false;
		}
		return true;
	}
}
