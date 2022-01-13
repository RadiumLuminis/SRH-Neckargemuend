import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		System.out.println("Bitte geben Sie eine Zahl ein");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		switch (a) {
		case 1: 
			System.out.println("Es wurde eine 1 eingegeben");
			break;
		case 2: 
			System.out.println("Es wurde eine 2 eingegeben");
			break;
		case 3: 
			System.out.println("Es wurde eine 3 eingegeben");
			break;
		case 4: 
			System.out.println("Es wurde eine 4 eingegeben");
			break;
		default:
			System.out.println("Fehlerhafte Eingabe");
		}
		s.close();
	}

}
