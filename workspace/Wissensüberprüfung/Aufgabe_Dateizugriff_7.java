package Dateizugriff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Autor: Axel Schmid
 * Datum: 24.10.2019
 * Name: Aufgabe_Dateizugriff_7
 */

public class Aufgabe_Dateizugriff_7 
{
	public static void main(String[] args) throws IOException 
	{
		// FileReader-Objekt anlegen
		FileReader reader = new FileReader("c:\\Temp\\noten_01.txt");
		
		// BufferedReader-Objekt anlegen
		BufferedReader buffReader = new BufferedReader(reader);
		
		// Erste Zeile aus Datei lesen
		String line = buffReader.readLine();
		
		// Schleife bis alle Zeilen gelesen wurden
		while (line != null) 
		{
			// Steht in der Zeile eine Note?
			if(line.startsWith("Note:"))
			{
				// Nur die Note ausgeben, "Note: " wird abgeschnitten
				line = line.substring(6);
				// Ausgabe der Note in der Konsole
				System.out.print(line + " ");
			}
			
			// N‰chste Zeile lesen
			line = buffReader.readLine();
		}
		
		// Reader schlieﬂen
		buffReader.close();
	}
}
