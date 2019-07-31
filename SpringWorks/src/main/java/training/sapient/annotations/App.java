package training.sapient.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IGreets greet = context.getBean("english",GreetEnglish.class);
		
		System.out.println(greet.sayHello());
		

		IGreets greetGerman = context.getBean("german",GreetGerman.class);
		
		System.out.println(greetGerman.sayHello());
	}
}
