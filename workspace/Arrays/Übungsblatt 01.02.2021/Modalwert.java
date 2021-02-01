
public class Modalwert {
	
	public static double[] ModalwertBestimmen(double [] array)			//Funktion, die den Modalwert bestimmen soll
	{
		double modal = 0;											//Vorläufiger Modalwert, initialisiert mit kleinstem möglichen Wert
		int modalWert = 0;											//Vorläufiges Vorkommen des Modalwertes
		
		for(int i = 0; i < array.length; i++)						//Äußere Schleife, um das Array einmal zu durchlaufen und jedem Wert die Chance zu geben, Median zu werden
		{
			int zählwert = 0;										//Zählwert, initialisiert mit 0
			
			for(int a = 0; a < array.length; a++)					//Zweite Schleife, die zählt, wie oft ein Element vorkommt
			{			
				if(array[i] == array[a])
				{
					zählwert++;										//Jedes mal, wenn der Wert gefunden wird, erhöht sich der Zälwert
				}
				
			}
			
			if(modalWert < zählwert)								//Wenn nach dem Zählen der Zählwert höher als der aktuelle Wert des Vorkommens des Modalwerts ist:
			{
				modalWert = zählwert;									//Dann wird das Vorkommen des Modalwerts auf den Zählwert gesetzt
				modal = array[i];										//und der Modalwert auf den aktuell gezählten Wert gesetzt
			}
						
		}
		
		double[] Ausgabe = {modal, modalWert};
				
		return Ausgabe;												//Dann gibt die Funktion ein kleines Array mit Modalwert und Vorkommen dessen zurück
	}

	
	
	
	public static void main(String [] args)									//main-Funktion Anfang
	{
		double Eingabe[] = {1 , 2, 3, 4, 5, 6, 7, 1, 3, 4, 6, 1, 2, 7, 1};	//Liste der Zahlen wird initialisiert
		
		double[] Ausgabe = ModalwertBestimmen(Eingabe);								//Neues Array "Ausgabe" nimmt den Rückgabewert der Funktion Modalwert mit den Zahlen als Parameter an
		
		System.out.println("Der Modalwert der Eingabe lautet: ");			//Und dann Ausgabe der beiden Werte
		System.out.println(Ausgabe[0]);
		System.out.println("Der Modalwert kommt insgesamt " +(int) Ausgabe[1] +" Mal in den Werten vor");
				
	}
	
}
