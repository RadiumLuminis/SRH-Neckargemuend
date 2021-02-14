import java.util.Arrays;

public class Matrizenmultiplikation {

	public static void main(String[] args) {
		
		int [][] a = {{0, 0, 1, 1},{0, 0, 1, 0},{1, 1, 0, 0},{1, 0, 0, 0}};									//Erste Matrix
		int [][] b = {{0, 0, 1, 1},{0, 0, 1, 0},{1, 1, 0, 0},{1, 0, 0, 0}};									//Zweite Matrix
		
		System.out.println("Die Erste Matrix hat "+ a.length + " Zeilen und " +a[0].length +" Spalten");	//Zeilen und Spaltenausgabe der ursprüngliche Matrizen
		System.out.println("Die Zweit Matrix hat "+ b.length + " Zeilen und " +b[0].length +" Spalten\n");
		

		if (a.length == b.length || a.length == b[0].length || a[0].length == b.length || a[0].length == b[0].length)
		{
			if(a[0].length == b.length)																		//Die ganzen If-Abfragen sind Optional. Sie ermöglichen dem
			;																								// Programm, schon vor der Multiplikation zu prüfen, ob die
			else if(a.length == b.length)																	// Matrizen überhaupt Multipliziert werden könnnen und das
			{																								// Programm führt je nach Notwendigkeit die entsprechende
				a = Transponieren(a);																		// Transponier-Vorgang durch
			}
			else if(a[0].length == b[0].length)
			{
				b = Transponieren(b);
			}
			else
			{
				a = Transponieren(a);
				b = Transponieren(b);
			}
			MatrixMulti(a, b);																				//Erst hier werden die beiden Matrizen an meine Methode über-
		}																									// geben, die die Multiplikation durchführt
		else 
		{
			System.out.println("Matrizen nicht für Multiplikation geeignet");
		}
	}

	
	
	public static void MatrixMulti(int[][] a, int[][] b) {													//Ausgelagerte Methode, die Matrizen Multipliziert
		
		for(int i = 0; i < b.length; i++)
		{
		System.out.println("\t\t" + Arrays.toString(b[i])); 
		}
		System.out.println("");																				//Bis hier: Ausgabe des zweiten Arrays
		
		int [][] c = new int[a.length][b[0].length];														//Anlegen der Produktmatrix mit Zeilen von 1 und Spalten von 2
		
		for(int i = 0; i < a.length; i++)																	//Doppelt verschatelte Schleife, Produziert Endmatrix
		{																									//Zählt über alle Spalten des ersten Arrays
			for(int j = 0; j < b[0].length; j++)																//Zählt über alle Zeilen des zweiten Arrays
			{
				for(int k = 0; k < a[0].length; k++)														//Zählt bis zur gleichen Matrixlänge (Siehe vorheriges
				{																							// Transponieren) (Zeilen Matrix 1/Splaten Matrix 2)
				
				c[i][j] += a[i][k]*b[k][j];																	//Multipliziert für die Zelle (i, j) die Werte der beiden
																											//Eingabematrizen (Zeile mit Splate) und schreibt Sie 
				}																							// in dieselbe Zelle (der Produktmatrix)
			}
		}
		
		for(int i = 0; i < a.length; i++) 
		{
		System.out.println(Arrays.toString(a[i]) + "\t" + Arrays.toString(c[i])); 							//Ausgabe des ersten Arrays sowie Ausgabe der Produktmatrix
		}																									
		
	}

	
	
	public static int [][] Transponieren(int[][] matrix) {													//Ausgelagerte Methode, die Matrizen transponiert
		
		int [][] transponiert = new int[matrix[0].length][matrix.length];
		
		for(int y = 0; y < transponiert.length; y++)							
		{
			for(int x = 0; x < transponiert[0].length; x++)					
			{
				transponiert[y][x] = matrix[x][y];
			}
		}
				
		return transponiert;
	}

}
