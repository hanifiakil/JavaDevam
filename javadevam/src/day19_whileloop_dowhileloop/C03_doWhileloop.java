package day19_whileloop_dowhileloop;

public class C03_doWhileloop {

	public static void main(String[] args) {

		int i=0;
		while(i<5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		/*while loop �nce kontrol eder sonra kodu �al��t�r�r
		 * loop i�inde art�� ya�lsa da bir sonraki kontrole kadar kod �al��maya devam eder
		 * bu da durumlarda hatal� sonu�lara ula�mam�za sebep olabilir */
		
		/*do-while loop ise �nce i�lemi yapar ve sonra �art� kontrol eder
		 * �zellikle kullan�c�dan de�er almalarda do while loop tercih edilir */
		
		int a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<5);
		
		
	}

}
