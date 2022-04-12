package File_Klasse;

//Import File-Class
import java.io.File;

/*
* Autor: Axel Schmid
* Datum: 07.02.2020
* Name: Aufgabe_File_Klasse_01
*/

/*
Schreiben Sie ein Java-Programm das mit Hilfe der Java-Klasse �File� eine Datei auf Ihrem analysiert:

a) Legen Sie auf Ihrem Rechner (mit dem Datei-Explorer) eine beliebige Datei an oder benutzen Sie eine Datei, die bereits auf Rechner existiert.

b) Analysieren Sie die ausgew�hlte Datei mit einem zu erstellenden Java-Programm. Das Programm soll die folgenden Informationen �ber die Datei ausgeben:

-> Den Namen der Datei (ohne den Pfad).
-> Das Verzeichnis in dem die Datei gespeichert ist.
-> Die Gr��e der Datei.
-> Die Information ob die Datei schreibgesch�tzt ist.
-> Die Information ob die Datei lesegesch�tzt ist.
-> Die Information ob die Datei ausf�hrbar ist.
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
		
		// Gr��e der Datei ausgeben
		System.out.println("Gr��e: " + fileInfo.length() + " Bytes");
		
		// Schreibstatus der Datei ausgeben
		System.out.println("Schreibgesch�tzt: " + !fileInfo.canWrite());
		
		// Lesestatus der Datei ausgeben
		System.out.println("Lesegesch�tzt: " + !fileInfo.canRead());
		
		//  Datei ausf�hrbar
		System.out.println("Ausf�hrbar: " + fileInfo.canExecute());	
	}
}
