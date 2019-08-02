package training.day4;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hailo");
		list.add("Henlo");
		
		for(String temp : list) {
			System.out.println(temp);
		}
		System.out.println("+++++++++");
		/// the above for loop converts to below while compiling
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("+++++++++");
		Collection<String> smallList = list.subList(0, 2);
		
		for(String temp : smallList) {
			System.out.println(temp);
		}
	}
}
