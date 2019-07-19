package training.day4;

import java.util.ArrayList;

public class CollectionEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("hi");
		list.add(2);
		list.add(true);
	
		
		for(Object temp : list) {
			System.out.println(temp);
		}
	}
}
