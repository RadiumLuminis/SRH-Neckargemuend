package TestMaschinen;

import rasenm�her.Rasenm�her;

public class TestMaschinen {

	public static void main(String[] args) {
		
		Rasenm�her rasenmaeher1 = new Rasenm�her();
		
		rasenmaeher1.setPreis(990.90);
		rasenmaeher1.setGewicht(26);
		rasenmaeher1.setDrehzahl(1500);
		rasenmaeher1.setSchnittbreite(45);

		rasenmaeher1.zeigeInfos();
		
		Rasenm�her rasenmaeher2= new Rasenm�her(12.2, 15.6, 2000, 60);
		Rasenm�her rasenmaeher3 = new Rasenm�her(130.99, 56.2, 3500, 90);
	
		rasenmaeher2.zeigeInfos();
		rasenmaeher3.zeigeInfos();
	}

}
