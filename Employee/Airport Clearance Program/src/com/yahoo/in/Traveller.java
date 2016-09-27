package com.yahoo.in;

public class Traveller {

	private int iTravellerID;
	private String sTravellerName;
	private long lTravellerContactNo;
	private float fBaggageAmount;
	private int iExpiryYear;
	private boolean bNOCStatus;
	private boolean bValidNo;
	private boolean bValidName;
	public int temp;
	
	public int getiTravellerID() {
		return iTravellerID;
	}
	public String getsTravellerName() {
		return sTravellerName;
	}
	public long getlTravellerContactNo() {
		return lTravellerContactNo;
	}
	public float getfBaggageAmount() {
		return fBaggageAmount;
	}
	public int getiExpiryYear() {
		return iExpiryYear;
	}
	public boolean isbNOCStatus() {
		return bNOCStatus;
	}
	
	public Traveller(int iTravellerID, String sTravellerName,long lTravellerContactNo, float fBaggageAmount, int iExpiryYear, boolean bNOCStatus){
		this.iTravellerID=iTravellerID;
		this.sTravellerName=sTravellerName;
		this.lTravellerContactNo=lTravellerContactNo;
		this.fBaggageAmount=fBaggageAmount;
		this.iExpiryYear=iExpiryYear;
		this.bNOCStatus=bNOCStatus;
	}
	
	public boolean ValidateName(String sTravellerName){
	
		
		temp=this.sTravellerName.length();
	
		if(temp>4 || temp<20)
		{
			bValidName=true;
			System.out.println("Valid Name\n");
		}
		else
		{	
			bValidName=false;
			System.out.println("Invalid name. Enter name with characters ranging from 4 to 20");
		}
		return bValidName;
	}
	
	public boolean ValidateContactNo(long lContactNo){
		if(this.lTravellerContactNo>=7000000000l && this.lTravellerContactNo<=9999999999l)
		{ 
			bValidNo=true;
			System.out.println("Valid contact number\n");
		}
		else
		{
			bValidNo=false;
			System.out.println("Invalid contact number\n");
		}
		return bValidNo;
	}
	
	public void display(){
		System.out.println("Traveller ID:\t"+getiTravellerID()+"\n");
		System.out.println("Traveller Name:\t"+getsTravellerName()+"\n");
		System.out.println("Traveller Contact No:\t"+getlTravellerContactNo()+"\n");
		System.out.println("Baggage amount:\t"+getfBaggageAmount()+"\n");
		System.out.println("Expiry year:\t"+getiExpiryYear()+"\n");
		System.out.println("NOC status:\t"+bNOCStatus+"\n");
	}
}
