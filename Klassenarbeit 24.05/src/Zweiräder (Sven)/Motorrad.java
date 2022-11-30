package Zweiräder;

public class Motorrad {
	
	private String marke;
	private int geschwindigkeit;
	private boolean istAngemeldet;
	
	public Motorrad() {
		marke = "no_name";
		geschwindigkeit = 0;
		istAngemeldet = true;
	}
	
	public Motorrad(String marke) {
		this.marke = marke;
		geschwindigkeit = 0;
		istAngemeldet = true;
	}
	
	public void beschleunigen() {
		if (geschwindigkeit == 189) {
			System.out.println("Und da kam die Polizei und fragt: \"Ja was ist denn das?\"");
		}
		if (geschwindigkeit < 250) {
			geschwindigkeit += 1;
			//System.out.println(geschwindigkeit);
		}
		else {
			//System.out.println("Maximale Geschwindigkeit bereits erreicht!");
		}
	}
	
	public void bremsen() {
		if (geschwindigkeit == 1) {
			System.out.println("Drei Chinesen ohne Kontrabass! (Und Führerschein)");
		}
		if (geschwindigkeit > 0) {
			geschwindigkeit -= 1;
			//System.out.println(geschwindigkeit);
		}
		else {
			//System.out.println("Bremsen im Stillstand senkt die Geschwindigkeit nicht");
		}
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public boolean isIstAngemeldet() {
		return istAngemeldet;
	}

	public void setIstAngemeldet(boolean istAngemeldet) {
		this.istAngemeldet = istAngemeldet;
		if (!istAngemeldet) {
			System.out.println("Ein Gedicht by Sven Krusch");
		}
	}	

}
