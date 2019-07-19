package training.day4;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class DeviceSortingTemplate{
	public static Comparator deviceSortByName() {
		return new Comparator<Device>() {

			@Override
			public int compare(Device o1, Device o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};	
	}
}

class Device{
	private int id;
	private String name;
	private int price;
	public Device(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Device d = (Device) obj;
		
		if(this.getId() == d.getId() && this.getName() == d.getName() && this.getPrice() == d.getPrice()) return true;
		else return false;
		
	}
	@Override
	public int hashCode() {
		
		return this.getName().charAt(0);		// TODO Auto-generated method stub
		
	}
	
}



public class TreeSetEx {
	public static void main(String[] args) {
		
		TreeSet<Device> set = new TreeSet<>(DeviceSortingTemplate.deviceSortByName());
		set.add(new Device(101,"Mobile",50));
		set.add(new Device(102,"Kindle",30));
		set.add(new Device(103,"PC",60));
		set.add(new Device(103,"Laptop",60));
		set.add(new Device(103,"Pen",60));
		set.add(new Device(101,"Mobile",50));
		
		for(Device temp : set) System.out.println(temp);
	}
}
