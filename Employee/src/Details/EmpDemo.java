package Details;

public class EmpDemo {

	
	public static void main(String[] args) {
		Employee sujay =new Employee(15,"Sujay",100000.00f);
		System.out.println("Employee Details:\n");
		sujay.fNetSalary=sujay.calNetSalary(sujay.getfEmpBasicSalary());
		sujay.display();
		
		Employee sudhanva =new Employee(14,"Sudhanva",100000.00f);
		System.out.println("Employee Details:\n");
		sudhanva.fNetSalary=sudhanva.calNetSalary(sudhanva.getfEmpBasicSalary());
		sudhanva.display();
		
		Employee sumegh =new Employee(16,"Sumegh",100000.00f);
		System.out.println("Employee Details:\n");
		sumegh.fNetSalary=sumegh.calNetSalary(sumegh.getfEmpBasicSalary());
		sumegh.display();
		
		
	}

}
