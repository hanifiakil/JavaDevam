package day13_stringManipulations;

import java.util.Scanner;

public class C05_Þifresorusu {

	public static void main(String[] args, String s) {
		//kullanýcýdan ismini, soyismini ve kredi kartý bilgisini isteyin ve 
		//aþagýdaki gibi yazdýrýn
		//isim-soyisim :  M***** B****
		//kart no : **** **** **** 1234
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("lütfen isminizi giriniz : ");
		
		String isim=scan.next();
		
		System.out.print("lütfen soyisminizi giriniz : ");
		
		String soyisim=scan.next();
		
		System.out.print("lütfen 16 karakterli kredi kartý numaranýzý giriniz : ");
		
		String kkNo=scan.next();
		
		String isimFormatý=isim.substring(0,1).toUpperCase()+isim.
				substring(1).replaceAll("\\w","*");
		
		String soyisimFormatý=soyisim.substring(0,1).toUpperCase()+
				soyisim.substring(1).replaceAll("\\w", "*");
		
		String kkno="**** **** **** "+kkNo.substring(12);
		
		System.out.println("isim-soyisim : " + isimFormatý + " " + soyisimFormatý 
				+"\\s" + "kart no : " + kkno);
		
		scan.close();
		
		
	
	}

}
