
public class Matrizenausgabe {

	public static void main(String[] args) {
		
		int[][] matrix  ={{10,20,30,40,50},								//Initialisieren der Matrx mit den Werten
                		  {15,25,35,45,55},
                		  {20,30,40,50,60},
                		  {25,35,45,55,65}};
		
		for(int y = 0; y < matrix.length; y++)							//Äußere Schleife, läuft über jede Zeile der Matrix ("vertikal")
		{
			for(int x = 0; x < matrix[0].length; x++)					//Innere Schleife, läuft über jede Spalte der Matrx	("horizontal")
			{
				System.out.print(matrix[y][x] + " ");					//Ausgabe der Zelle in Zeile x und Spalte y mit Leerzeichen
			}
			System.out.println();										//Zeilenumbruch am Ende jeder Zeile
		}

		System.out.println("Anzahl der Zeilen: " + matrix.length);		//Anzahl Zeilen gleich Arrays in der Matrix = Länge der Matrix
		System.out.println("Anzahl der Spalten: " + matrix[0].length);	//Anzahl Spalten gleich Elemente eines Arrays in der Matrix = Länge eines Arrays in der Matrix
		
		

	}

}
