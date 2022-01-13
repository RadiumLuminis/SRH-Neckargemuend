import java.util.Scanner;

public class Methoden2_57 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte die Länge der Seite a eingeben: ");
		int a = sc.nextInt();
		System.out.println("Bitte die Länge der Seite b eingeben: ");
		int b = sc.nextInt();
		System.out.println("Bitte die Länge der Seite c eingeben: ");
		int c = sc.nextInt();
		
		umfangBerechnen(a, b, c);
		sc.close();
	}
	
	public static void umfangBerechnen(int a, int b, int c) {
		int erg = a + b + c;
		if (a+b > c) {
			if (a+c > b) {
				if (b+c > a) {
					System.out.println("Der Umfang lautet: " +erg);
					return;
				}
			}
		}
		System.out.println("Kein gültiges Dreieck!");
	}

}