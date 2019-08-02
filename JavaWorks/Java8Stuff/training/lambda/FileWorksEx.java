package training.lambda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class FileWorksEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		///old java way
//		BufferedReader br;
//		try {
//			br = new BufferedReader(new FileReader("emp.txt"));
//			String line  = null;
//			
//			try {
//				while((line = br.readLine())!=null) {
//					System.out.println(line);
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} finally {
//				try {
//					br.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
//		
		
		////new java 8 way
		
		java8FileVersion01();
		
		java8FileVersion02();
			
		
		
	}

	private static void java8FileVersion02() throws IOException {
		try(Stream<String> st = Files.lines(Paths.get("emp.txt"))){
			st.forEach(System.out::println);
		}
	}

	private static void java8FileVersion01() throws IOException, FileNotFoundException {
		try (
				BufferedReader br1 = new BufferedReader(new FileReader("emp.txt"));
			){
			br1.lines().forEach(System.out::println);
		}
	}
}
