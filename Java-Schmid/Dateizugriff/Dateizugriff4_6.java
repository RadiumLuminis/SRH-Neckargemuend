import java.io.File;
import java.io.IOException;

public class Dateizugriff4_6 {

	public static void main(String[] args) {
		
		File verzeichnisFile = new File("C:\\temp\\MeinVerzeichnis");
		if(!verzeichnisFile.exists()) {
			verzeichnisFile.mkdir();
		}
		File verzeichnisDateiFile = new File("C:\\\\temp\\\\MeinVerzeichnis\\MeineDatei.txt");
		if (!verzeichnisDateiFile.exists()) {
			try {
				verzeichnisDateiFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Dateigröße: " +verzeichnisDateiFile.length());
		System.out.println("Schreibgeschützt: "+!verzeichnisDateiFile.canWrite());

	}

}
