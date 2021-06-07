
public class Flugzeug {
	
	private String hersteller;
	private String modell;
	private int maxspeed;
	private int position;
	
	public Flugzeug() {
		hersteller = "Boing";
		modell = "default";
		maxspeed = 900;
		position = 0;
	}
	
	public Flugzeug(String h, String m, int ms) {
		hersteller = h;
		modell = m;
		maxspeed = ms;
		position = 0;
	}
	
	public void distanzFlug(int hrs) {
	position += hrs * (maxspeed-50);
	}

	public int getPosition() {
		return position;
	}

	public String getHersteller() {
		return hersteller;
	}

	public String getModell() {
		return modell;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

}
