package beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import standards.Options;

public class Drinks {
	
	// have to be loaded from the flat file 
	public static int totalCount;
	
	public static Map<String, Integer> individualDrinkCount; 
	
	
	static {
		
		
		individualDrinkCount = new HashMap<>(); 
		
		// BL which will store 
		
//		individualDrinkCount.put(Options.CAPACHINO, no of  time the capachino is found);
//		individualDrinkCount.put(Options.EXPRESSO, no of time the expresso is found);
//		individualDrinkCount.put(Options.TEA, no of time the teadis found);
//		individualDrinkCount.put(Options.CAPACHINO, no of time the capachino is found);
//		
		
		File f = new File("drinks.txt"); 
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		totalCount = 33; 
		
		 
		
	}
	
	String name; 
	Coffee coffe;
	public Drinks(String name) {

		
		this.name = name;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coffee getCoffe() {
		return coffe;
	}
	public void setCoffe(Coffee coffe) {
		this.coffe = coffe;
	} 
	

	
	
	
	
	
}
