import java.io.IOException;

public class ASCIIEIngabe {

	public static void main(String[] args) throws IOException {
		
		int zeichen = 0;
		System.out.println("Das Prorgamm gibt zu einem eingegebenem Zeichen den ASCII-Wert aus. Geben Sie ein Zeichen ein:");
		
		zeichen = System.in.read();
		
		System.out.println("Der ASCII-Wert: " +zeichen);
		System.out.println("Das Zeichen: " +(char) zeichen);
	}

}
