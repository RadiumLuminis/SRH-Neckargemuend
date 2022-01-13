import java.util.Scanner;

public class Scanner2 {

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Bitte einen String eingeben:");
		String a = s.nextLine();
		System.out.print("Bitte einen int-Wert eingeben:");
		int b = s.nextInt();
		System.out.print("Bitte einen double-Wert eingeben:");
		double c = s.nextDouble();
		System.out.println("String Wert: " +a +"\nInt-Wert: " +b +"\nDouble-Wert: " +c);
		s.close();
		
	}
}
