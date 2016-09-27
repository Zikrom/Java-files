package Air.c.in;

interface Airport {
	String sAirportName = "Hubli Airport";
	String sAirportID = "HBL";
	
	boolean checkExpiry(AirportC obj);
	
	boolean checkWeight(AirportC obj);

	boolean checkPurchase(AirportC obj);
}

class AirportC extends Traveller implements Airport
{
	
	public AirportC(String sTravellerName, int iTravellerID, int iExpiry,
			long lTravellerContactNo, boolean bImmigration, float fWeight, boolean bpurchase) {
		super(sTravellerName, iTravellerID, iExpiry, lTravellerContactNo, bImmigration, fWeight, bpurchase);
		// TODO Auto-generated constructor stub
	}

	public boolean checkExpiry(AirportC obj) {
		if(this.iExpiry>2019)
			return false;
		else 
			return true;
	}

	public boolean checkWeight(AirportC obj) {
		if(this.fWeight<30.0f)
			return true;
		else
			return false;
	}

	public boolean checkPurchase(AirportC obj) {
		if (this.bpurchase == true)
			return true;
		else
			return false;
	}
}

class Traveller{
	 String sTravellerName;
	 int iTravellerID;
	 int iExpiry;
	 long lTravellerContactNo;
	 boolean bImmigration;
	 boolean bpurchase;
	 float fWeight;
	 
	 
	public boolean isbPurchase() {
		return bpurchase;
	}
	public float getfWeight() {
		return fWeight;
	}
	public String getsTravellerName() {
		return sTravellerName;
	}
	public int getiTravellerID() {
		return iTravellerID;
	}
	public int getiExpiry() {
		return iExpiry;
	}
	public long getlTravellerContactNo() {
		return lTravellerContactNo;
	}
	public boolean isbImmigration() {
		return bImmigration;
	}
	public Traveller(String sTravellerName, int iTravellerID, int iExpiry,
			long lTravellerContactNo, boolean bImmigration, float fWeight, boolean bpurchase) {
		super();
		this.sTravellerName = sTravellerName;
		this.iTravellerID = iTravellerID;
		this.iExpiry = iExpiry;
		this.lTravellerContactNo = lTravellerContactNo;
		this.bImmigration = bImmigration;
		this.fWeight = fWeight;
		this.bpurchase = bpurchase;
	}
	
	public boolean ValidateName(Traveller obj){
		if(this.sTravellerName.length()>4 && this.sTravellerName.length()<20)
			return true;
		else
			return false;
	}
	
	public boolean ValidateNum(Traveller obj){
		if(this.lTravellerContactNo>7000000000l && this.lTravellerContactNo<9999999999l)
			return true;
		else
			return false;
	}
	
	public void display(Traveller obj)
	{
		System.out.println("Traveller name:"+this.sTravellerName);
		System.out.println("Traveller ID:"+this.iTravellerID);
		System.out.println("Traveller Passport Valid till:"+this.iExpiry);
		System.out.println("Traveller Contact number:"+this.lTravellerContactNo);
		System.out.println("Traveller Baggage Weight:"+this.fWeight);
		System.out.println("Traveller Purchase:"+this.bpurchase);
	}

}