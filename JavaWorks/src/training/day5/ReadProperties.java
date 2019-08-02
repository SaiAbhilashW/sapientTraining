package training.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		
		prop.load(new FileReader("db.properties"));
		
		System.out.println("User name : " + prop.getProperty("usernam"));
		System.out.println("Password : " + prop.getProperty("password"));
		System.out.println("Db : " + prop.getProperty("db"));
	}
}
