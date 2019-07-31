package training.sapient.spring01;

public class HelloService implements IHelloService{
	private String name;
	private String city;
	public String sayHello() {
		// TODO Auto-generated method stub
		return this.sayHello(name,city);
	}
	public String sayHello(String name,String city) {
		// TODO Auto-generated method stub
		
		String myString[] = {
				"Hey Mr: %s, How is your city %s",
				"Good Morning %s, heard you are in %s"
		};
		
		int randomNumber = (int) (Math.random()*2);
		
		return String.format(myString[randomNumber].toString(), name,city);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "HelloService [name=" + name + ", city=" + city + "]";
	}
	public HelloService(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public HelloService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
