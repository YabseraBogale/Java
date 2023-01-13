
public class HourlyEmployee extends Employee {
	private double wage; // wage per hour
	private double hours; // hours worked for week
	public HourlyEmployee(String firstName, String lastName,String socialSecurityNumber, double wage, double hours){
				super(firstName, lastName, socialSecurityNumber);
				if (wage < 0.0) {
					throw new IllegalArgumentException(
							"Hourly wage must be >= 0.0");
				} // validate wage
				if ((hours < 0.0) || (hours > 168.0)) {
					throw new IllegalArgumentException(
							"Hours worked must be >= 0.0 and <= 168.0");
				}// validate hours
				this.wage = wage;
				this.hours = hours;
				}
	public void setWage(double wage)
	{
		if (wage < 0.0) {
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		} // validate wage
			
		this.wage = wage;
	}
	// return wage
	public double getWage()
	{
		return wage;
	}
	// set hours worked
	public void setHours(double hours)
	{
	if ((hours < 0.0) || (hours > 168.0)){
		throw new IllegalArgumentException(
				"Hours worked must be >= 0.0 and <= 168.0");
	}// validate hours
			
		this.hours = hours;
	}
	// return hours worked
	public double getHours()
	{
		return hours;
	}
	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double getPaymentAmount()
	{
		if (getHours() <= 40) {
			return getWage() * getHours();
		}// no overtime
	
	else {
		return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}
	
	}
	@Override
	public String toString()
	{
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
				super.toString(), "hourly wage", getWage(),
				"hours worked", getHours());
	}
			
}
