
public class Spieler extends Person {

	private String position;
	private int einsaetze;
	private int motivation;
	private int tore;
	
	public Spieler (String n, int a, String p, int e, int m, int t) {
		super(n, a);
		position = p;
		einsaetze = e;
		motivation = m;
		tore = t;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getEinsaetze() {
		return einsaetze;
	}
	public void setEinsaetze(int einsaetze) {
		this.einsaetze = einsaetze;
	}
	public int getMotivation() {
		return motivation;
	}
	public void setMotivation(int motivation) {
		this.motivation = motivation;
	}
	public int getTore() {
		return tore;
	}
	public void setTore(int tore) {
		this.tore = tore;
	}
}
