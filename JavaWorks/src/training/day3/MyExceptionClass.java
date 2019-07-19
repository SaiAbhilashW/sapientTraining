package training.day3;

public class MyExceptionClass {
	public static void main(String[] args) {
		System.out.println("Open Connection");
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			try {
				int[] myArray = new int[-1];
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Result : " + (a/b));
			System.out.println("Some business logic");
		} catch(ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("Some other business logic");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Some common business logic");
			System.out.println("Done");
		} finally {
			System.out.println("Close connection");
		}
		System.out.println("bye");
	}
}
