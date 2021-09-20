import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedEingabe {

	public static void main(String[] args) throws IOException {
		
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Hier können Sie eine Zeile eingeben:");
		String erg = s.readLine();
		System.out.println(erg);
	}

}
