package Auto1;

public class Auto {

	private String modell;
	private String farbe;
	
	public Auto() {
		modell = "";
		farbe = "";
	}
	
	public Auto(String modell, String farbe) {
		this.modell = modell;
		this.farbe = farbe;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
		
}
