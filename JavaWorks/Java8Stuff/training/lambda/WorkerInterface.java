package training.lambda;

@FunctionalInterface
public interface WorkerInterface {
	public void doSomeWork();
	
	public default void imConcrete() {
		System.out.println("im from concrete");
	}
	
	public static void imStatic() {
		System.out.println("im from static");
	}
}
