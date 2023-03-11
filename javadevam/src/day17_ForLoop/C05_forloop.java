package day17_ForLoop;

import java.util.Scanner;

public class C05_forloop {

	public static void main(String[] args) {
		// kullanýcýdan iki sayý isteyiniz. girilen sayýlar ve aralarýndaki
		//tüm sayýlarý toplayýp sonucu yazdýran bir proðram yazýnýz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen iki tam sayý giriniz \n ikinci tam sayý için enter e basýnýz");
		
		int sayý1=scan.nextInt();
		int sayý2=scan.nextInt();
		
		int küçük=0;
		int büyük=0;
		
		if (sayý1>sayý2) {
			küçük=sayý2;
			büyük=sayý1;
			
		} else {
			küçük=sayý1;
			büyük=sayý2;
		}
		
		int toplam=0;
		
		
		for (int i = küçük; i <=büyük; i++) {
			toplam+=i;	
		}
		
		System.out.println("girilen sayýlarýn arasýnda bulunan sayýlar toplamý : " + toplam);

		scan.close();
	}

}
