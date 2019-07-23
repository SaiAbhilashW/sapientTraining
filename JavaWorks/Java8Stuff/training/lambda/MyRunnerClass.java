package training.lambda;

public class MyRunnerClass {
	public void execute(WorkerInterface worker) {
		System.out.println("HI im execute func");
		worker.doSomeWork();
	}
}
