package training.sapient.springboot.springbootworks.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import training.sapient.springboot.springbootworks.beans.Address;
import training.sapient.springboot.springbootworks.beans.User;

@Configuration
@EnableMongoRepositories(basePackageClasses=training.sapient.springboot.springbootworks.repo.UserRepository.class)
public class MongoConfig {

	//@Bean
//	public CommandLineRunner commandLineRunner(training.sapient.springboot.springbootworks.repo.UserRepository userRepository) {
//		return string -> {
//			userRepository.insert(	new User(101,"Umang",23,"u@gmail.com",new Address("A","B","C","D")));
//			userRepository.insert(new User(102,"Mayur",23,"m@gmail.com",new Address("E","F","G","H"))); 
//			userRepository.insert(new User(103,"Sai",23,"s@gmail.com",new Address("P","N","M","L")));  
//
//
//		}; 
//	} 
//	
}
