package day19_whileloop_dowhileloop;

public class C03_doWhileloop {

	public static void main(String[] args) {

		int i=0;
		while(i<5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		/*while loop önce kontrol eder sonra kodu çalýþtýrýr
		 * loop içinde artýþ yaýlsa da bir sonraki kontrole kadar kod çalýþmaya devam eder
		 * bu da durumlarda hatalý sonuçlara ulaþmamýza sebep olabilir */
		
		/*do-while loop ise önce iþlemi yapar ve sonra þartý kontrol eder
		 * özellikle kullanýcýdan deðer almalarda do while loop tercih edilir */
		
		int a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<5);
		
		
	}

}
