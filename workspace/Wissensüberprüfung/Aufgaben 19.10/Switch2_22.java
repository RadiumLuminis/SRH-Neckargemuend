import java.util.Scanner;

public class Switch2_22 {

	public static void main(String[] args) {
		
		System.out.println("Wochentag eingeben:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		switch (a) {
		case 1: case 2: case 3: case 4: case 5:
			System.out.println("Werktag (Montag - Freitag)");
			break;
		case 6: case 7:
			System.out.println("Wochenende (Samstag, Sonntag)");
			break;
		default:
			System.out.println("Fehlerhafte Eingabe");
		}
		s.close();
	}

}