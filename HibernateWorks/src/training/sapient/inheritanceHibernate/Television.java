package training.sapient.inheritanceHibernate;

import javax.persistence.Entity;

@Entity

public class Television extends Product{
	private String screenType;
	private int size;
	private String resolution;
	
	public Television(int pId, String name, String pDesc, int pCost, String screenType, int size, String resolution) {
		super(pId, name, pDesc, pCost);
		this.screenType = screenType;
		this.size = size;
		this.resolution = resolution;
	}
}
