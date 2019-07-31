
package training.sapient.aop.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		
		BankService bankservice = context.getBean(BankService.class);
		
		System.out.println(bankservice.getgAcc().getAccount().getBalance());
		System.out.println(bankservice.getSbAcc().getAccount().getBalance());
	}
}
