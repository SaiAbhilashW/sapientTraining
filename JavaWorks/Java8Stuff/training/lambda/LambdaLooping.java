package training.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//create my func interface

@FunctionalInterface
interface IMyInterface{
	//can have only one method
	int hiMethod();
	//if another method is there then it should be default
}


public class LambdaLooping {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		//java with consumers - old way
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
		
		//java with lambda (java 8)
		System.out.println("_______________");
		numbers.forEach(t -> System.out.println("with lambda " + t));
		
		//method references
		System.out.println("_______________");
		numbers.forEach(System.out::println); //overrides toString in object defn
		
		
	}
}
