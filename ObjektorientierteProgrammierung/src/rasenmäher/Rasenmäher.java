package rasenmäher;

import maschinen.Maschine;

public class Rasenmäher extends Maschine {

	private int drehzahl;
	private int schnittbreite;
	
	public Rasenmäher() {
		drehzahl = 0;
		schnittbreite = 0;	
	}

	public Rasenmäher(int drehzahl, int schnittbreite) {
		this.drehzahl = drehzahl;
		this.schnittbreite = schnittbreite;
	}
	
	public Rasenmäher(double preis, double gewicht, int drehzahl, int schnittbreite) {
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
		System.out.println("Infos Rasenmäher:");
		System.out.println("Maximale Drehzahl des Rasenmähers: " +drehzahl +" U/min.");
		System.out.println("Schnittbreite des Rasenmähers: " +schnittbreite +" cm.");
	}
	
}
