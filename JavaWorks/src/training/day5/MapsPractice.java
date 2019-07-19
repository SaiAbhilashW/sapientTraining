package training.day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsPractice {
	public static void main(String[] args) {
		HashMap<String, List<String>> myMap = new HashMap<>();
		
		List<String> saiList = Arrays.asList("hi","hello","henlo");
		List<String> salahList = Arrays.asList("salah hi","salah hello","salah henlo");
		List<String> firminoList = Arrays.asList("firmino hi","firmino hello","firmino henlo");
		List<String> oxList = Arrays.asList("ox hi","ox hello","ox henlo");
		
		myMap.put("sai", saiList);
		myMap.put("salah", salahList);
		myMap.put("firmino", firminoList);
		myMap.put("ox", oxList);
		
//		System.out.println(myMap.get("ox"));
//		System.out.println(myMap.get("salah"));
		
		Set entrySet = myMap.entrySet();
		
		Iterator itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Entry<String, List<String>> next = (Entry) itr.next();
			System.out.println(next.getKey());
			for(String temp : next.getValue()) {
				System.out.print(temp + " ");
			}
			System.out.println("=========");
		}
	}
}
