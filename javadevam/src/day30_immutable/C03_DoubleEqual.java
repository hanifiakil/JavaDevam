package day30_immutable;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		/*java da String iki t�rl� olu�turulabilir
		 * 1- non-primitive oldu�u i�in new keyword ile
		 * java �nce e�itli�in sa��na bakt���ndan
		 * new kelimesi oldu�u i�in �nce obje olu�turulur
		 * sonra de�er atar
		 * yani bu olu�turma �eklinde her zaman
		 * yeni bir obje olu�ur
		 * 
		 * 2-bug�ne kadar ��rendi�imiz gibi olu�turursak
		 * String str2="mustafa"
		 * java bu durumda e�itli�in sa��nda olan
		 * String in STR�NG HAVUZU nda olup olmad���n�
		 * kontrol eder ve havuzda varsa
		 * yeni obje olu�turmaz, �ncekinin referans�na
		 * yeninin referans�n� da ekler
		 */
		
		String str1="mustafa";
		String str2="mustafa";
		String str3=new String("mustafa");
		String str4 =new String("mustafa");
		
		System.out.println(str1==str3);//false
		System.out.println(str1.equals(str3));//true
		System.out.println(str4==str3);//false
		System.out.println(str4.equals(str3));//true
		
		
		System.out.println(str1==str2);//TRUE
		

	}

}
