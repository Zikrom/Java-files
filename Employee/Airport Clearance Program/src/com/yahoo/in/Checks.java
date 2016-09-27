package com.yahoo.in;

public class Checks {

	private boolean bBaggageCheck;
	private boolean bImmigration;
	private boolean bSecurity;
	private boolean bChecked;
	
	
	public boolean isbBaggageCheck() {
		return bBaggageCheck;
	}

	public boolean isbImmigration() {
		return bImmigration;
	}

	public boolean isbSecurity() {
		return bSecurity;
	}

	public boolean isbChecked() {
		return bChecked;
	}

	public boolean CheckBaggage(Traveller sujay){
		if(sujay.getfBaggageAmount()>=0.00f && sujay.getfBaggageAmount()<=40.00f)
			bBaggageCheck=true;
		else
			bBaggageCheck=false;
		return bBaggageCheck;
	}
	
	public boolean CheckImmigration(Traveller sujay){
		if(sujay.getiExpiryYear()>=2001 && sujay.getiExpiryYear()<=2025)
			bImmigration=true;
		else
			bImmigration=false;
		return bImmigration;
	}
	
	public boolean CheckSecurity(Traveller sujay){
		if(sujay.isbNOCStatus()==true) 
			bSecurity=true;
		else
			bSecurity=false;
		return bSecurity;
	}
	
	public void Check(){
		if(bBaggageCheck==true && bImmigration==true && bSecurity==true)
			{
				bChecked=true;
				System.out.println("Allow Traveller to fly\n");
			}
			
		else
		{
			bChecked=false;
			System.out.println("Detain Traveller for rechecking\n");
		}	

			//return bChecked;
}
}