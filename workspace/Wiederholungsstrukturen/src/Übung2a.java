/*
Aufgabe:
Es sollen die Zahlen von 1 bis 10 mit Ausnahme der Zahlen 2 und 3 ausgegeben werden.
Anstatt der Zahlen 2 und 3 soll ein Sternchen (*) stehen. Verwenden Sie eine for-Schleife und eine if-Anweisung
Anzeige/Darstellung:
01**456789
 */
public class Übung2a {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i == 2 || i == 3) {
				System.out.print("*");
			} else {
				System.out.print(i);
			}
		}

	}

}
