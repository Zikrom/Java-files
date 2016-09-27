package bank.c.in;

interface Bank {
	void deposit(float famt);
	void withdraw(float famt);
}

class sbi extends Customer implements Bank
{
	float famt;
	float fbalance;

	public void deposit(float famt)
	{
		this.fbalance+= famt;
		System.out.println("Amount deposited:"+fbalance);
	}
	
	public void withdraw(float famt) {
		this.fbalance-= famt;
		System.out.println("Amount withdrawed:"+fbalance);
	}
	
	public void transfer(Customer obj, float famt)
	{
		this.fbalance-= famt;
		
	}
}

class Customer
{
	String sName;
	int iaccno;
	float fbalance;
	String sType;
	
}