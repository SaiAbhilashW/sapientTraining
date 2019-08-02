package training.day2;

public class VehicleImpl {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[5];
		vehicles[0] = new Bmw(4, FuelType.Petrol, "Sony");
		vehicles[1] = new Maruti(3,FuelType.Deisel, "Okayish");
		vehicles[2] = new Bmw(4, FuelType.Deisel, "Jbl");
		vehicles[3] = new Bmw(4, FuelType.Deisel, "Sony");
		vehicles[4] = new Maruti(4, FuelType.Cng, "Poor");
		
		DisplayVehicle.showVehicle(vehicles);
	}
}
