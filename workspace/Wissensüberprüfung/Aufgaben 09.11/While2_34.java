
public class While2_34 {

	public static void main(String[] args) {
		
		int s = 0;
		
		while(s < 10) {
			System.out.println("Hallo");
			s++;
		}
		
		while(s > 0) {
			System.out.print(11 - s +" ");
			s--;
		}
		System.out.println();

		while(s < 10) {
			System.out.print(s + 1 +" Hallo ");
			s++;
		}
		System.out.println();
		
		while(s > 1) {
			System.out.print(s -2 +" ");
			s--;
		}
	}

}
