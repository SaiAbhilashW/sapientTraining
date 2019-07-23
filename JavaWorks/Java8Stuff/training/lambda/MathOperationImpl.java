package training.lambda;

public class MathOperationImpl {
	public static void main(String[] args) {
		MathOperation add = (num1, num2) -> num1 + num2; //compiles to {return num1 + num2;}
		MathOperation sub = (num1, num2) -> num1 - num2;
		MathOperation mul = (num1, num2) -> num1 * num2;
		MathOperation div = (num1, num2) -> num1 / num2;
		
		MathOperation mod = new MathOperation() { //the above is the condensed code for below logic
			
			@Override
			public int operation(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 % num2;
			}
		};
		
		int num1 = 30;
		int num2 = 5;
		
		System.out.println("Addn of two nums " + operate(num1,num2,add));
		System.out.println("sub of two nums " + operate(num1,num2,sub));
		System.out.println("mul of two nums " + operate(num1,num2,mul));
		System.out.println("div of two nums " + operate(num1,num2,div));

	}
	
	public static int operate(int num1, int num2, MathOperation oper) {
		return oper.operation(num1, num2);
	}
}
