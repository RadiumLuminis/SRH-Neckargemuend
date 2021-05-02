import java.math.*;

public class Geometrie {

	public static void main(String[] args) {
		
		Rechteck r1 = new Rechteck(5, 12);
		int flaecheR = r1.Breite * r1.Hoehe; 
		Kreis k1 = new Kreis(3);
		double flaecheK = (Math.pow(k1.radius, 2) * Math.PI);
		
		if(flaecheR > flaecheK) {
			System.out.println("Das Rechteck ist größer als der Kreis");
		}
		else {
			System.out.println("Der Kreis ist größer als das Rechteck");
		}
		
		Rechteck r2 = new Rechteck();
		int flaecheR2 = r2.Breite * r2.Hoehe;
		Kreis k2 = new Kreis();
		double flaecheK2 = (Math.pow(k2.radius, 2) * Math.PI);
		Dreieck d2 = new Dreieck();
		double flaecheD = d2.Hoehe * d2.Breite * 0.5;
		
		System.out.println("Die Fläche des Rechtecks: " +flaecheR2);
		System.out.println("Die Fläche des Kreises: " +flaecheK2);
		System.out.println("Die Fläche des Dreiecks: " +flaecheD);
		
	}

}
