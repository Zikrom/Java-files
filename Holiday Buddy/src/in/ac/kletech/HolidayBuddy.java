package in.ac.kletech;

interface HolidayBuddy {
	void calDist();
	void checkGender();
	double calDiscount();
	int checkMembers();
}


class Customer
{
	String sCustomerName;
	long lCustomerNo;
	boolean bRepeatCustomer;
	char cGender;
	
	public String getsCustomerName() {
		return sCustomerName;
	}
	public long getlCustomerNo() {
		return lCustomerNo;
	}
	public boolean isbRepeatCustomer() {
		return bRepeatCustomer;
	}
	public char getcGender() {
		return cGender;
	}

	public Customer(String sCustomerName, long lCustomerNo,
			boolean bRepeatCustomer, char cGender) {
		super();
		this.sCustomerName = sCustomerName;
		this.lCustomerNo = lCustomerNo;
		this.bRepeatCustomer = bRepeatCustomer;
		this.cGender = cGender;
	}
	
	public boolean ValidateNum(){
		if(this.lCustomerNo>7000000000l && this.lCustomerNo<9999999999l)
			return true;
		else
			return false;
	}
}


class Package extends Customer implements HolidayBuddy
{
	int iNoOfMembers;
	String sTravelPackage;
	double dDiscount1;
	double dDiscount2;
	double dPrice;
	double dTotal;
	double dDist;

	public Package(String sCustomerName, long lCustomerNo,
			boolean bRepeatCustomer, char cGender, int iNoOfMembers,
			String sTravelPackage, double dDist) {
		super(sCustomerName, lCustomerNo, bRepeatCustomer, cGender);
		this.iNoOfMembers = iNoOfMembers;
		this.sTravelPackage = sTravelPackage;
		this.dDist = dDist;
	}

	public String getsTravelPackage() {
		return sTravelPackage;
	}
	public double getdDiscount1() {
		return dDiscount1;
	}
	public double getdDiscount2() {
		return dDiscount2;
	}
	public double getdTotal() {
		return dTotal;
	}
	public int getiNoOfMembers() {
		return iNoOfMembers;
	}
	public double getdPrice() {
		return dPrice;
	}

	public int checkMembers() {
		if(this.iNoOfMembers == 1)
		{
			checkGender();
			return 1;
		}
		else
			return iNoOfMembers;
	}

	
	public void calDist()
	{
		if(this.dDist>=10 && this.dDist<100)
		{
			this.dPrice = 15*this.dDist;
			System.out.println("Price of package:"+this.dPrice);
		}
		else if(this.dDist>=100 && this.dDist<300)
		{
			this.dPrice = 50*this.dDist;
			System.out.println("Price of package:"+this.dPrice);
		}
		else if(this.dDist>=300 && this.dDist<500)
		{
			this.dPrice = 75*this.dDist;
			System.out.println("Price of package:"+this.dPrice);
		}
		else if(this.dDist>=500 && this.dDist<700)
		{
			this.dPrice = 85*this.dDist;
			System.out.println("Price of package:"+this.dPrice);
		}
		else if(this.dDist>=700 && this.dDist<900)
		{
			this.dPrice =105*this.dDist;
			System.out.println("Price of package:"+this.dPrice);
		}
		else if(this.dDist>=900 && this.dDist<1000)
		{
			this.dPrice = 120*this.dDist;
			System.out.println("Price of package:"+this.dPrice);
		}	
		else if(this.dDist>=1000 && this.dDist<1500)
		{
			this.dPrice = 140*this.dDist;
			System.out.println("Price of package:"+this.dPrice);
		}
	}
	
	
	public double calDiscount() {
		if(this.bRepeatCustomer == true)
			this.dDiscount1 =( this.dPrice-(0.10*this.dPrice));
		return this.dDiscount1;
	}
	
	
	public double applyDiscount()
	{
		this.dDiscount2 = (this.dPrice-(0.02*this.dPrice));
		return this.dDiscount2;
	}
	

	public void checkGender() {
		if(this.cGender == 'f' || this.cGender == 'F')
		{
			//System.out.println("Customer is female."+"\n");
			this.applyDiscount();
		}
		if(this.cGender == 'm' || this.cGender == 'M')
			System.out.println("Customer is male.");
	}
	
	
	public void totalDiscount()
	{
		if(this.dDiscount2!=0)
		{	
			this.dTotal = this.dDiscount2;
			//return this.dTotal;
		}
		else if(this.dDiscount1!=0)
		{
			this.dTotal = this.dDiscount1;
			//return this.dTotal;
		}
		else if(this.dDiscount1!=0 && this.dDiscount2!=0)
		{
			this.dTotal=this.dPrice-(0.12*this.dPrice);
		}
		
		//System.out.println("Price after discount:"+this.dTotal);
	}
	
	void CustomerRep()
	{
		if(this.bRepeatCustomer == true)
			System.out.println("Customer has revisited.");
		else if(this.bRepeatCustomer == false)
			System.out.println("Customer is visiting for first time.");
	}
	
	public void Display()
	{
		System.out.println("Customer Name:"+this.sCustomerName);
		System.out.println("Customer phone number:"+this.lCustomerNo);
		System.out.println("Customer Gender:"+this.cGender);
		System.out.println("Package selected:"+this.sTravelPackage);
		System.out.println("No of members travelling:"+this.iNoOfMembers);
	//	System.out.println("Price of package:"+this.dPrice);
	//	System.out.println("Discount availed for regular customer:" + this.calDiscount());
		System.out.println("Price after discount:"+this.dTotal);
		System.out.println("Distance of travel:"+this.dDist+"Kms");
		System.out.println("\n");
	}
}
