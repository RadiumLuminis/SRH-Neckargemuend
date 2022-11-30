package auto;

public class MercedesSLK extends Auto{

	private boolean dachGeoeffnet;
	
	public MercedesSLK() {
		dachGeoeffnet = false;
	}
	
	public void oeffneDach() {
		dachGeoeffnet = true;
	}
	
	public void schliesseDach() {
		dachGeoeffnet = false;
	}
	
	public boolean getDachGeoeffnet() {
		return dachGeoeffnet;
	}
}
