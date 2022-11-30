package TestMaschinen;

import rasenmäher.Rasenmäher;

public class TestMaschinen {

	public static void main(String[] args) {
		
		Rasenmäher rasenmaeher1 = new Rasenmäher();
		
		rasenmaeher1.setPreis(990.90);
		rasenmaeher1.setGewicht(26);
		rasenmaeher1.setDrehzahl(1500);
		rasenmaeher1.setSchnittbreite(45);

		rasenmaeher1.zeigeInfos();
		
		Rasenmäher rasenmaeher2= new Rasenmäher(12.2, 15.6, 2000, 60);
		Rasenmäher rasenmaeher3 = new Rasenmäher(130.99, 56.2, 3500, 90);
	
		rasenmaeher2.zeigeInfos();
		rasenmaeher3.zeigeInfos();
	}

}
