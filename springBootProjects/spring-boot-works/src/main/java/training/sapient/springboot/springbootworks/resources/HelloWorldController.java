package training.sapient.springboot.springbootworks.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import training.sapient.springboot.springbootworks.beans.Hello;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/helloworld")
	public String helloWorld() {
		return "<h1>Hello World</h1>";
	}
	
	//http://localhost:9090/helloworld/Sai
	@GetMapping(path="/helloworld/{name}")
	public Hello sayHello(@PathVariable String name) {
		if(name.equals("mayur")) return new Hello(name + " is GOD");
		return new Hello("Having fun " + name);
	}
} 
 
