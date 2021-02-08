
public class Inversion02 {
	
	public static int[] reverse(int [] array) {
		
		int [] newArray = new int[array.length];
		int a = 0;		
		
		for (int i = array.length - 1; i >= 0; i--)
		{
			newArray[a] = array[i];
			a++;
		}
			
		return(newArray);
		
	}

	public static void main(String[] args) {
		
		int [] array = {1, 2, 3, 4, 5};
		
		array = reverse(array);
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
				
	}

}
