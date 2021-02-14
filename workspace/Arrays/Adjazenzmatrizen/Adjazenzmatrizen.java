import java.util.Arrays;

public class Adjazenzmatrizen {																				//Wichtig:Die Anzahl der Elemente des ersten Arrays müssen
																											//mit der Spaltenbreite des zweiten Arrays kompatibel sein!
	public static void main(String[] args) {
		
		int [][] a = {{0, 0, 1, 1},{0, 0, 1, 0},{1, 1, 0, 0},{1, 0, 0, 0}};									//Erste Matrix
		int [][] b = {{0, 0, 1, 1},{0, 0, 1, 0},{1, 1, 0, 0},{1, 0, 0, 0}};									//Zweite Matrix
				
		int minl;																							//Ermitteln der kleineren Matrixlänge
		if (a.length > b[0].length)
			minl = b[0].length;
		else
			minl = a.length;
				
		
		for(int i = 0; i < b.length; i++) 																	//Ausgabe des 2ten Arrays, versetzt nach Falkschem Schema
		{
		System.out.println("\t\t" + Arrays.toString(b[i])); 
		}
		System.out.println("");
		
		int [][] c = new int[a.length][b[0].length];														//Anlegen der Produktmatrix, mit Zeilenlänge = Länge Array 1
																											//Und Spaltenbreite = Spaltenbreite des zweiten Arrays
		
		
		for(int i = 0; i < a.length; i++)																	//Komplizierte und zweifach verschachtelte Schleife
		{																									//Zählt über alle Zeilen des ersten Arrays
			for(int j = 0; j < b[0].length; j++)															//Zählt über alle Spalten des zweiten Arrays
			{
				for(int k = 0; k < minl; k++)																//Zählt bis zur kleineren Matrixlänge
				{
				
				c[i][j] += a[i][k]*b[k][j];																	//Multipliziert für die Zelle (i, j) die Werte der beiden
																											//Eingabematrizen und schreibt Sie in dieselbe Zelle
				}
			}
			
		}
		
		for(int i = 0; i < a.length; i++) 
		{
		System.out.println(Arrays.toString(a[i]) + "\t" + Arrays.toString(c[i])); 							//Ausgabe des 1ten Arrays, versetzt nach Falkschem Schema
		}																									//Und Ausgabe der Produktmatrix
		
	}

}
