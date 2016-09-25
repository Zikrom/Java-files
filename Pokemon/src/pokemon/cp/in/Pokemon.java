package pokemon.cp.in;

public class Pokemon {
	private int ipokeID;
	private String sPokeName;
	private String sType;
	private int iInitialCP;
	private int itotalMatchesPlayed;
	private int iwon;
	private int ilost;
	private float fFinalCP;
	
	public int getIlost() {
		return ilost;
	}

	public int getIpokeID() {
		return ipokeID;
	}
	
	public String getsPokeName() {
		return sPokeName;
	}
	
	public String getsType() {
		return sType;
	}
	
	public int getiInitialCP() {
		return iInitialCP;
	}
	
	public int getItotalMatchesPlayed() {
		return itotalMatchesPlayed;
	}
	
	public int getIwon() {
		return iwon;
	}
	
	public float getfFinalCP() {
		return fFinalCP;
	}
	
	public Pokemon(int ipokeID, String sPokeName, String sType, int iInitialCP, int iwon, int ilost) {
		super();
		this.ipokeID = ipokeID;
		this.sPokeName = sPokeName;
		this.sType = sType;
		this.iInitialCP = iInitialCP;
		this.iwon = iwon;
		this.ilost = ilost;
	}
	
	float calCP(Pokemon obj)
	{
		if(this.iwon>this.ilost)
		{
			if(this.iwon>=1 && this.iwon<=20)
			{
				this.fFinalCP =(float) (((this.iwon-this.ilost)*0.10)+this.iInitialCP);
			}
		
			else if(this.iwon>20 && this.iwon<=40)
			{
				this.fFinalCP =(float) (((this.iwon-this.ilost)*0.25)+this.iInitialCP);
			}
		
			else if(this.iwon>40 && this.iwon<=60)
			{
				this.fFinalCP =(float) (((this.iwon-this.ilost)*0.40)+this.iInitialCP);
			}
		
			else if(this.iwon>60)
			{
				this.fFinalCP =(float) (((this.iwon-this.ilost)*0.50)+this.iInitialCP);
			}	
		}
		
		else if(this.ilost>this.iwon)
		{
			if(this.ilost>=1 && this.ilost<=20)
			{
				this.fFinalCP =(float) (((this.iwon-this.ilost)*0.10)+this.iInitialCP);
			}
		
			else if(this.ilost>20 && this.ilost<=40)
			{
				this.fFinalCP =(float) (((this.iwon-this.ilost)*0.25)+this.iInitialCP);
			}
		
			else if(this.ilost>40 && this.ilost<=60)
			{
				this.fFinalCP =(float) (((this.iwon-this.ilost)*0.40)+this.iInitialCP);
			}
		
			else if(this.ilost>60)
			{
				this.fFinalCP =(float) (((this.iwon-this.ilost)*0.50)+this.iInitialCP);
			}
		}
		return fFinalCP;
	}
	
	void disp(Pokemon obj)
	{
		System.out.println("Pokemon name:"+this.sPokeName+"\n");
		System.out.println("Pokemon ID:"+this.ipokeID+"\n");
		System.out.println("Pokemon type:"+this.sType+"\n");
		System.out.println("Pokemon Initial Cp:"+this.iInitialCP+"\n");
		System.out.println("Pokemon battles won:"+this.iwon+"\n");
		System.out.println("Pokemon battles lost:"+this.ilost+"\n");
		System.out.println("Pokemon Final Cp:"+this.calCP(obj)+"\n");
		System.out.println("Total Matches played:"+(this.iwon+this.ilost)+"\n");
	}
}
