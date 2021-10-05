
public class Caesar {
	
	public static char plusDrei(char a) {
		
		a += 3;
		return(a);
	}

	public static void main(String[] args) {
		
		char x = 'A';
		 System.out.printf("Aus dem Buchstaben %c wird ein %c", x, plusDrei(x));

	}

}
