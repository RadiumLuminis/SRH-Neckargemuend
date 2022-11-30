package maschinen;

public class TestMaschinen {

	public static void main(String[] args) {
		
		Rasenmaeher meinRasenmaeher = new Rasenmaeher();
		
		meinRasenmaeher.setPreis(990.90);
		meinRasenmaeher.setGewicht(26);
		meinRasenmaeher.setDrehzahl(1500);
		meinRasenmaeher.setSchnittbreite(45);
		
		meinRasenmaeher.zeigeInfos();

	}

}
