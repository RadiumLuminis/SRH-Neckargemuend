/*
Aufgabe:
Erweitern Sie das Programm „Vielfaches“, das unter Verwendung einer geeigneten Schleife eine ganze Zahl von der Tastatur einliest
und deren Vielfache (für die Faktoren 2 bis 11) ausgibt. 
Anzeige/Darstellung:
Geben Sie eine ganze Zahl ein: 5
Die ersten Zahn Vielfachen von 5 lauten:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50
*/
import java.util.Scanner;

public class Übung6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Geben Sie eine ganze Zahl ein: ");
		int vzahl = s.nextInt();
		
		System.out.println("Die ersten zehn Vielfachen von " +vzahl +" lauten:");

		for (int i = 2; i < 11; i++) {

			System.out.print(i*vzahl +", ");
		}
		
		System.out.println(11*vzahl);
		
		s.close();
		
	}

}
