package day19_whileloop_dowhileloop;

public class C04_doWhileLoop {

	public static void main(String[] args) {
		// "m" harfinden ba�lay�p "c" harfine kadar t�m harfleri yazd�r�n
		
		for (char i ='m'; i >'c'; i--) {
			System.out.print(i + " ");
		}System.out.println();
		
		char harf='m';
		while (harf>'c') {System.out.print(harf + " ");
		harf--;
		}System.out.println();
		char harf2='m';
		do {System.out.print(harf2 + " ");
		harf2--;
		} while (harf2>'c');
		
		
		

	}

}
