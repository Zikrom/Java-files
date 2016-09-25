package details.retail.in;

public class Customer {
	private long lContactNo;
	private String sCustomerName;

	public Customer(long lContactNo, String sCustomerName) {
		super();
		this.lContactNo = lContactNo;
		this.sCustomerName = sCustomerName;
	}

	public long getlContactNo() {
		return lContactNo;
	}

	public String getsCustomerName() {
		return sCustomerName; 
	}

	public void ValidateContact(long lContactNo) {
		if (lContactNo > 7000000000l && lContactNo < 9999999999l)
			System.out.println("Contact number is valid" + "\n");
		else
			System.out.println("Entered contact number is invalid" + "\n");
	}

	public void ValidateName(Customer tempCust) {
		if (tempCust.sCustomerName.length() > 4 && tempCust.sCustomerName.length() < 20)
			System.out.println("Valid Name" + "\n");
		else
			System.out.println("Invalid name length" + "\n" + "Length should be between 4 and 20" + "\n");
	}
	
	public void display(Customer tempCust){
		System.out.println("Customer phone number:"+this.lContactNo+"\n");
		System.out.println("Customer Name:"+this.sCustomerName+"\n");
	}
}
