package training.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class ItemCollectorEx {
	public static void main(String[] args) {
		List<Item> items = Arrays.asList(
				new Item("Apples", 10 ,new BigDecimal(77.28)),
				new Item("Banana", 28 ,new BigDecimal(23.00)),
				new Item("Orange", 89 ,new BigDecimal(7.238)),
				new Item("PineApple", 2 ,new BigDecimal(9307.28)),
				new Item("Apples", 34 ,new BigDecimal(77.28)),
				new Item("Banana", 8 ,new BigDecimal(23.00))
		);
		//the item name, count
		Map<String, Long> counts = items.stream()
									  .collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		
		System.out.println(counts);
		
		//sum of qty
		Map<String, Integer> sumOfQty = items.stream()
										.collect(Collectors.groupingBy(Item::getName,
												Collectors.summingInt(Item::getQty)));
		
		System.out.println(sumOfQty);
		
		//average qty for each product
		Map<String, Double> average = items.stream()
										.collect(Collectors.groupingBy(Item::getName, 
												Collectors.averagingDouble(Item::getQty)));
		System.out.println(average);
	} 
}
