package training.day2;

public abstract class FourWheeler extends Vehicle {
	
	private int noOfDoors;
	private FuelType fuelType;
		
	protected int getNoOfDoors() {
		return noOfDoors;
	}

	protected FuelType getFuelType() {
		return fuelType;
	}

	public FourWheeler(int noOfDoors, FuelType fuelType) {
		super();
		this.noOfDoors = noOfDoors;
		this.fuelType = fuelType;
	}

	public void doors() {
		System.out.println("Four wheeler has " + this.noOfDoors + " doors" );
	}
	
	public void fuelType() {
		System.out.println("This four wheeler runs on " + this.fuelType);
	}
}
