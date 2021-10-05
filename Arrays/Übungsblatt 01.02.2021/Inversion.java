
public class Inversion {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		int[] newArray = new int[array.length];
		
		int a = 0;
		
		for (int i = array.length -1; i >= 0; i--)
		{
			newArray[a] = array[i];
			a++;			
		}
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(newArray[i]);
		}		

	}

}
