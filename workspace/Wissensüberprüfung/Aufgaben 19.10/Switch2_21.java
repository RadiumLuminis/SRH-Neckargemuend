import java.util.Scanner;

public class Switch2_21 {

	public static void main(String[] args) {
		
		System.out.println("Wochentag eingeben:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
			break;
		case 3:
			System.out.println("Mittwoch");
			break;
		case 4:
			System.out.println("Donnerstag");
			break;
		case 5:
			System.out.println("Freitag");
			break;
		case 6:
			System.out.println("Samstag");
			break;
		case 7:
			System.out.println("Sonntag");
			break;			
		default:
			System.out.println("Fehlerhafte Eingabe");
		}
		s.close();
	}

}