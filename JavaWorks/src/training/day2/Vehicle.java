package training.day2;
/*
 * if the class has atleast 1 abstract method then mark the class as abstract and if you have an abstract class
 *  then creating an object of it is not allowed
 */
public abstract class Vehicle {
	/*
	 * if you have an abstract method then the class extending the same must have implementation
	 */
	public abstract void move();	
	public abstract void stop(); 
}
