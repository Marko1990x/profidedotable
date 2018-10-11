package prof;



public class Objekat {
	
	
	private String Name;
	private String lokacija;
	private int numberlocation;
	private String profaOsecaj;
	
	
	Objekat(){
		
	}
	
	


	public Objekat(String name) {
		super();
		Name = name;
	}




	public Objekat(String name, String lokacija, int numberlocation, String profaOsecaj) {
		super();
		Name = name;
		this.lokacija = lokacija;
		this.numberlocation = numberlocation;
		this.profaOsecaj = profaOsecaj;
		
		
		
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getLokacija() {
		return lokacija;
	}


	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}


	public int getNumberlocation() {
		return numberlocation;
	}


	public void setNumberlocation(int numberlocation) {
		this.numberlocation = numberlocation;
	}


	public String getProfaOsecaj() {
		return profaOsecaj;
	}


	public void setProfaOsecaj(String profaOsecaj) {
		this.profaOsecaj = profaOsecaj;
	}


	@Override
	public String toString() {
		return String.format("%20s %25s, %2s, %20s", Name, lokacija, numberlocation, profaOsecaj);
	}
	
	/*
	 * 
	private String Name;
	private String lokacija;
	private int numberlocation;
	private String profaOsecaj;
	
	 */

	
	
}
