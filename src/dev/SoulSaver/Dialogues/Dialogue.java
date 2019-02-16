package dev.SoulSaver.Dialogues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import dev.SoulSaver.utils.Utils;

public class Dialogue {
	
	public static String loadFileAsString(String path, int num){
		ArrayList<String> dialogue = new ArrayList<String>();

		InputStream is = Utils.class.getResourceAsStream(path);
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line;
			while((line = br.readLine()) != null)
				dialogue.add(line);
			
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return dialogue.get(num);
	}
}
