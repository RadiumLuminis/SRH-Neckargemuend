
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class ID3Tagauslesen {

	public static void MP3_Analyse(String Dateipfad) {

		File file = new File(Dateipfad);								//File-Variable erstellen, ist nicht unbedingt notwendig
		
		try (FileInputStream fis = new FileInputStream(file)) {			//Da der Compiler nicht weiﬂ, ob der Pfad existiert, muss das Programm als try {} Anweisung geschrieben werden
			
			System.out.println("MP3-Datei:");
			
			long groesseInByte = fis.available();						//Festlegen der Orginalgroesse

			// Datensatzzeiger positionieren
			fis.skip(groesseInByte - 128);
			System.out.println("No. of bytes remaining to read after skipping:\t" + fis.available());

			byte[] tag = new byte[3], titel = new byte[30], interpret = new byte[30], cdtitel = new byte[30], jahr = new byte[4], kommentar = new byte[30];
			byte genre;
			
			fis.read(tag, 0, 3);										//Auslesen des MP3-ID-Tags und erstellen eines Strings mit den entsprechenden zeichen
			String strTag = new String(tag);
			
			fis.read(titel, 0, 30);										//Auslesen des Titels und erstellen eines Strings mit den entsprechenden zeichen
			String strTitel = new String(titel);
			
			System.out.println("No. of bytes remaining to read after skipping:\t" + fis.available());
			
			fis.read(interpret, 0, 30);									//Auslesen des Interpreten und erstellen eines Strings mit den entsprechenden zeichen
			String strInterpret = new String(interpret);
			
			fis.read(cdtitel, 0, 30);									//Auslesen des Albumtitels und erstellen eines Strings mit den entsprechenden zeichen
			String strCdtitel = new String(cdtitel);
			
			fis.read(jahr, 0, 4);										//Auslesen des Jahres und erstellen eines Strings mit den entsprechenden zeichen
			String strJahr = new String(jahr);
			
			fis.read(kommentar, 0, 30);									//Auslesen eines eventuellen Kommentares und erstellen eines Strings mit den entsprechenden zeichen
			String strKommentar = new String(kommentar);
			
			genre = (byte)fis.read();									//Auslesen der Genre-Nummer
			
			System.out.println("Total file size to read (in bytes) :\t\t" +groesseInByte);
			
			System.out.println("Tag:\t\t\t\t\t\t" +strTag);
			
			System.out.println("Titel:\t\t\t\t\t\t" +strTitel);
			
			System.out.println("Interpret:\t\t\t\t\t" +strInterpret);
			
			System.out.println("Album:\t\t\t\t\t\t" +strCdtitel);
			
			System.out.println("Jahr:\t\t\t\t\t\t" +strJahr);
			
			System.out.println("Kommentar:\t\t\t\t\t\t" +strKommentar);
			
			System.out.println("Genre:\t\t\t\t\t\t" +genre);			//Ausgabe der Werte, Formatiert
			

		} catch (IOException e) {										//Schlieﬂen der try {} Anweisung, falls keine Datei gefunden wird = I=Exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		String Dateipfad = new String("C:\\Users\\svenk\\Documents\\GitHub\\SRH-Neckargemuend-Java\\Song6.mp3");
		
		MP3_Analyse(Dateipfad);
		
		
	}
	
	
	
}
