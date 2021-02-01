
public class SummeUndDurchschnitt {

	public static void main(String[] args) {
		
		int [] temp = {18, 12, 24, 26, 23, 22, 20};
		
		int Summe = 0;
		double Durchschnitt = 0;
		
		for (int i = 0; i < temp.length; i++)
		{
			Summe += temp[i];
		}
		
		Durchschnitt = (double) Summe / temp.length;
		
		System.out.println("Summe der Temperaturen: ");
		System.out.println(Summe);
		System.out.println("Durchschnitt der Temperaturen: ");
		System.out.printf("%.2f", Durchschnitt);
				
	}

}
