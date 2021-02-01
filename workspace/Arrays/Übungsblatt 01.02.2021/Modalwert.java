
public class Modalwert {
	
	public static double[] ModalwertBestimmen(double [] array)			//Funktion, die den Modalwert bestimmen soll
	{
		double modal = 0;											//Vorl�ufiger Modalwert, initialisiert mit kleinstem m�glichen Wert
		int modalWert = 0;											//Vorl�ufiges Vorkommen des Modalwertes
		
		for(int i = 0; i < array.length; i++)						//�u�ere Schleife, um das Array einmal zu durchlaufen und jedem Wert die Chance zu geben, Median zu werden
		{
			int z�hlwert = 0;										//Z�hlwert, initialisiert mit 0
			
			for(int a = 0; a < array.length; a++)					//Zweite Schleife, die z�hlt, wie oft ein Element vorkommt
			{			
				if(array[i] == array[a])
				{
					z�hlwert++;										//Jedes mal, wenn der Wert gefunden wird, erh�ht sich der Z�lwert
				}
				
			}
			
			if(modalWert < z�hlwert)								//Wenn nach dem Z�hlen der Z�hlwert h�her als der aktuelle Wert des Vorkommens des Modalwerts ist:
			{
				modalWert = z�hlwert;									//Dann wird das Vorkommen des Modalwerts auf den Z�hlwert gesetzt
				modal = array[i];										//und der Modalwert auf den aktuell gez�hlten Wert gesetzt
			}
						
		}
		
		double[] Ausgabe = {modal, modalWert};
				
		return Ausgabe;												//Dann gibt die Funktion ein kleines Array mit Modalwert und Vorkommen dessen zur�ck
	}

	
	
	
	public static void main(String [] args)									//main-Funktion Anfang
	{
		double Eingabe[] = {1 , 2, 3, 4, 5, 6, 7, 1, 3, 4, 6, 1, 2, 7, 1};	//Liste der Zahlen wird initialisiert
		
		double[] Ausgabe = ModalwertBestimmen(Eingabe);								//Neues Array "Ausgabe" nimmt den R�ckgabewert der Funktion Modalwert mit den Zahlen als Parameter an
		
		System.out.println("Der Modalwert der Eingabe lautet: ");			//Und dann Ausgabe der beiden Werte
		System.out.println(Ausgabe[0]);
		System.out.println("Der Modalwert kommt insgesamt " +(int) Ausgabe[1] +" Mal in den Werten vor");
				
	}
	
}
