package day16_forLoop;

import java.util.Scanner;

public class C05_forloop {

	public static void main(String[] args) {
		// kullanýcýdan 100 den küçük bir sayý isteyin
		//1 den baþlayarak girilen sayýya kadar(sayý dahil) 3 ün katý olan sayýlarý yazdýrýn
		//negatif ve 100 den büyük sayý girilirse uyarýnýz
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("lütfen 100 den küçük bir sayý giriniz");
		
		double sayý=scan.nextDouble();
		int sayý2=(int) sayý;
		if (sayý<0) {System.out.println("negatif sayý giremezsiniz");
			
		} else {if (sayý>=100) {System.out.println("büyük sayý girdiniz");
			
		} else {if (sayý!=sayý2) {System.out.println("lütfen tam sayý giriniz");
			
		} else {for (int i = 1; i <=sayý; i++) {
			if (i%3==0) {System.out.print(i + " ");

		}}}}}scan.close();}}
