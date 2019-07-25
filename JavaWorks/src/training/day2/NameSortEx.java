package training.day2;
import java.lang.reflect.Array;
import java.util.Arrays;

public class NameSortEx {
	public static void main(String[] args) {
		String [] names = {"Salah", "Firmino", "Mane", "Van Dijk"};
		
		for(String temp : names) System.out.println(temp);
		
		Arrays.sort(names);

		System.out.println("----------");
		for(String temp : names) System.out.println(temp);

		Student[] students = new Student[4];
		
		students[0] = new Student(11, "Salah", 22);
		students[1] = new Student(9, "Firmino", 16);
		students[2] = new Student(10, "Mane", 22);
		students[3] = new Student(4, "Van Dijk", 4);
		
		System.out.println("+++++++++++++");
		
		for(Student temp : students) System.out.println(temp.toString());
		
		//Arrays.sort(students);
		
		SortingTemplate.sortById(students);
		System.out.println("++++++sortById+++++++");
		for(Student temp : students) System.out.println(temp.toString());
		
		SortingTemplate.sortByNameAsc(students);
		System.out.println("++++++sortByNameAsc+++++++");
		for(Student temp : students) System.out.println(temp.toString());
		
		System.out.println("++++++searchForId+++++++");
		int result = SortingTemplate.searchForId(students, 10);//10 is id 
		System.out.println(result > 0? "Present" : "Absent");
		
		
	}
}
