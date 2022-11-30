package mensch;

public class Mann extends Mensch {
	
	private boolean barttraeger;
	
	public Mann()  {
		super();
		barttraeger = false;
	}
	
	public Mann(String name, int alter, String wohnort, boolean barttraeger) {
		super(name, alter, wohnort);
		this.barttraeger = barttraeger;
	}

	public boolean isBarttraeger() {
		return barttraeger;
	}

	public void setBarttraeger(boolean barttraeger) {
		this.barttraeger = barttraeger;
	}
	
	@Override
	public void wasBinIch() {
		super.wasBinIch();
		System.out.println("Ich bin ein Mann");
	}

}
