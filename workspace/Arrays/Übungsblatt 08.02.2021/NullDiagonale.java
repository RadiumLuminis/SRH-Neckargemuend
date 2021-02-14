
public class NullDiagonale {

	public static void main(String[] args) {
		
		int a[][] = { { 1, 2, 3, 7 }, { 8, 4, 5, 6 }, { 2, 7, 8, 1 }, { 3, 6, 1, 9 } };			//Orginalmatrix
		
		int a0[][] = new int[a.length][a[0].length];											//Anlegen der Matrix mit Nulldiagonale
		
		System.out.println("Originalmatrix:");		//------------------------------------------------------------------------------------------------------------------
		
		for(int y = 0; y < a.length; y++)														//Die Ausgabe sollte man mittlerweile hinbekommen			
		{
			for(int x = 0; x < a[0].length; x++)					
			{
				System.out.print(a[y][x] + " ");					
			}
			System.out.println();									
		}

		System.out.println("\nMatrix mit Nulldiagonale:");	//----------------------------------------------------------------------------------------------------------
		
		for(int y = 0; y < a.length; y++)														//Die Schleife bleibt gleich			
		{
			for(int x = 0; x < a[0].length; x++)					
			{
				if(x==y)																		//Wenn die Zelle auf der Hauptdiagonale liegt (etwa [0][0], [1][1] etc.):
				{
					a0[y][x] = 0;																	//Dann Schreibe in die Zelle eine Null
				}
				else 																			//Ansonsten:
				{
					a0[y][x] = a[y][x];																//Schreibe den gleichen Wert wie in der Orginalmatrix
				}
				
				System.out.print(a0[y][x] + " ");					
			}
			System.out.println();									
		}
		
	}

}
