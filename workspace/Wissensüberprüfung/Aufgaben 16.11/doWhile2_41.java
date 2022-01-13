import java.util.Scanner;

public class doWhile2_41 {

	public static void main(String[] args) {
		
		int summe = 0;
		int temp = 0;
		Scanner s = new Scanner(System.in);

		do {
			System.out.print("Zahl eingeben: ");
			temp = s.nextInt();
			summe += temp;
		} while (temp != 0);
		
		System.out.println("Die Summe der Zahlen lautet: "+summe);
		s.close();
		
	}

}
