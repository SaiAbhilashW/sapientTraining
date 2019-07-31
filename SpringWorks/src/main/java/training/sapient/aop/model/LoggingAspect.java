package training.sapient.aop.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	//i want this method to exec for all public methods from all the packages with get prefix taking no paramas
	@Before(value="execution(public * get*())")
	public void loggingBeforeAdvice() {
		System.out.println("executes before every get");
	}
}
