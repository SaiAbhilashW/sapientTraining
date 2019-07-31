package training.sapient.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="english")
	public IGreets english(){
		return new GreetEnglish();
	}
	@Bean(name="german")
	public IGreets german(){
		return new GreetGerman();
	}
	
	
}
