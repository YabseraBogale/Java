public class secondAccount extends Account{
	private double savingBalance;
	public secondAccount(String firstName,String LastName,String socialSecurityNumber,double checkbalance,double savingBalance) {
		super(firstName,LastName,socialSecurityNumber,checkbalance);
		if (savingBalance < 0.0)
			throw new IllegalArgumentException(
			"Base salary must be >= 0.0");
			this.savingBalance = savingBalance;
	}
	public void setsavingBalance(double savingBalance) {
		if (savingBalance < 0.0)
			throw new IllegalArgumentException(
			"Base salary must be >= 0.0");
			this.savingBalance+= savingBalance;
	}
	public double getsavingBalance() {
		return savingBalance;
	}
	@Override
	public String toString(){
		return String.format("%s%n%s %.2f",super.toString(),
				"saving Balance is:",getsavingBalance());
	}

}