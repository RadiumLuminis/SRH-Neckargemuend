import java.io.File;
import java.io.IOException;

public class Dateizugriff4_8 {

	public static void main(String[] args) {
		
		File steckBriefFile = new File("C:\\temp\\Steckbrief.txt");
		if(!steckBriefFile.exists()) {
			try {
				steckBriefFile.createNewFile();
				System.out.println("Datei Steckbrief wurde erfolgreich angelegt!");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Datei existiert bereits!");
		}

	}

}
