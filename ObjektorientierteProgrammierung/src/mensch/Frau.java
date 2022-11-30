package mensch;

public class Frau extends Mensch {

	private boolean schwanger;
	
	public Frau()  {
		super();
		schwanger = false;
	}
	
	public Frau(String name, int alter, String wohnort, boolean schwanger) {
		super(name, alter, wohnort);
		this.schwanger = schwanger;
	}

	public boolean isSchwanger() {
		return schwanger;
	}

	public void setSchwanger(boolean schwanger) {
		this.schwanger = schwanger;
	}
	
	@Override
	public void wasBinIch() {
		super.wasBinIch();
		System.out.println("Ich bin eine Frau");
	}
	
}
