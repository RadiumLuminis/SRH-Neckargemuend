package File_Klasse;

//Import File-Class
import java.io.File;

/*
* Autor: Axel Schmid
* Datum: 07.02.2020
* Name: Aufgabe_File_Klasse_01
*/

/*
Schreiben Sie ein Java-Programm das mit Hilfe der Java-Klasse „File“ eine Datei auf Ihrem analysiert:

a) Legen Sie auf Ihrem Rechner (mit dem Datei-Explorer) eine beliebige Datei an oder benutzen Sie eine Datei, die bereits auf Rechner existiert.

b) Analysieren Sie die ausgewählte Datei mit einem zu erstellenden Java-Programm. Das Programm soll die folgenden Informationen über die Datei ausgeben:

-> Den Namen der Datei (ohne den Pfad).
-> Das Verzeichnis in dem die Datei gespeichert ist.
-> Die Größe der Datei.
-> Die Information ob die Datei schreibgeschützt ist.
-> Die Information ob die Datei lesegeschützt ist.
-> Die Information ob die Datei ausführbar ist.
*/

public class Aufgabe_File_Klasse_01 
{
	public static void main(String[] args)
	{
		// Objekt der Klasse "File" anlegen
		File fileInfo = new File("c:\\Temp\\TestDatei.txt");
		
		// Name der Datei ausgeben
		System.out.println("Name: " + fileInfo.getName());
		
		// Verzeichnis der Datei ausgeben
		System.out.println("Verzeichnis: " + fileInfo.getParent());
		
		// Größe der Datei ausgeben
		System.out.println("Größe: " + fileInfo.length() + " Bytes");
		
		// Schreibstatus der Datei ausgeben
		System.out.println("Schreibgeschützt: " + !fileInfo.canWrite());
		
		// Lesestatus der Datei ausgeben
		System.out.println("Lesegeschützt: " + !fileInfo.canRead());
		
		//  Datei ausführbar
		System.out.println("Ausführbar: " + fileInfo.canExecute());	
	}
}
