
public class Torwart extends Spieler {

	private int reaktion;
	
	public Torwart (String n, int a, String p, int e, int m, int t, int r) {
		super(n, a, p, e, m, t);
		reaktion = r;
	}

	public int getReaktion() {
		return reaktion;
	}

	public void setReaktion(int reaktion) {
		this.reaktion = reaktion;
	}
	
}
