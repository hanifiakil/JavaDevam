package day19_whileloop_dowhileloop;

import java.util.Scanner;

public class C02_whileloop {

	public static void main(String[] args) {
		// kullan�c�dan bir say� al�n ve rakamlar toplam�n� yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen b�lenlerini bulmak i�in bir tam say� giriniz");
		int say�=scan.nextInt();
		
		int rakamlartoplam�=0;
		int rakam=0;
		
		while (say�>0) {
			rakam=say�%10;
			rakamlartoplam�+=rakam;
			say�/=10;
			
		}
System.out.println("girilen say�n�n rakamlar� toplam� : " + rakamlartoplam�);

scan.close();
	}

}
