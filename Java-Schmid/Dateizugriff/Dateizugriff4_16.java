import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Dateizugriff4_16 {

	public static void main(String[] args) {
		
		File adressen = new File("C:\\temp\\Adressen");
		Scanner sc = new Scanner(System.in);
		
		if(!adressen.exists() || !adressen.isDirectory()) {
			adressen.mkdir();
			System.out.println("Verzeichnis wurde angelegt!");
		} else {
			System.out.println("Verzeichnis existiert bereits!");
		}
		System.out.print("Vorname: ");
		String vname = sc.nextLine();
		System.out.print("Nachname: ");
		String nname = sc.nextLine();
		System.out.print("Straﬂe: ");
		String stra = sc.nextLine();
		System.out.print("Hausnummer: ");
		String hnumber = sc.nextLine();
		System.out.print("PLZ: ");
		String plz = sc.nextLine();
		System.out.print("Ort: ");
		String ort = sc.nextLine();
		System.out.print("Telefon: ");
		String tele = sc.nextLine();
		
		System.out.println("Anzahl der Adressen: ");
		int anzahl = sc.nextInt();
		
		File adressentext = new File("C:\\temp\\Adressen\\adressen.txt");
		if (!adressentext.exists()) {
			try {
				adressentext.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		try {
			FileWriter writer = new FileWriter("C:\\temp\\Adressen\\adressen.txt");
			writer.write(vname +" " +nname +"\n");
			writer.write(stra +" " +hnumber +"\n");
			writer.write(plz +" " +ort +"\n");
			writer.write(tele +"\n");
			for (int i = 0; i < anzahl - 1; i++) {
				writer.write("\n-----------------------------\n\n");
				writer.write(vname +" " +nname +"\n");
				writer.write(stra +" " +hnumber +"\n");
				writer.write(plz +" " +ort +"\n");
				writer.write(tele +"\n");
			}
			
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader reader = new FileReader("C:\\temp\\Adressen\\adressen.txt");
			BufferedReader bReader = new BufferedReader(reader);
			
			// Erste Zeile aus Datei lesen
			String line = bReader.readLine();
			// Schleife l‰uft so lange bis alle Zeilen gelesen wurden
			while (line != null)
				{
				// Gelesene Zeile ausgeben
				System.out.println(line);
				// N‰chste Zeile lesen
				line = bReader.readLine();
				}
			bReader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
		
	}

}
