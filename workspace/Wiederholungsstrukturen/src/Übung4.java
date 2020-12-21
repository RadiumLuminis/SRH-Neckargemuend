/*
Aufgabe:
Vereinfachen Sie in dem folgenden Programm,
bei dem die Variablen x und y innerhalb der Schleife nicht verändert werden, durch vorheriges Ausrechnen, die for-Schleife.
Ursprung:
int x = 2, y = 10;

for (int j = x; j <= 4 * x * y; j += y / x) {
			
System.out.println("j = " + j);

}
 */
public class Übung4 {

	public static void main(String[] args) {

		for (int j = 2; j <= 80; j += 5) {

			System.out.println("j = " + j);
			
		}

	}

}
