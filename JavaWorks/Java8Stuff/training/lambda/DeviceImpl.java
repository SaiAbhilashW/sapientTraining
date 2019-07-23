package training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DeviceImpl {
	
	public static List<Device> filterByPrice(List<Device> myList ,Predicate<Integer> priceGreaterThan1k) {
		List<Device> devicesWithPriceGrThan1k = new ArrayList<>();
		
		for(Device temp : myList) {
			if(priceGreaterThan1k.test(temp.getPrice())) {
				devicesWithPriceGrThan1k.add(temp);
			}
		}
		
		return devicesWithPriceGrThan1k;
	}
	
	
	public static List<Device> filterByCategory(List<Device> myList ,Predicate<String> categoryEqualsElect) {
		List<Device> devicesWithElectCategory = new ArrayList<>();
		
		for(Device temp : myList) {
			if(categoryEqualsElect.test(temp.getCategory())) {
				devicesWithElectCategory.add(temp);
			}
		}
		
		return devicesWithElectCategory;
	}
	
	public static List<Device> filterByCategoryPlusPrice(List<Device> myList ,Predicate<Device> categoryEqualsElectAndPriceGreaterThan300) {
		List<Device> devicesWithElectCategoryAndPriceGreaterThan300 = new ArrayList<>();
		
		for(Device temp : myList) {
			if(categoryEqualsElectAndPriceGreaterThan300.test(temp)) {
				devicesWithElectCategoryAndPriceGreaterThan300.add(temp);
			}
		}
		
		return devicesWithElectCategoryAndPriceGreaterThan300;
	}
	
	
	
	public static void main(String[] args) {
		List<Device> myList = Arrays.asList(
				new Device(1,"Mobile",10000,"Electronics"),
				new Device(2,"Biscuit",10,"Food"),
				new Device(3,"PC",50000,"Electronics"),
				new Device(4,"Charger Cable",100,"Electronics"),
				new Device(5,"Coffee",3000,"Food")
				);
		
		Predicate<Integer> priceGreaterThan1k = p -> p > 1000;
		Predicate<String> categoryEqualsElect = p -> p.equalsIgnoreCase("Electronics");
		
//		Predicate<Device> categoryEqualsElectAndPriceGreaterThan300 = p -> (p.getCategory().equalsIgnoreCase("Electornics"));
		
		System.out.println("List of devices with price greater than 1000");
		List<Device> devicesWithPriceGrThan1k = filterByPrice(myList, priceGreaterThan1k);
		devicesWithPriceGrThan1k.forEach(System.out::println);
		
		System.out.println("List of devices with category = Electronics");
		List<Device> devicesWithElectCategory = filterByCategory(myList, categoryEqualsElect);
		devicesWithElectCategory.forEach(System.out::println);
		
//		System.out.println("List of devices with category = Electronics and price greater than 300");
//		List<Device> devicesWithElectCategoryAndPriceGreaterThan300 = filterByCategoryPlusPrice(myList, categoryEqualsElectAndPriceGreaterThan300);
//		devicesWithElectCategoryAndPriceGreaterThan300.forEach(System.out::println);
		
		//use and() method of predicate
	}
}
