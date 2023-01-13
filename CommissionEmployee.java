
public class CommissionEmployee extends Employee{
	private double grossSales; // gross weekly sales
	private double commissionRate;
	public CommissionEmployee(String firstName, String lastName,String socialSecurityNumber, double grossSales,double commissionRate)
	{
			super(firstName, lastName, socialSecurityNumber);
			if (commissionRate <= 0.0 || commissionRate >= 1.0) {
				throw new IllegalArgumentException(
						"Commission rate must be > 0.0 and < 1.0");
			} // validate
			if (grossSales < 0.0) {
				throw new IllegalArgumentException("Gross sales must be >= 0.0");
			} // validate
			this.grossSales = grossSales;
			this.commissionRate = commissionRate;
			}
	// set gross sales amount
	public void setGrossSales(double grossSales)
	{
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		} // validate
	
		this.grossSales = grossSales;
	}
	// return gross sales amount
	public double getGrossSales()
	{
		return grossSales;
	}
	// set commission rate
	public void setCommissionRate(double commissionRate)
	{
	if (commissionRate <= 0.0 || commissionRate >= 1.0) {
		throw new IllegalArgumentException(
				"Commission rate must be > 0.0 and < 1.0");
	} // validate
	
	this.commissionRate = commissionRate;
	}
	// return commission rate
	public double getCommissionRate()
	{
		return commissionRate;
	}
	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double getPaymentAmount()
	{
		return getCommissionRate() * getGrossSales();
	}
	// return String representation of CommissionEmployee object
	@Override
	public String toString()
	{
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
				"commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}
}
