package training.lambda;

public class Person {
	private int pId;
	private String pName;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	
}
