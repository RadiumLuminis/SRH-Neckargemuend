import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Dateizugriff4_Y {

	public static void main(String[] args) {
		
		File BeispielFileOut = new File("c:\\temp\\BeispielFileOut.txt");
		if(!BeispielFileOut.exists()) {
			try {
				BeispielFileOut.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// FileWriter-Objekt anlegen (Pfad direkt angeben)
		FileWriter writer;
		try {
			writer = new FileWriter("c:\\temp\\BeispielFileOut.txt");
			// BufferedWriter-Objekt anlegen
			BufferedWriter buffWriter = new BufferedWriter(writer);
			// Strings mit dem bufferedWriter schreiben
			buffWriter.write("Meine Name ist Mustermann");
			buffWriter.newLine();
			buffWriter.write("Ich wohne in der Musterstraﬂe 5");
			buffWriter.newLine();
			buffWriter.write("Mein Wohnort ist Musterstadt");
			buffWriter.newLine();
			// Char mit dem bufferedWriter schreiben
			buffWriter.write('A');
			buffWriter.newLine();
			// Int mit dem bufferedWriter schreiben
			buffWriter.write(123);
			// Buffer leeren / Daten schreiben
			buffWriter.flush();
			buffWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
