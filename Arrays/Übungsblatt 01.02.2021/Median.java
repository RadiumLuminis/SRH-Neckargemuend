import java.util.Arrays;

public class Median {

	public static void main(String[] args) {							//Median zu bestimmen ist einfacher als den Modalwert zu bestimmen
		
		double Eingabe[] = {1 , 2, 3, 4, 5, 6, 7, 1, 3, 4, 6, 1, 2, 7, 1};	//Liste der Zahlen wird initialisiert
		
		double median = 0;													//Vorläufiger Median anlegen
		double median2 = 0;													//Eventuellen Obermedian anlegen
		
		Arrays.sort(Eingabe);												//Nun sortieren wir die Liste der Zahlen
		//System.out.println(Arrays.toString(Eingabe));						
		//System.out.println((int)Eingabe.length / 2);						//Für mich selbst zum Decoden
		
		if(Eingabe.length%2 == 0)											//Nun überprüfen wir, ob die Länge der Liste grade oder ungrade ist
		{
			median = Eingabe[(int)Eingabe.length / 2 -1];						//Wenn die Zahlenliste eine grade Länge hat, dann gibt es zwei Medianwerte (keine Mitte vorhanden)
			median2 =  Eingabe[(int)Eingabe.length / 2];						//Wir wissen, das der Median genau die Hälfte ist, also Länge der Liste / 2 
			System.out.println("Der Ober- und Untermedian lauten: ");
			System.out.println(median +" "+ median2);
		}
		else																	//Wenn die Länge ungrade ist, gibt es nur einen Medianwert genau in der Mitte
		{
			median = Eingabe[(int)Eingabe.length / 2];							//Wir wissen, das der Median genau die Hälfte ist, also Länge der Liste / 2 
			System.out.println("Der Median lautet: ");
			System.out.println(median);
		}
		
	}

}
