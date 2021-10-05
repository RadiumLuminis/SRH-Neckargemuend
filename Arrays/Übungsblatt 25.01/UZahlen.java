
public class UZahlen {

	public static void main(String[] args) {
		
		int x[] = { 3, 1, 7, 15, 12, 21, 20, 17, 8, 11, 14 };					//Legt ein Array mit Integer-Variablean, jede Zahl in der geschweiften Klammer ist eine Indexnummer in Array
		System.out.println("Die ungeraden Zahlen lauten: ");
		for (int i = 0; i < x.length; i++)										//Schleife, die über jedes Element im Array einmal drüber läuft 
		{
			if (x[i]%2 == 1)													//Wenn die Zahl an der Position [i] im Array ungrade ist (%2 == 1) = ungrade
			{
				System.out.println(x[i]);										//dann gebe diese Positon im Array aus
			}	
			
		}

	}

}
