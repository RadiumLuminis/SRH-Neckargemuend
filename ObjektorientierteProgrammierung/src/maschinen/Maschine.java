package maschinen;

public class Maschine {
	
	private double preis;
	private double gewicht;
	
	public Maschine() {
		preis = 0;
		gewicht = 0;
	}
	
	public Maschine(double preis, double gewicht) {
		this.preis = preis;
		this.gewicht = gewicht;
	}

	public void zeigeInfos() {
		System.out.println("Infos Maschine:");
		System.out.println("Preis der Maschine: " +preis +" Euro.");
		System.out.println("Gewicht der Maschine: " +gewicht +" Kg.");
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		if(preis > 10000) {
			System.out.println("Preis zu hoch!");
		}
		else {
			this.preis = preis;
		}
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		if(gewicht > 1000) {
			System.out.println("Gewicht zu hoch!");
		}
		else {
			this.gewicht = gewicht;
		}
	}

}
