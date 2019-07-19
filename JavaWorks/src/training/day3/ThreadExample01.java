package training.day3;

class BusinessLogic extends Thread{
	
	private String tname;
	
	public BusinessLogic(String s) {
		this.tname = s;
	}
	
	public void run() {
		System.out.println("The thread name in run() is " + Thread.currentThread().getName() );
		
		//kill some time 
		for(int i = 0; i < 1000; i++){
			System.out.println("Thread : " + Thread.currentThread().getName() + " i : " + i);
			
		}
		
		System.out.println("Exiting " + tname);
	}
}

public class ThreadExample01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//if you invoke run it becomes a single threaded model
		//new BusinessLogic().run();
		
		BusinessLogic businessLogic = new BusinessLogic("Desktop");
		BusinessLogic businessLogic2 = new BusinessLogic("Laptop");
		
		//MIN_PRiority - 1
		//max priority - 10
		//normal priority - 5
		
		businessLogic.setPriority(Thread.NORM_PRIORITY + 2);
		businessLogic.start();
		
		businessLogic2.setPriority(Thread.NORM_PRIORITY + 2);
		businessLogic2.start();
		
		for(int i = 0; i < 1000; i++){
			System.out.println("Thread : " + Thread.currentThread().getName() + " i : " + i);
		}
		
		
		
		try {
			businessLogic.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			businessLogic2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Exiting main");
		
	}
}
