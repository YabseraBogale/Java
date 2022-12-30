//change File name to Account
public class Account extends Object {
	private final String firstName; 
	private final String LastName;
	private final String socialSecurityNumber;
	private double checkbalance; 
	public Account(String firstName,String LastName,String socialSecurityNumber,double checkbalance)
	{
		this.firstName = firstName;
		this.LastName=LastName;
		this.socialSecurityNumber=socialSecurityNumber;
		if (checkbalance > 0.0) {
			this.checkbalance = checkbalance; 
		}
	
	}
	
	public void checkdeposit(double depositAmount)
	{
		if (depositAmount > 0.0) {
			this.checkbalance += depositAmount;
		}
			 
	}

	public double getcheckbalance()
	{
		return checkbalance;
	}
	// method that sets the name
	
	// method that returns the name
	public String getfirstName()
	{
		return firstName; // give value of name back to caller
	}
	public String getLastName() {
		return LastName;
	}
	public String getsocialSecurityNumber() {
		return socialSecurityNumber;
	}
	@Override
	public String toString(){
		return String.format("%s %s%n%s %s%n%s %s%n%s %.2f",
				"First Name:", firstName,"Last Name:", LastName,
				"ID: ", socialSecurityNumber,
				"check balance:", checkbalance);
	}
}
