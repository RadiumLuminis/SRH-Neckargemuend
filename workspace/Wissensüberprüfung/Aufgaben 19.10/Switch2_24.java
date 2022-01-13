import java.util.Scanner;

public class Switch2_24 {

public static void main(String[] args) {
		
		System.out.println("Was soll berechnet werden?");
		System.out.println("Bitte auswählen: U = Spannung, I = Strom, R= Widerstand:");
		Scanner s = new Scanner(System.in);
		String a = s.next();
		double b, c;
		
		
		switch (a) {
		case "U":
			System.out.println("Bitte den Wert für I (Strom) eingeben:");
			b = s.nextDouble();
			System.out.println("Bitte den Wert für R (Widerstand) eingeben:");
			c = s.nextDouble();
			System.out.println("Die Spannung beträgt " +b*c +" Volt");
			break;
		case "I":
			System.out.println("Bitte den Wert für U (Spannung) eingeben:");
			b = s.nextDouble();
			System.out.println("Bitte den Wert für R (Widerstand) eingeben:");
			c = s.nextDouble();
			System.out.println("Der Strom beträgt " +b/c +" Amper");
			break;
		case "R":
			System.out.println("Bitte den Wert für U (Spannung) eingeben:");
			b = s.nextDouble();
			System.out.println("Bitte den Wert für I (Strom) eingeben:");
			c = s.nextDouble();
			System.out.println("Der Widerstand beträgt " +b/c +" Ohm");
			break;
		default:
			System.out.println("Fehlerhafte Eingabe");
		}
		s.close();
	}

}
