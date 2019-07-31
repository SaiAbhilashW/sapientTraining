package training.sapient.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("SpringContent.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContent.xml");
		
		IHelloService helloService = (IHelloService) context.getBean("hello");
		
		System.out.println(helloService.sayHello());
		
		System.out.println(helloService.toString());
	}
}
