package training.lambda;

public class Device {
	private int did;
	private String name;
	private int price;
	private String category;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return "Device [did=" + did + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Device(int did, String name, int price, String category) {
		super();
		this.did = did;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	
}
