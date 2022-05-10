package konten;

public class Girokonto {

	private String kontoinhaber;
	private double kontostand;
	private double dispo;
	
	public Girokonto(String kontoinhaber, double dispo) {
		kontostand = 0.0;
		this.kontoinhaber = kontoinhaber;
		this.dispo = dispo;
	}

	public Girokonto() {
		kontostand = 0.0;
		kontoinhaber = "";
		dispo = 0.0;
	}

	public String getKontoinhaber() {
		return kontoinhaber;
	}

	public void setKontoinhaber(String kontoinhaber) {
		this.kontoinhaber = kontoinhaber;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public double getDispo() {
		return dispo;
	}

	public void setDispo(double dispo) {
		this.dispo = dispo;
	}
	
	
	public void geldEinzahlen(double betrag) {
		System.out.printf("Alter Kontostand: %.2f Euro\n", kontostand);
		kontostand += betrag;
		System.out.printf("Neuer Kontostand: %.2f Euro\n\n", kontostand);
	}
	
	//Vor der Transaktion wird der Dispo überprüft
	public void geldAbheben(double betrag) {
		if(kontostand - betrag < dispo * -1) {
			System.out.println("Kontostand überschreitet Dispo! Transaktion wird nicht durchgeführt!");
			System.out.printf("Kontostand: %.2f Euro", kontostand);
		}
		else {
			System.out.printf("Alter Kontostand: %.2f Euro\n", kontostand);
			kontostand -= betrag;
			System.out.printf("Neuer Kontostand: %.2f Euro\n\n", kontostand);
		}
		
	}
	
	public void zeigeKontostand() {
		System.out.printf("Kontostand: %.2f Euro\n", kontostand);
	}
}
