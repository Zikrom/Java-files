package in.ac.kletech;

public class HolidayBuddyDemo {

	public static void main(String[] args) {
		Package p = new Package("Sujay", 9008363220l, true, 'M', 4, "holiday", 50f);
		p.checkGender();
		p.CustomerRep();
		p.checkMembers();
		p.calDist();
		p.calDiscount();
		p.applyDiscount();		
		p.totalDiscount();
		p.Display();
		
		Package q = new Package("Sudhanva",8008363220l, true, 'M', 5, "travel", 150f);
		q.checkGender();
		q.CustomerRep();
		q.checkMembers();
		q.calDist();
		q.calDiscount();
		q.applyDiscount();
		q.totalDiscount();
		q.Display();
		
		Package r = new Package("Rosy", 7008363220l, false, 'F', 2, "holiday", 100f);
		r.checkGender();
		r.CustomerRep();
		r.checkMembers();
		r.calDist();
		r.calDiscount();
		r.applyDiscount();
		r.totalDiscount();
		r.Display();
		
		
	}

}
