
public class Matrizenaddition {

	public static void main(String[] args) {

		int a[][] = { { 4, 1, 2 }, { 2, 3, 5 }, { 3, 8, 4 } };		//Anlegen der beiden Matrizen
		int b[][] = { { -3, 2, 0 }, { 2, -1, 0 }, { 1, -2, 1 } };

		System.out.println("Erste Matrix:");						
		
		for(int y = 0; y < a.length; y++)							//Äußere Schleife, läuft über jede Zeile der Matrix ("vertikal")
		{
			for(int x = 0; x < a[0].length; x++)					//Innere Schleife, läuft über jede Spalte der Matrx	("horizontal")
			{
				System.out.print(a[y][x] + " ");					//Ausgabe der Zelle in Zeile x und Spalte y mit Leerzeichen
			}
			System.out.println();									//Zeilenumbruch am Ende jeder Zeile
		}
		
		System.out.println("\nZweite Matrix:");
		
		for(int y = 0; y < b.length; y++)							//Uuuuuund nochmal
		{
			for(int x = 0; x < b[0].length; x++)
			{
				System.out.print(b[y][x] + " ");
			}
			System.out.println();
		}
		
		int [][] c = new int [a.length][a[0].length];				//Anlegen der Ergebnismatrix, hat gleiche Zeilen und Spaltenanzahl wie die vorhergehenden Matrizen
		
		System.out.println("\nErgebnismatrix:");
		
		for(int y = 0; y < c.length; y++)							//Uuuuuund nochmal
		{
			for(int x = 0; x < c[0].length; x++)
			{
				c[y][x] = a[y][x] + b[y][x];						//Aber diesmal wird dies auch gleich zum Initialisieren der Matrix genutzt
				System.out.print(c[y][x] + " ");					//Jede Zelle der Ergebnismatrix ergibt sich aus der Zelle in Matrix a plus die Zelle in Matrix b
			}
			System.out.println();
		}
	}

}
