/*
Aufgabe:
Schreiben Sie ein Programm, das die Summe der Zahlen von 12 bis 26 bildet und verwenden Sie dazu die for-Schleife.
Anzeige/Darstellung:
0 + 12 ergibt: 12
12 + 13 ergibt: 25
25 + 14 ergibt: 39
39 + 15 ergibt: 54
54 + 16 ergibt: 70
70 + 17 ergibt: 87
87 + 18 ergibt: 105
105 + 19 ergibt: 124
124 + 20 ergibt: 144
144 + 21 ergibt: 165
165 + 22 ergibt: 187
187 + 23 ergibt: 210
210 + 24 ergibt: 234
234 + 25 ergibt: 259
259 + 26 ergibt: 285
*/
public class Übung3 {

	public static void main(String[] args) {
		
		int i, summe = 0;
		
		for (i = 12; i <= 26; i++) {
			
			System.out.print(summe +" + " +i);
			summe += i;
			System.out.println(" ergibt: " +summe);
			
		}

	}

}
