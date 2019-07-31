package training.sapient.aop.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAfter {
	@After(value="execution(public * get*())")
	public void afterAllGetters() {
		System.out.println("logging after every get");
	}
}
