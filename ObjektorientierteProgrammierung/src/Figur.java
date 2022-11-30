
public class Figur {

	private String name;
	private int gesundheit;
	private boolean lebt;
	
	public Figur(String name) {
		this.name = name;
		gesundheit = 100;
		lebt = true;
	}
	
	public void getroffen(int stärke) {
		gesundheit -= stärke;
		if (gesundheit <= 0) {
			lebt = false;
		}
	}
	
	public void medizin(int anzahl) {
		if (gesundheit + anzahl <= 100) {
			gesundheit += anzahl;
		}
		else {
			gesundheit = 100;
		}		
	}
	
	public void sprechen(String text) {
		if(lebt)
		System.out.println(name + ": " +text);
	}
	
}
