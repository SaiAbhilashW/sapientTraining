package training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx01 {
	
	private static List<Integer> filterList(List<Integer> list, Predicate<Integer> positiveNumer ){
		List<Integer> filteredList = new ArrayList<>();
		for(Integer temp : list) {
			if(positiveNumer.test(temp)) filteredList.add(temp);
		}
		return filteredList;
	}
	
	public static void main(String[] args) {
		Predicate<Integer> positiveNumber = i -> i>=0;
		
//		new Predicate<T>() {
//
//			@Override
//			public boolean test(T t) {
//				// TODO Auto-generated method stub
//				return t >= 0;
//				
//			}
//			
//		};
		
		List<Integer> myList = Arrays.asList(23,45,-11,76,-90);
		
		List<Integer> filteredList = filterList(myList, positiveNumber);
		
		filteredList.forEach(System.out::println);
	}
}
