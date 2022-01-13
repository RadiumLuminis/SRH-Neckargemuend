import java.io.File;
import java.io.IOException;

public class Dateizugriff4_7 {

	public static void main(String[] args) {
		
		File plattensammlung = new File("C:\\temp\\Plattensammlung");
		if(!plattensammlung.exists() || !plattensammlung.isDirectory()) {
			plattensammlung.mkdir();
			System.out.println("Verzeichnis wurde angelegt!");
		} else {
			System.out.println("Verzeichnis existiert bereits!");
		}
		for( int i = 1; i <= 3; i++) {
			File albumFile = new File("C:\\temp\\Plattensammlung\\album" +i +".txt");
			if(!albumFile.exists()) {
				try {
					albumFile.createNewFile();
					System.out.println("Datei " +albumFile.getName() +" wurde angelegt");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Datei " +albumFile.getName() +" existiert bereits");
			}
			System.out.println("Lesezugriff: " +!albumFile.canRead());
			System.out.println("Schreibzugriff: " +!albumFile.canWrite());
			System.out.println("Größe: " +albumFile.length() +" B");
		}

	}

}
