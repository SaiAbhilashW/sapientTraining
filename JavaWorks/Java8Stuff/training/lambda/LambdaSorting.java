package training.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSorting {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person(1,"salah"),
				new Person(2,"vvd"),
				new Person(3,"firmino"),
				new Person(4,"mane")
				);
	
	
		Collections.sort(people, new Comparator<Person>() {
	
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getpId() - o2.getpId();
			}
			
		});
		
		people.forEach(System.out::println);
		
		////java 8 way
		System.out.println("--java 8 way -- sort by id ----------");
		
		people.sort((o1,o2) ->  o1.getpId() - o2.getpId()) ;
		
		people.forEach(System.out::println);

		System.out.println("--java 8 way -- sort by name asc----------");
		
		people.sort((o1,o2) ->  o1.getpName().compareTo(o2.getpName())) ;
		
		people.forEach(System.out::println);
		
		
		System.out.println("--java 8 way -- sort by name asc----------");
		Comparator<Person> perAscName = (o1, o2) -> o1.getpName().compareTo(o2.getpName());
		
		people.sort(perAscName.reversed()) ;
		
		people.forEach(System.out::println);
	}
}
