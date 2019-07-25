package training.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingTemplate {
	public static Student[] sortByNameAsc(Student[] students) {
		Comparator<Student> comparatorSortByNameAsc = new Comparator<Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {
				// TODO Auto-generated method stub
				return arg0.getName().compareTo(arg1.getName());
			}
		};
		Arrays.sort(students, comparatorSortByNameAsc);
		
		return students;
	}

	public static Student[] sortById(Student[] students) {
		// Comparator<Student> comparatorSortById =
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}

		});
		return students;
	}

	public static int searchForId(Student[] students, int id) {

		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}

		});

		// ArrayList<Integer> myList = new ArrayList<Integer>();
		int[] myArray = new int[students.length];
		int i = 0;
		for (Student temp : students) {
			myArray[i] = temp.getId();
			i++;
		}

		// System.out.println(myArray[3]);

		int isPresent = Arrays.binarySearch(myArray, id);

		return isPresent;

	}
}
