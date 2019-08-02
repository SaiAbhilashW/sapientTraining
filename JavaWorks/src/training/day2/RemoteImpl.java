package training.day2;

class AcceptCommand{
	public static void checkDevice(RemoteControl device) {
		System.out.println("-----------");
		device.on();
		device.off();
	}
}

public class RemoteImpl {
	public static void main(String[] args) {
		RemoteControl rc = new AC();
		AcceptCommand.checkDevice(rc);
		
		rc = new Lamp();
		AcceptCommand.checkDevice(rc);
		
		rc = new NightLamp();
		AcceptCommand.checkDevice(rc);
		
		
	}
}
