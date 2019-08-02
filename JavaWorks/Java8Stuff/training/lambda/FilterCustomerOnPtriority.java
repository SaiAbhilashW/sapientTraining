package training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import training.lambda.*;

public class FilterCustomerOnPtriority {
//before java 8
	public static List<PriorityCustomer> withSalaryMoreThan(List<Customer> customers){
		List<PriorityCustomer> priorityCust = new ArrayList<>();
		
		for(Customer temp : customers) {
			if(temp.getSalary() > 5000) {
				PriorityCustomer priorityCust2 = new PriorityCustomer(temp.getId(), temp.getName(), true);
				priorityCust.add(priorityCust2);
			}		
		}
		return priorityCust;
	} 
	
	//java 8
	public static List<PriorityCustomer> withSalaryMoreThanJava8WithFilter(List<Customer> customers){
		return customers
					.stream()
					.filter(temp -> temp.getSalary() > 5000)
					.map(temp -> {
						return new PriorityCustomer(temp.getId(), temp.getName(), true);
					})
					.collect(Collectors.toList());	
	}
	
	public static List<PriorityCustomer> withSalaryMoreThanJava8(List<Customer> customers){
		List<PriorityCustomer> priorityCust = customers.stream().map(temp -> {
			if(temp.getSalary() > 5000) {
				return new PriorityCustomer(temp.getId(), temp.getName(), true);
			}
			return null;
		}).collect(Collectors.toList());
		
		return priorityCust;
	}
	
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList( 
				new Customer(101,"SAI",8000),
				new Customer(102,"salah",7000),
				new Customer(103,"vvd",3000)
				);
		
		System.out.println("with java 7");
		List<PriorityCustomer> list1 = withSalaryMoreThan(customers);
		list1.forEach(t -> System.out.println(t));
		
		
		System.out.println("with java 8");
		List<PriorityCustomer> list2 = withSalaryMoreThanJava8(customers);
		list2.forEach(t -> System.out.println(t));
		
		System.out.println("with java 8 filter");
		List<PriorityCustomer> list3 = withSalaryMoreThanJava8WithFilter(customers);
		list3.forEach(t -> System.out.println(t));
			
	}
}
