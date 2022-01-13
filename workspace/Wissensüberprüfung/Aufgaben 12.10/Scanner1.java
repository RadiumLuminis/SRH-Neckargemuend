import java.util.*;

public class Scanner1 {

	public static void main (String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.print("Bitte einen int-Wert eingeben: ");
		a = s.nextInt();
		System.out.println("Der eingegebene Wert lautet: " +a);
		System.out.println("Der eingegebene Wert ist größer als 1000: " +(a>1000));
		s.close();
	}
}
