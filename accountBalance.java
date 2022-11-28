
public class accountBalance {
	private String name;
	private double deposite;
	public accountBalance(String name,double deposite) {
		this.name=name;
		if(deposite>0.0) {
			this.deposite=deposite;
		}
	}
	public void SetName(String name) {
		this.name=name;
	}
	public void GetDeposite(double deposite) {
		if(deposite>0.0) {
			this.deposite+=deposite;
		}
	}
	public String GetName() {
		return name;
	}
	public double GetDeposite() {
		return deposite;
	}
}
