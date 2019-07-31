package training.sapient.dependencyInj;

import org.springframework.stereotype.Component;

@Component
public class Screen {
	private String glassType;
	private int length;
	private int breadth;
	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Screen(String glassTye, int length, int breadth) {
		super();
		this.glassType = glassTye;
		this.length = length;
		this.breadth = breadth;
	}
	public String getGlassType() {
		return glassType;
	}
	public void setGlassType(String glassTye) {
		this.glassType = glassTye;
	}
	@Override
	public String toString() {
		return "Screen [glassType=" + glassType + ", length=" + length + ", breadth=" + breadth + "]";
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}
