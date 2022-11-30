package maschinen;

public class Rasenmaeher extends Maschine{

	private int drehzahl;
	private int schnittbreite;
	
	public Rasenmaeher() {
		drehzahl = 0;
		schnittbreite = 0;
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
	
}
