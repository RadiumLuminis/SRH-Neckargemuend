
public class While2_37 {

	public static void main(String[] args) {
		
		int s = 1, k = 1;
		
		while(s <= 10) {
			k = 1;
			while(k <= 10) {
				System.out.print(s * k + "\t");
				k++;
			}
			s++;
		System.out.println();
			
		}

	}

}
