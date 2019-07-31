package training.sapient.aop.model;

public class BankService {
	private SBAccount sbAcc;
	private GAccount gAcc;
	@Override
	public String toString() {
		return "BankService [sbAcc=" + sbAcc + ", gAcc=" + gAcc + "]";
	}

	public BankService(SBAccount sbAcc, GAccount gAcc) {
		super();
		this.sbAcc = sbAcc;
		this.gAcc = gAcc;
	}
	public BankService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBAccount getSbAcc() {
		return sbAcc;
	}
	public void setSbAcc(SBAccount sbAcc) {
		this.sbAcc = sbAcc;
	}
	public GAccount getgAcc() {
		return gAcc;
	}
	public void setgAcc(GAccount gAcc) {
		this.gAcc = gAcc;
	}
	
}
