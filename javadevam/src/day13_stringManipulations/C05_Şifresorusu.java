package day13_stringManipulations;

import java.util.Scanner;

public class C05_�ifresorusu {

	public static void main(String[] args, String s) {
		//kullan�c�dan ismini, soyismini ve kredi kart� bilgisini isteyin ve 
		//a�ag�daki gibi yazd�r�n
		//isim-soyisim :  M***** B****
		//kart no : **** **** **** 1234
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("l�tfen isminizi giriniz : ");
		
		String isim=scan.next();
		
		System.out.print("l�tfen soyisminizi giriniz : ");
		
		String soyisim=scan.next();
		
		System.out.print("l�tfen 16 karakterli kredi kart� numaran�z� giriniz : ");
		
		String kkNo=scan.next();
		
		String isimFormat�=isim.substring(0,1).toUpperCase()+isim.
				substring(1).replaceAll("\\w","*");
		
		String soyisimFormat�=soyisim.substring(0,1).toUpperCase()+
				soyisim.substring(1).replaceAll("\\w", "*");
		
		String kkno="**** **** **** "+kkNo.substring(12);
		
		System.out.println("isim-soyisim : " + isimFormat� + " " + soyisimFormat� 
				+"\\s" + "kart no : " + kkno);
		
		scan.close();
		
		
	
	}

}
