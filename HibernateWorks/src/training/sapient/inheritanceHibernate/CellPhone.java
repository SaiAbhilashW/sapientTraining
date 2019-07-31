package training.sapient.inheritanceHibernate;

import javax.persistence.Entity;

@Entity
public class CellPhone extends Product{
	
	private String os;
	private String connectivity;
	private String type;
	
	public CellPhone(int pId, String name, String pDesc, int pCost, String os, String connectivity, String type) {
		super(pId, name, pDesc, pCost);
		this.os = os;
		this.connectivity = connectivity;
		this.type = type;
	}
	
}
