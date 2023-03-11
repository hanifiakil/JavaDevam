package day15_methodCreation;

import java.util.Scanner;

public class C02_methodCreation {

	public static void main(String[] args) {
		/* kullanýcýya kaç sayý toplamak istediðini sorun
		 * kullanýcý 2,3 veya 4 deðerini girerse
		 * kullanýcýdan bu sayýlarý girmesini isteyin ve bu sayýlarýn toplamýný yazdýrýn
		 * kullanýcý toplamak istediði sayý adedini 4 ten büyük girerse
		 * "çok sayý girdiniz, ben toplayamam" yazdýrýn. */
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("lütfen kaç sayý toplamak istediðinizi belirtin ...");
		
		int tercih =scan.nextInt();
		
		if(tercih>4) {
			tercih=5;
		}
		
		switch(tercih){
		case 2:ikisayýtopla();
		break;
		case 3:üçsayýtopla();
		break;
		case 4:dörtsayýtopla();
		break;
		case 5:System.out.println("çok sayý girdiniz ben toplayamam");
		break;
		default: System.out.println("geçersiz tercih");
	}	

		scan.close();
	}

	public static void dörtsayýtopla() {
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen dört sayý giriniz \nikinci sayý için enter e basýnýz "
				+ "n\"üçüncü sayý için enter e basýnýz \ndördüncü sayý için enter e basýnýz");
		
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		double sayý3=scan.nextDouble();
		double sayý4=scan.nextDouble();
		
		System.out.println("girdiðiniz sayýlarýn toplamý : " + (sayý1+sayý2+sayý3+sayý4));
		scan.close();
	}

	public static void üçsayýtopla() {
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen üç sayý giriniz \nikinci sayý için enter e basýnýz \n"
				+ "üçüncü sayý için enter e basýnýz");
		
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		double sayý3=scan.nextDouble();
		
		System.out.println("girdiðiniz sayýlarýn toplamý : " + (sayý1+sayý2+sayý3));
		scan.close();
	}

	public static void ikisayýtopla() {
		Scanner scan=new Scanner (System.in);
		System.out.println("lütfen iki sayý giriniz \nikinci sayý için enter e basýnýz");
		
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		
		System.out.println("girdiðiniz sayýlarýn toplamý : " + (sayý1+sayý2));
		scan.close();
		
	}

}
