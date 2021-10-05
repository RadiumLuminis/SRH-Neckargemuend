import java.util.Arrays;

public class ArraySortiert02 {

	public static void main(String[] args) {					
		
		int[] a3 = { 19, 1, 7, 3, 11, 2 };
		
		System.out.println("Unsortierte Ausgabe: ");
		System.out.println(Arrays.toString(a3));
		
		int Laenge = a3.length;
		
		for (int y = Laenge; y > 1; y--)						//SorttiertAlgorithmus per Bubblesort
		{
			for (int i = 0; i < y-1; i++)
			{
				if(a3[i] > a3[i+1])
				{
					int temp;									//Zwischenspeicher
					temp = a3[i];								//Folgend: Eingaben werden getauscht, wenn die zweite Größer ist
					a3[i] = a3[i+1];
					a3[i+1] = temp;					
				}
				
			}
						
		}
		
		System.out.println("Sortierte Ausgabe: ");
		System.out.println(Arrays.toString(a3));	
		
	}

}
