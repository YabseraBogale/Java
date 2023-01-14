
public class Invoice implements Payable {
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	public Invoice(String partNumber, String partDescription, int quantity,double pricePerItem)
	{
				if (quantity < 0) {
					throw new IllegalArgumentException("Quantity must be >= 0");
				}// validate quantity
					
			if (pricePerItem < 0.0) {
				throw new IllegalArgumentException(
						"Price per item must be >= 0");
			}// validate pricePerItem

			this.quantity = quantity;
			this.partNumber = partNumber;
			this.partDescription = partDescription;
			this.pricePerItem = pricePerItem;
	}
	public String getPartNumber()
	{
		return partNumber; // should validate
	}
	// get description
	public String getPartDescription()
	{
		return partDescription;
	}
	// set quantity
	public void setQuantity(int quantity)
	{
		if (quantity < 0) {
			throw new IllegalArgumentException("Quantity must be >= 0");
		} // validate quantity
			
	this.quantity = quantity;
	}
	// get quantity
	public int getQuantity()
	{
		return quantity;
	}
	// set price per item
	public void setPricePerItem(double pricePerItem)
	{
		if (pricePerItem < 0.0) {
		throw new IllegalArgumentException(
				"Price per item must be >= 0");
		} // validate pricePerItem
	
		this.pricePerItem = pricePerItem;
	}
	// get price per item
	public double getPricePerItem()
	{
		return pricePerItem;
	}
	// return String representation of Invoice object
	@Override
	public String toString()
	{
		return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
				"invoice", "part number", getPartNumber(), getPartDescription(),
				"quantity", getQuantity(), "price per item", getPricePerItem());
	}
	@Override
	public double getPaymentAmount()
	{
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}
