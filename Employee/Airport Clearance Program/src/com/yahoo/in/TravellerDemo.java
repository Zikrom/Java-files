package com.yahoo.in;

public class TravellerDemo {

	public static void main(String[] args) {
		Traveller sujay=new Traveller(1234,"Sujay",9876543234l,40,2019,true);
		sujay.display();
		
		Checks temp =new Checks();
		sujay.ValidateName(sujay.getsTravellerName());
		sujay.ValidateContactNo(sujay.getlTravellerContactNo());
		temp.CheckBaggage(sujay);
		temp.CheckImmigration(sujay);
		temp.CheckSecurity(sujay);
		temp.Check();
		
	}

}
