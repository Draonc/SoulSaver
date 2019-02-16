package dev.SoulSaver.utils;


public class CreaturesUtil {
	
	//Tests the distance between two points
	public static float dist(float X1, float Y1, float X2, float Y2){
		
		double x = X2-X1;
		double y = Y2-Y1;
		
		return (float)Math.sqrt((x * x) + (y * y));
	}	
	
}
