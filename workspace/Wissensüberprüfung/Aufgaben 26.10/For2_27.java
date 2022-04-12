import java.util.Scanner;

public class For2_27 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Bitte Anzahl der Durchläufe eingeben: ");
		int k = s.nextInt();

		for(int i = 1; i <= k; i++) {
			System.out.println("Das geht...");
		}
		for(int i = 1; i <= k; i++) {
			System.out.println(i);
		}
		for(int i = 1; i <= k; i++) {
			System.out.println((i+3)*2);
		}
		for(int i = 1; i <= k; i++) {
			System.out.println(k - i+1);
		}
		s.close();
		
	}

}
