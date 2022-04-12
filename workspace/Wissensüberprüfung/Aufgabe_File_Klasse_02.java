package File_Klasse;

//Import File-Class and IOException class 
import java.io.File;
import java.io.IOException;

/*
* Autor: Axel Schmid
* Datum: 24.11.2019
* Name: Aufgabe_File_Klasse_02
*/

/*
* Schreiben Sie ein Java-Programm (Name des Programms TestFileClass), das mit 
* Hilfe der Java-Klasse �File� die folgenden Szenarien durchf�hrt:

a)Pr�fen Sie, ob auf Ihrem Rechner das Verzeichnis c:\MeinVerzeichnis 
vorhanden ist. Falls das Verzeichnis vorhanden ist geben Sie in der Konsole 
den folgenden Text aus: �Das Verzeichnis c:\Mein Verzeichnis ist vorhanden.� 
Falls das Verzeichnis nicht vorhanden ist, geben Sie den Text �Das Verzeichnis 
c:\Mein Verzeichnis ist nicht vorhanden.� aus und erstellen das Verzeichnis anschlie�end. 
�berpr�fen Sie im Datei-Explorer ob das Verzeichnis erstellt wurde 

b)Legen Sie anschlie�end mit Ihrem Programm im Verzeichnis c:\MeinVerzeichnis 
die Datei meineDatei.txt an. Pr�fen Sie zuvor, ob die Datei existiert. Falls 
sie schon existiert wird sie nicht angelegt Geben Sie anschlie�end die Gr��e 
der Datei und ob die Datei schreibgesch�tzt ist in der Konsole aus.

c)�ffnen Sie die erstellte Datei meineDatei.txt �ber den Datei-Explorer Ihres 
Betriebssystems. F�gen Sie Ihren Namen, Ihre Stra�e und Ihren Wohnort in die 
Datei ein und speichern Sie die Datei anschlie�end. Starten Sie Ihr Programm 
erneut und pr�fen Sie die Ausgabe der Dateigr��e.

*/

public class Aufgabe_File_Klasse_02 {

	public static void main(String[] args) throws IOException 
	{
		// Objekt der Klasse "File" anlegen
		File directoryInfo = new File("c:\\MeinVerzeichnis");
		
		// Pr�fen ob Verzeichnis schon existiert
		if(directoryInfo.exists())
		{
			// Verzeichnis ist vorhanden
			System.out.println("Das Verzeichnis " + directoryInfo.getAbsoluteFile() + " ist vorhanden" );
		}
		else 
		{			
			// Verzeichnis ist nicht vorhanden
			System.out.println("Das Verzeichnis " + directoryInfo.getAbsoluteFile() + " ist nicht vorhanden" );
			
			// Verzeichnis anlegen
			directoryInfo.mkdir();
		}
		
		// 2. Objekt der Klasse "File" anlegen
		File fileInfo = new File("c:\\MeinVerzeichnis\\meineDatei.txt");
		
		// Existiert die Datei bereits
		if(!fileInfo.exists())
		{
			// Datei wird angelegt
			fileInfo.createNewFile();
		}
		
		// Gr��e und Schreibschutz der Datei ausgeben
		System.out.println("Dateigr��e: " + fileInfo.length() + " Byte");
		
		if(fileInfo.canWrite())
		{
			System.out.println("Die Datei ist nicht schreibgesch�tz.");
		}
		else 
		{
			System.out.println("Die Datei ist schreibgesch�tz.");
		}
	}
}
