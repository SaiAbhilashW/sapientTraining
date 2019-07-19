package training.day2;

public abstract class TwoWheeler extends Vehicle{
	
	public void selfStart(boolean flag) {
		System.out.println(flag? "Two Wheeler has self start" : "Two Wheeler doesn't have self start");
	}
	
	public void hasNoOfGears(int noOfGears) {
		System.out.println("Two wheeler has " + noOfGears +  " gears");
	}

	
}
