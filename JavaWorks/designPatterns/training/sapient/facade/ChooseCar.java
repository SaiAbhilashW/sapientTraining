package training.sapient.facade;

public class ChooseCar {
	private HatchBack hatchBack;
	private SUV suv;
	private Sedan sedan;
	
	
	public void chooseCar() {
		this.hatchBack = new HatchBack();
		this.suv = new SUV();
		this.sedan = new Sedan();
	}
				
		public void driveHatchBack() {
			this.hatchBack.drive();
		}
		
		public void driveSUV() {
			this.suv.drive();
		}
		public void driveSedan() {
			this.sedan.drive();
		}
		
}

