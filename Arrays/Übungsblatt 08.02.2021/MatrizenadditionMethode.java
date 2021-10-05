
public class MatrizenadditionMethode {

	public static void main(String[] args) {
		
		int a[][] = { { 4, 1, 2 }, { 2, 3, 5 }, { 3, 8, 4 } };		//Anlegen der beiden Matrizen
		int b[][] = { { -3, 2, 0 }, { 2, -1, 0 }, { 1, -2, 1 } };

		System.out.println("Erste Matrix:");		//------------------------------------------------------------------------------------------------------------------						
		
		for(int y = 0; y < a.length; y++)							//Äußere Schleife, läuft über jede Zeile der Matrix ("vertikal")
		{
			for(int x = 0; x < a[0].length; x++)					//Innere Schleife, läuft über jede Spalte der Matrx	("horizontal")
			{
				System.out.print(a[y][x] + " ");					//Ausgabe der Zelle in Zeile x und Spalte y mit Leerzeichen
			}
			System.out.println();									//Zeilenumbruch am Ende jeder Zeile
		}
		
		System.out.println("\nZweite Matrix:");		//------------------------------------------------------------------------------------------------------------------
		
		for(int y = 0; y < b.length; y++)							//Mitlerweile solltet ihrs wissen ;)
		{
			for(int x = 0; x < b[0].length; x++)
			{
				System.out.print(b[y][x] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nErgebnismatrix:");	//------------------------------------------------------------------------------------------------------------------
		
		int [][] c = addMatrix(a, b);								//Hier benutzten wir unsere eigens angelegte Methode "addMatrix", um das Addieren auslagern zu können
		
		for(int y = 0; y < c.length; y++)							//Und eine Ausgabe der Ergebnismatrix nach bekanntem Schema
		{
			for(int x = 0; x < c[0].length; x++)
			{
				System.out.print(c[y][x] + " ");
			}
			System.out.println();
		}

	}

	
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------
	

	public static int[][] addMatrix(int[][] a, int[][] b) {			//Anlegen der Methode "addMatrix", nimmt zwei Matrizen als Argumente und gibt eine Matrix zurück
		
		int[][] c = new int[a.length][a[0].length];					//Anlegen der Ergebnismatrix


		for(int y = 0; y < c.length; y++)							//Selber Prozess wie bei der regulären Maztrizenaddition, zwei Schleifen, um jede Zelle einmal zu erreichen							
		{
			for(int x = 0; x < c[0].length; x++)
			{
				c[y][x] = a[y][x] + b[y][x];						//Das Ergebnis jeder Zelle ist die Zelle der ersten Matrix plus die Zelle der zweiten Matrix
				
			}
		}
		
		return c;													//Nach der Addition wird die Ergebnismatrix von der Methode zurückgegeben
	}

}
