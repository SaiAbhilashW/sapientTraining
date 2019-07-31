package training.sapient.dependencyInj;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	//dslr, slr, vga, point and shoot
	private String type;
	private int pixels;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Camera() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Camera(String type, int pixels) {
		super();
		this.type = type;
		this.pixels = pixels;
	}
	public int getPixels() {
		return pixels;
	}
	public void setPixels(int pixels) {
		this.pixels = pixels;
	}
	
}
