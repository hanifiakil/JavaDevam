package day17_ForLoop;

public class C07_nestedForLoop {

	public static void main(String[] args) {
	//1 den 4 e kadar say�lar� yan yana aralar�nda bir bo�luk b�rakarak yazd�r�n
		
		
		
		for (int sat�r = 1; sat�r <=6; sat�r++) {
			for (int i = 1; i <=4; i++) {System.out.print(sat�r*i + " ");
			
		}//i� i�e girilen for loop larda s�ra ile yazma ger�ekle�ir
			System.out.println("");//ilk for loop bir tur att�ktan sonra alt sat�ra ge�mesi i�in
		}

	}

}
