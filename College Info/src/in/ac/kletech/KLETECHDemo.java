package in.ac.kletech;

public class KLETECHDemo {

	public static void main(String[] args) {

		Student s = new Student("Sujay",315,'a',9,3,0,false, 97);
		KLETECH s1 = new KLETECH();
		
		s1.calFees(s);
		s1.CheckEligible(s);
		s1.disp(s);
		
		Student s2 = new Student("Sudhanva",314,'a',9,3,0,false, 93);
		s1.calFees(s2);
		s1.CheckEligible(s2);
		s1.disp(s2);

		Student s3 = new Student("Shivanand",345,'a',9.1f,3,0,true, 98);
		s1.calFees(s3);
		s1.CheckEligible(s3);
		s1.disp(s3);
	}

}
