import java.io.File;
import java.io.IOException;

public class Dateizugriff4_5 {

	public static void main(String[] args) {
	
		File steckBriefFile = new File("C:\\temp\\Steckbrief.txt");
		if(!steckBriefFile.exists()) {
			try {
				steckBriefFile.createNewFile();
				System.out.println("Datei Steckbrief wurde erfolgreich angelegt!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Datei existiert bereits!");
		}
		
		System.out.println("Verzeichnis: " +steckBriefFile.getParent() +"\\");
		System.out.println("Name: " +steckBriefFile.getName());
		System.out.println("Gr��e: " +steckBriefFile.length() +" B");
		System.out.println("Schreibgesch�tzt: " +!steckBriefFile.canWrite());
		System.out.println("Ausf�hrbar: " +!steckBriefFile.canExecute());
		
	}

}
