package training.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteData {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		System.out.println("Enter Employee Id : ");
		int empId = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Your Name : ");
		String empName = br.readLine();
		
		System.out.println("Enter salary");
		double salary = Double.parseDouble(br.readLine());
		
		display(empId, empName, salary);
		
		//write data to the file
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("emp.txt",true));
		
		try {
			bw.newLine();
			bw.write("id " + empId + " name " + empName + " salary " + salary);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			bw.close();
		}
		
		System.out.println("Data Written");
		
		//read contents from file
		BufferedReader brFile = new BufferedReader(new FileReader("emp.txt"));
		System.out.println("Reading data");
		String line = null;
		while((line = brFile.readLine()) != null) {
			System.out.println(line);
		}
		
		
	}
	
	private static void display(int id, String name, double salary) {
		System.out.println(id + " " + name + " " + salary);
	}
}
