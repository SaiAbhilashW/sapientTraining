package training.day2;

public class Maruti extends FourWheeler{
	
	private String engineStd;
	
	public Maruti(int noOfDoors, FuelType fuelType, String engineStd) {
		super(noOfDoors, fuelType);
		this.engineStd = engineStd;
				// TODO Auto-generated constructor stub
	}

	@Override
	public void doors() {
		// TODO Auto-generated method stub
		System.out.println("Maruti has " + super.getNoOfDoors() + " doors");
	}

	@Override
	public void fuelType() {
		// TODO Auto-generated method stub
		System.out.println("Maruti runs on " + super.getFuelType());

	}

	public void engineStandard() {
		System.out.println("Maruti is " + engineStd);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Maruti moves with caution");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Maruti stops abruptly");
	}
}
