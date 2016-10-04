package in.ac.kletech;

interface college
{
	double calFees(Student obj);
	void CheckEligible(Student obj);
	void disp(Student obj);
}

public class KLETECH implements college {

	double dFinalFee;
	final double dFee = 65000;
	
	public double getdFinalFee() {
		return dFinalFee;
	}

	public double getdFee() {
		return dFee;
	}

	/*public KLETECH(double dFinalFee) {
		super();
		this.dFinalFee = dFinalFee;
	}*/

	public double calFees(Student obj) {
	
		if(obj.bScholarship == true)
		{
			dFinalFee = dFee - 12000;
			return dFinalFee;
		}
		else
			return dFee;
	}
	
	public void CheckEligible(Student obj) {
		
		if(obj.cGrade != 'F' || obj.cGrade != 'f')
			System.out.print("Student has passed the semister"+"\n");
		else
			System.out.print("Student is ineligible"+"\n");
	}

	public void disp(Student obj) {
		
	System.out.println("Student Name:"+obj.sName);
	System.out.println("Student ID:"+obj.iID);
	System.out.println("Semister:"+obj.iSem);
	System.out.println("Student Attendence:"+obj.iAttendance+"/100");
	System.out.println("Student grade:"+obj.cGrade);
	System.out.println("Student CGPA:"+obj.fCGPA);
	System.out.println("Student Backlog:"+obj.iBacklog);
	System.out.println("Fees to be paid:"+calFees(obj)+"\n");
	}

}

/*class CSE extends KLETECH
{
	
}
*/
 class Student
{
	String sName;
	int iID;
	char cGrade;
	float fCGPA;
	int iSem;
	int iBacklog;
	boolean bScholarship;
	int iAttendance;
	public String getsName() {
		return sName;
	}
	public int getiID() {
		return iID;
	}
	public char getcGrade() {
		return cGrade;
	}
	public float getfCGPA() {
		return fCGPA;
	}
	public int getiSem() {
		return iSem;
	}
	public int getiBacklog() {
		return iBacklog;
	}
	public boolean isbScholarship() {
		return bScholarship;
	}

	public int getiAttendance() {
		return iAttendance;
	}
	public Student(String sName, int iID, char cGrade, float fCGPA, int iSem,
			int iBacklog, boolean bScholarship,int iAttendance) {
		super();
		this.sName = sName;
		this.iID = iID;
		this.cGrade = cGrade;
		this.fCGPA = fCGPA;
		this.iSem = iSem;
		this.iBacklog = iBacklog;
		this.bScholarship = bScholarship;
		this.iAttendance = iAttendance;
	}
}