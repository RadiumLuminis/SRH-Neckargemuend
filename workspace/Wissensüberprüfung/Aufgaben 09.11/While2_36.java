
public class While2_36 {

	public static void main(String[] args) {
		
		int s = 0;
		
		while(true) {
			System.out.println(s+1);
			s++;
			if(s==10) {
				break;
			}
		}
		
		while(true) {
			System.out.println("Hallo Welt");
			s++;
			if(s==15) {
				break;
			}
		}

	}

}
