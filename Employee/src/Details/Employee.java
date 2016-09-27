package Details;

public class Employee {
	private int iEmpID;
	private String sEmpName;
	private float fEmpBasicSalary;
	private float fAllowance;
	private float fGrossSalary;
	private double lfIncomeTax;
	float fNetSalary;

	Employee(int iEmpID, String sEmpName, float fEmpBasicSalary ){
		this.iEmpID=iEmpID;
		this.sEmpName=sEmpName;
		this.fEmpBasicSalary=fEmpBasicSalary;
		
	}
	
	public int getiEmpID() {
		return iEmpID;
	}
	
	public String getsEmpName() {
		return sEmpName;
	}
	
	public float getfEmpBasicSalary() {
		return fEmpBasicSalary;
	}
	
	public float getfAllowance() {
		return fAllowance;
	}
	
	public float getfGrossSalary() {
		return fGrossSalary;
	}

	public double getlfIncomeTax() {
		return lfIncomeTax;
	}

	public float getfNetSalary() {
		return fNetSalary;
	}

	public float calNetSalary(float fEmpBasicSalary){
	
	fAllowance=(float)(0.46*fEmpBasicSalary);
	
	fGrossSalary=fAllowance+fEmpBasicSalary;
	
	if(fGrossSalary<5000)
		lfIncomeTax=0;
	
	else if(fGrossSalary>5000 && fGrossSalary<10000)
		lfIncomeTax=0.1*fGrossSalary;
	
	else if(fGrossSalary>10000 && fGrossSalary<20000)
		lfIncomeTax=0.2*fGrossSalary;
	
	else 
		lfIncomeTax=0.3*fGrossSalary;
	
	fNetSalary=(float)(fGrossSalary-lfIncomeTax);
	return fNetSalary;
	}
	
	public void display(){
		System.out.println("Employee ID:\t"+this.getiEmpID()+"\n");
		System.out.println("Employee Name:\t"+this.getsEmpName()+"\n");
		
		System.out.println("Employee Basic Salary:\t"+this.getfEmpBasicSalary()+"\n");
		System.out.println("Employee Allowance:\t"+this.getfAllowance()+"\n");
		System.out.println("Employee gross salary:\t"+this.getfGrossSalary()+"\n");
		System.out.println("Income Tax:\t"+this.getlfIncomeTax()+"\n");
		System.out.println("Employee Net salary:\t"+this.getfNetSalary()+"\n");
	
	}
	public void compare(){
		
	}
		
}
