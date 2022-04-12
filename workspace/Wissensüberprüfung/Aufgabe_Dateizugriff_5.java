package Dateizugriff;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Autor: Axel Schmid
 * Datum: 24.10.2019
 * Name: Aufgabe_Dateizugriff_5
 */

public class Aufgabe_Dateizugriff_5 
{
	public static void main(String[] args) 
	{	
		try 
		{	
			// Scanner-Objekt zum Einlesen anlegen
			Scanner scanner = new Scanner(System.in);
			
			// Objekte zum Schreiben der Datei anlegen
			FileWriter fw = new FileWriter("c:\\Temp\\noten_01.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			// In dieser Variablen wird die eingegebene Note gespeichert
			double note = 1;
			
			// In dieser Variablen wird die Summe aller Noten gespeichert
			double summeNoten = 0;
			
			// In dieser Variablen wird die Anzahl der Noten gespeichert
			int anzahlNoten = 0;
			
			// Schleife l‰uft so lange bis eine 0 eingegeben wird			
			while (note != 0) 
			{
				// Eingabe der Note
				System.out.print("Note: ");
				note = scanner.nextDouble();
				
				// Wenn eine 0 eingegeben wurde ist Schluﬂ (0 wird nicht in die Datei geschrieben)
				if(note != 0)
				{
					// Note wird in Datei geschrieben
					bw.write("Note: " + note);
					bw.newLine();
					
					// Summe der bisher eingegebenen Noten
					summeNoten = summeNoten + note;
					
					// Anzahl der bisher eingegeben Noten
					anzahlNoten++;
				}
			}
			
			// Eingabe beendet, Scanner schlieﬂen
			scanner.close();
			
			// Durchschnitt berechnen
			double durchschnitt = summeNoten/anzahlNoten;
			
			// Errechneten Wert auf 2 Nachkommastellen formatieren
			String durchschnittFormatiert = String.format("%.2f", durchschnitt);
			
			// Errechneten Durchschnitt in Datei schreiben
			bw.write("Durchschnitt: " + durchschnittFormatiert);
			
			// flush() ist nicht zwingend notwendig
			//bw.flush();
			
			// Schreiben in Datei beendet, Writer schlieﬂen
			bw.close();	
		} 
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
	}
}
