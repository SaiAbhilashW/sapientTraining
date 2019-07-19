package training.day1;

public class LargestOfThreeNums {
	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println(
			num1 > num2 && num1 > num3 ? "num1 is greatest" : num2> num1 && num2 > num3 ? "num2 is greatest" : "num3 is greatest"	
				);
	}
}
