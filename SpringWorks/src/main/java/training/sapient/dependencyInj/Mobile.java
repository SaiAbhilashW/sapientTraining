package training.sapient.dependencyInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//public class Mobile {
//	private Camera camera;
//	private Screen screen;
//	private Speaker speaker;
//	public Camera getCamera() {
//		return camera;
//	}
//	public void setCamera(Camera camera) {
//		this.camera = camera;
//	}
//	public Screen getScreen() {
//		return screen;
//	}
//	public void setScreen(Screen screen) {
//		this.screen = screen;
//	}
//	public Speaker getSpeaker() {
//		return speaker;
//	}
//	public void setSpeaker(Speaker speaker) {
//		this.speaker = speaker;
//	}
//	public Mobile(Camera camera, Screen screen, Speaker speaker) {
//		super();
//		this.camera = camera;
//		this.screen = screen;
//		this.speaker = speaker;
//	}
//	public Mobile() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//}


@Component
public class Mobile {
	@Override
	public String toString() {
		return "Mobile [camera=" + camera + ", screen=" + screen + ", speaker=" + speaker + "]";
	}
	@Autowired
	private Camera camera;
	@Autowired
	private Screen screen;
	@Autowired
	private Speaker speaker;
	
	
	
	public Camera getCamera() {
		return camera;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public Mobile(Camera camera, Screen screen, Speaker speaker) {
		super();
		this.camera = camera;
		this.screen = screen;
		this.speaker = speaker;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
