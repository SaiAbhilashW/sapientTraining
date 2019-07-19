package training.day2;

public class Bmw extends FourWheeler{
	
	private String player;
	public Bmw(int noOfDoors, FuelType fuelType, String player) {
		super(noOfDoors, fuelType);
		this.player = player;
		// TODO Auto-generated constructor stub
	}

	public void musicPlayer() {
		System.out.println("BMW comes with " + player +" music player");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("BMW moves with auto-gear");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW stops with abs");
	}
	
	
}
