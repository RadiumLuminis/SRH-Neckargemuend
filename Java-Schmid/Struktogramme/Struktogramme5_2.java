import java.util.Scanner;

public class Struktogramme5_2 {

	public static void main(String[] args) {
	
		int anzahl = 0;
		int rabattsatz = 0;
		double preis = 0;
		double endpreis = 0;
		double warenwert = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Anzahl ein: ");
		anzahl = sc.nextInt();
		System.out.println("Bitte geben Sie den Einzelpreis ein: ");
		preis = sc.nextDouble();
		
		warenwert = anzahl * preis;
		
		if (warenwert < 100) {
			rabattsatz = 10;
		}
		else if (warenwert < 500) {
			rabattsatz = 15;
		}
		else {
			rabattsatz = 20;
		}
		endpreis = warenwert - (warenwert*rabattsatz/100);
		
		System.out.printf("Der Endpreis beträgt %.2f", endpreis);
		sc.close();
	}

}
