package training.lambda;

public class WorkerInterfaceTest {
	public static void main(String[] args) {
		MyRunnerClass runner = new MyRunnerClass();
		
		runner.execute(new WorkerInterface() {
			
			@Override
			public void doSomeWork() {
				// TODO Auto-generated method stub
				System.out.println("Worker invoked using anon class");
				
			}
		});
		
		///java 8 way
		System.out.println("---------- java 8 way ----------");
		runner.execute(() -> System.out.println("worker invoked using lambda"));
	}
}
