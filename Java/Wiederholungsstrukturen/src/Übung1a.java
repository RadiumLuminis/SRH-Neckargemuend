/*
Aufgabe:
Lassen Sie sich die Fakultät einer Zahl ausgeben, die Sie vorher einlesen lassen
Anzeige/Darstellung:
Geben Sie eine ganze Zahl ein: 5
Die Fakultät (5!) entspricht:
120
 */

import java.util.Scanner;

public class Übung1a {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Geben Sie eine ganze Zahl ein: ");
		int fk = 1 ,i = s.nextInt();
		
		System.out.println("Die Fakultät ("+i + "!) entspricht:");
		
		for (int a = i; a > 0; a--) {
			
			fk = fk * a;
			
		}
		
		System.out.println(fk);
	}

}
