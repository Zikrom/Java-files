package Details;

public class EmpDemo {

	public static void main(String[] args) {
		Employee sujay = new Employee(15,"Sujay",100000.00f);
		System.out.println("Employee details:\n");
		sujay.fNetSalary=sujay.calNetSalary(sujay.getfEmpBasicSalary());
		sujay.display();
	}

}
