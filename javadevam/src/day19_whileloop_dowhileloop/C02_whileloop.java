package day19_whileloop_dowhileloop;

import java.util.Scanner;

public class C02_whileloop {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý alýn ve rakamlar toplamýný yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen bölenlerini bulmak için bir tam sayý giriniz");
		int sayý=scan.nextInt();
		
		int rakamlartoplamý=0;
		int rakam=0;
		
		while (sayý>0) {
			rakam=sayý%10;
			rakamlartoplamý+=rakam;
			sayý/=10;
			
		}
System.out.println("girilen sayýnýn rakamlarý toplamý : " + rakamlartoplamý);

scan.close();
	}

}
