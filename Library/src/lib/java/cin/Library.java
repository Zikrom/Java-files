package lib.java.cin;

public class Library {
	private String sbookTitle;
	private int ibookID;
	private String sbookDept;
	private int itime;
	private int ipend;
	private int ibalance;
	
	public int getIpend() {
		return ipend;
	}

	public int getItime() {
		return itime;
	}

	public String getSbookTitle() {
		return sbookTitle;
	}

	public int getIbookID() {
		return ibookID;
	}

	public String getsbookDept() {
		return sbookDept;
	}

	public Library(String sbookTitle, int ibookID, char cbookDept, int itime, String sbookDept, int ipend, int ibalance) {
		super();
		this.sbookTitle = sbookTitle;
		this.ibookID = ibookID;
		this.sbookDept = sbookDept;
		this.itime = itime;
		this.ipend = ipend;
		this.ibalance = ibalance;
	}

	void referenceSection(Library obj){
		if(this.itime == 4)
			System.out.println("Time for referring books is over.");
	}
	
	int bookLending(Library obj){
		if(this.ipend > 15 && this.ipend<22)
		{
			this.ibalance = this.ibalance + 20;
		}
		else if(this.ipend>22 && this.ipend<29)
		{
			this.ibalance = this.ibalance + 50;
		}
		else if(this.ipend>29 && this.ipend <36)
		{
			this.ibalance = this.ibalance + 100;
		}
		else if(this.ibalance>36)
		{
			this.ibalance = this.ibalance + 300;
		}
		return this.ibalance;
	}
	
	void questionPaper(Library obj)
	{
		if(this.sbookDept=="cse")
		{
			System.out.println("Question paper belongs to Computer science branch");
		}
		if(this.sbookDept=="ece")
		{
			System.out.println("Question paper belongs to Electronics and communication branch");
		}
		if(this.sbookDept=="bt")
		{
			System.out.println("Question paper belongs to Biotechnology branch");
		}
		if(this.sbookDept=="robotics")
		{
			System.out.println("Question paper belongs to Robotics branch");
		}
	}
}
