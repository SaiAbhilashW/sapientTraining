package training.day3;

class MyLogic implements Runnable{
	Thread t;
	public MyLogic(String name, int priority) {
		t = new Thread(this);
		t.setName(name);
		t.setPriority(priority);
		
		t.start();
	}
	
	public void run() {
		System.out.println("The thread name in run() is " + Thread.currentThread().getName() );
		
		//kill some time 
		for(int i = 0; i < 1000; i++){
			System.out.println("Thread : " + Thread.currentThread().getName() + " i : " + i);
			
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Exiting " + t.getName());
	}
}

public class ThreadExample02 {
	public static void main(String[] args) {
		MyLogic one = new MyLogic("laptop", 4);
		MyLogic two = new MyLogic("desktop", 7);
		
		for(int i = 0; i < 1000; i++){
			System.out.println("Thread : " + Thread.currentThread().getName() + " i : " + i);
			
		}
		
		
		try {
			one.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			two.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting main");
	}
}
