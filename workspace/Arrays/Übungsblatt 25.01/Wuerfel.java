
public class Wuerfel {

	public static void main(String[] args) {

		int wurf [] = new int[3];										//Ein Integer-Array anlegen, hat keine Werte aber die Größe 3
		for (int i = 0; i <3; i++)										//Schleife, die 3-Mal durchlaufen wird
		{
			wurf[i] = (int) (Math.random() * 100 + 1);					//Die Position [i] im angelegten Array bekommt bei jedem Durchlauf eine Zufälligen Wert
		}
		for (int i = 0; i < wurf.length; i++) 							//Nochmal eine gleiche Schleife (wurf.length = 3)
		{
		System.out.println(i+1 +"ter Wurf: " +wurf[i]);					//Gebe die Zahl an der jeweiligen Posotion aus
		}
		
	}

}
