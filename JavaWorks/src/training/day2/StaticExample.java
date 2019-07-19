package training.day2;

public class StaticExample {
	public static void addNum(int a, int b) {
		System.out.println("addition : " + (a + b));
	}
	
	static {
		System.out.println("Hi I'm static block 1");
	}
	
	static {
		System.out.println("Hi I'm static block 2");
	}

	
	public static void main(String[] args) {
		addNum(10,20);
	}
}
