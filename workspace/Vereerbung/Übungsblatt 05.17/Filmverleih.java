
public class Filmverleih {
	
	public static void main(String[] args) {
		
		Film f0001 = new Film("Das Universum Teil 1");
		Film f0002 = new Film("Endspiel Fuﬂball EM 2016", 120);
		Film f0003 = new Film("Tagesthemen vom 12.07.2016", 30, false);
		Spielfilm sf0001 = new Spielfilm("Der weiﬂe Hai", 120, true, "Spielberg", "Horror");
		
		f0001.anzeigen();
		f0002.anzeigen();
		f0003.anzeigen();
		sf0001.anzeigen();
	}

}
