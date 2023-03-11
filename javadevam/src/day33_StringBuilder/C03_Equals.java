package day33_StringBuilder;

public class C03_Equals {

	public static void main(String[] args) {
	
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");
		
		System.out.println(sb1==sb2);// false
		
		System.out.println(sb1.equals(sb2));//false
		//sb da equals method u String deki mant�kla �al��maz, == mant��� ile �al���r
		
		System.out.println(sb1.compareTo(sb2));//0
		/*ilk harflerden ba�layarak bire bir sb lar� kar��la�t�r�r
		 * e�er t�m karakterler ayn� ise sonu� olarak 0 d�ner
		 * farkl� karakterler bulursa  ilk yaz�lan sb ikinci yaz�landan ka� char �nde onu d�ner
		 * e�er iki sb in e�it olup olmad���n� anlamak istersek
		 * if (sb1.compareTo(sb2)==0) ile bakabiliriz
		 */

	}

}
