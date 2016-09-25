package details.retail.in;

public class ItemDetails {
	private int iitemID;
	private double ditemPrice;
	private double ddiscount;
	public int getIitemID() {
		return iitemID;
	}
	public double getditemPrice() {
		return ditemPrice;
	}
	public ItemDetails(int iitemID, double lfitemPrice) {
		super();
		this.iitemID = iitemID;
		this.ditemPrice = lfitemPrice;
	}
	
	public void ValidID(ItemDetails temp){
		if(iitemID>=1001 || iitemID<=1005)
			System.out.println("Valid item Id"+"\n");
		else
			System.out.println("Invalid Id"+"\n");
	}
	public void ValidPrice(ItemDetails temp){
		if(ditemPrice>=1000){
			this.ddiscount=this.ditemPrice-0.1*this.ditemPrice;
			System.out.println("Amount to be paid:"+this.ddiscount+"\n");
		}
		else if(ditemPrice<1000 && ditemPrice>=500){
			this.ddiscount=this.ditemPrice-0.05*this.ditemPrice;
			System.out.println("Amount to be paid:"+this.ddiscount+"\n");
		}
		else if(ditemPrice<500 && ditemPrice>5){
			System.out.println("No Discount"+"\n");
			this.ddiscount=this.ditemPrice;
			System.out.println("Amount to be paid:"+this.ddiscount+"\n");
		}
		else
			System.out.println("Invalid Id"+"\n");
			
		}
	}

