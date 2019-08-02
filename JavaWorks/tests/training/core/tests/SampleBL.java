package training.core.tests;

import java.util.Arrays;
import java.util.List;

public class SampleBL {
	public boolean check() {
		return true;
	}
	
	public String sayHi(String name) {
		return "hi " + name;
	}
	
	public List<String> getList(){
		return Arrays.asList("hi", "hello", "henlo");
	}
	
	public void lateException() {
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void throwException() {
		throw new RuntimeException("This is a custom exception");
	}
}
