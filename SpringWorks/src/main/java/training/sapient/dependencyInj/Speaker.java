package training.sapient.dependencyInj;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
	private String type;
	private int volumeLevels;
	public Speaker(String type, int volumeLevels) {
		super();
		this.type = type;
		this.volumeLevels = volumeLevels;
	}
	public Speaker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getVolumeLevels() {
		return volumeLevels;
	}
	public void setVolumeLevels(int volumeLevels) {
		this.volumeLevels = volumeLevels;
	}
	@Override
	public String toString() {
		return "Speaker [type=" + type + ", volumeLevels=" + volumeLevels + "]";
	}
}
