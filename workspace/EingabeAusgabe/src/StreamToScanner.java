import java.util.Scanner;

public class StreamToScanner {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Wie alt sind Sie? ");
		int alter = s.nextInt();
		if (alter >= 18) {
			System.out.println("Viel Spaﬂ!");
		} else {
			System.out.println("Tut uns Leid, Eintritt erst ab 18.");
		}
		s.close();

	}
}
