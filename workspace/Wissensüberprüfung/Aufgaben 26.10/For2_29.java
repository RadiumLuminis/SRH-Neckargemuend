import java.util.Scanner;

public class For2_29 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Welche Fakult�t soll berechnet werden?");
		int k = s.nextInt();
		int erg = 1;
		
		for(int i = 2; i <= k; i++) {
			erg *= i;
		}
		System.out.println("Die Fakult�t von " +k +" ist " +erg);
		s.close();
	}

}
