import java.util.Scanner;

public class For2_27b {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Bitte Startwert der Schleife eingeben: ");
		int start = s.nextInt();
		System.out.print("Bitte Endwert der Schleife eingeben: ");
		int end = s.nextInt();
		if (start < end) {
			int temp = start;
			start = end;
			end = temp;
		}
		if (start == end) {
			System.out.println("Start und Endwert sind gleich. kein Schleifendurchlauf!");
		}
		
		for (int i = start; start < end; i+=3) {
			System.out.println(i);
		}
		s.close();
		
	}

}
