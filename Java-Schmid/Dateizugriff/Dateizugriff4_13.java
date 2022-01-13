import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dateizugriff4_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		File notenFile = new File("c:\\temp\\Noten");
		if (!notenFile.exists() || !notenFile.isDirectory()) {
			try {
				notenFile.mkdir();				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		File noten = new File("c:\\temp\\Noten\\noten.txt");
		if (!noten.exists()) {
			try {
				noten.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		double sum = 0;
		int anzahl = 0;
		System.out.println("Bitte geben Sie eine Note ein (Beenden mit Eingabe 0): ");
		double notenEingabe = sc.nextDouble();
		
		FileWriter writer;
		try {
			writer = new FileWriter(noten);
			BufferedWriter bWriter = new BufferedWriter(writer);
			while(notenEingabe != 0) {
				sum += notenEingabe;
				anzahl++;
				bWriter.write("Note: " +notenEingabe);
				bWriter.newLine();
				System.out.println("Note: ");
				notenEingabe = sc.nextDouble();
			}
			bWriter.flush();
			bWriter.close();
			writer.close();
			System.out.println("Der Notendurschnitt lautet: " +String.format("%.2f", (sum / anzahl)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();

	}

}
