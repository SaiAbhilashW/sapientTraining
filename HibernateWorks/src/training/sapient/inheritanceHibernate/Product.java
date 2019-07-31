package training.sapient.inheritanceHibernate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

////single table
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="PRODUCT_TYPE",discriminatorType=DiscriminatorType.STRING)

////table per class
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)


//@Inheritance(strategy=InheritanceType.JOINED)

public class Product {
	@Id
	private int pId;
	private String name;
	private String pDesc;
	private int pCost;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pId, String name, String pDesc, int pCost) {
		super();
		this.pId = pId;
		this.name = name;
		this.pDesc = pDesc;
		this.pCost = pCost;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	public int getpCost() {
		return pCost;
	}
	public void setpCost(int pCost) {
		this.pCost = pCost;
	}
}
