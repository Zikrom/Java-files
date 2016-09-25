package details.retail.in;

public class RetailDemo {

	public static void main(String[] args) {
		Customer sujay = new Customer(8147268322l, "Sujay");
		sujay.ValidateContact(8147268322l);
		sujay.ValidateName(sujay);
		sujay.display(sujay);
		ItemDetails item = new ItemDetails(1001,2344.5d);
		item.ValidID(item);
		item.ValidPrice(item);

		Customer sumegh = new Customer(9008363220l, "Sumegh");
		sumegh.ValidateContact(9008363220l);
		sumegh.ValidateName(sumegh);
		sumegh.display(sumegh);
		ItemDetails item1 = new ItemDetails(1005,499d);
		item1.ValidID(item1);
		item1.ValidPrice(item1);
	}

}
