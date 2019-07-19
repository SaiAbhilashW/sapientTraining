package training.day4;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperation {
	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("HelloWorld.txt");
		
		if(f.exists()) {
			System.out.println("File Exists");
		} else {
			f.createNewFile();
			System.out.println("File created");
		}
		
		System.out.println("Last Modified : " + new Date(f.lastModified()));
		System.out.println("CAn read : " + f.canRead());
		System.out.println("Absolute Path" + f.getAbsolutePath());
		System.out.println("File name : " + f.getName());
	} 

}