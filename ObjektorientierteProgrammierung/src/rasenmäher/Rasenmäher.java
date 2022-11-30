package rasenm�her;

import maschinen.Maschine;

public class Rasenm�her extends Maschine {

	private int drehzahl;
	private int schnittbreite;
	
	public Rasenm�her() {
		drehzahl = 0;
		schnittbreite = 0;	
	}

	public Rasenm�her(int drehzahl, int schnittbreite) {
		this.drehzahl = drehzahl;
		this.schnittbreite = schnittbreite;
	}
	
	public Rasenm�her(double preis, double gewicht, int drehzahl, int schnittbreite) {
		super(preis, gewicht);
		this.drehzahl = drehzahl;
		this.schnittbreite = schnittbreite;
	}
	
	public int getDrehzahl() {
		return drehzahl;
	}

	public void setDrehzahl(int drehzahl) {
		this.drehzahl = drehzahl;
	}

	public int getSchnittbreite() {
		return schnittbreite;
	}

	public void setSchnittbreite(int schnittbreite) {
		this.schnittbreite = schnittbreite;
	}
	
	public void zeigeInfos() {
		super.zeigeInfos();
		System.out.println("Infos Rasenm�her:");
		System.out.println("Maximale Drehzahl des Rasenm�hers: " +drehzahl +" U/min.");
		System.out.println("Schnittbreite des Rasenm�hers: " +schnittbreite +" cm.");
	}
	
}
