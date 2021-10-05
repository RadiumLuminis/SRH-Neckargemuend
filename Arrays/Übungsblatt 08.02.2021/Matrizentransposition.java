
public class Matrizentransposition {

	public static void main(String[] args) {
		
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };					//Anlegen der Orginalmatrix
		
		int at[][] = new int[a[0].length][a.length];				//Anlegen der Transponierten Matrix:
																	//Die Anzahl der Zeilen in a ist die Spaltenanzahl in at und umgekehrt
		
		System.out.println("Orginalmatrix");		//------------------------------------------------------------------------------------------------------------------

		for(int y = 0; y < a.length; y++)							//Äußere Schleife, läuft über jede Zeile der Matrix ("vertikal")
		{
			for(int x = 0; x < a[0].length; x++)					//Innere Schleife, läuft über jede Spalte der Matrx	("horizontal")
			{
				System.out.print(a[y][x] + " ");					//Ausgabe der Zelle in Zeile x und Spalte y mit Leerzeichen
			}
			System.out.println();									//Zeilenumbruch am Ende jeder Zeile
		}
		
		System.out.println("\nTransponierte Matrix");	//--------------------------------------------------------------------------------------------------------------

		for(int y = 0; y < at.length; y++)							
		{
			for(int x = 0; x < at[0].length; x++)					
			{
				at[y][x] = a[x][y];									//Transponieren ist einfach: wir vertauschen jede Spalte mit jeder Zeile und umgekehrt
				System.out.print(at[y][x] + " ");					
			}
			System.out.println();		
		}
		

	}

}
