package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullan�c�dan ismini ve soyismini isteyin
		//iki farkl� metod olu�turun. metodlardan biri girilen kelimeleri 
		//ilk harf b�y�k, di�erleri k���k olacak �ekilde birle�tirsin.
		//ikinci method isim ve soyisim ilk harfleri b�y�k harf kalan harfler * olacak �ekilde birle�tirsin
		
		//kullan�c�ya isminin a��k olarak yaz�lmas� veya gizlenmesi tercihi sorun
		//ve pro�ram�n kalan k�sm�nda isim ve soyisim kullan�c�n�n istedi�i �ekilde kullan�n
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen isim ve soyisim giriniz \nisim yazd�ktan sonra enter e bas�n�z: ");
		
		String isim=scan.next();
		
		String soyisim=scan.next();
		
		System.out.print("l�tfen isim ve soyisminizin a��k yaz�lmas� i�in 1'e \\n"
				+ "kapal� yaz�lmas� i�in 2'ye bas�n�z: ");
		
		int tercih=scan.nextInt();
		
		String birle�mi�isim=null;
		
		switch(tercih) {
		
		case 1:birle�mi�isim=a��k�sim(isim,soyisim);
			break;
		case 2: birle�mi�isim=gizliisim(isim,soyisim);
		    break;
		default: System.out.println("l�tfen belirtilen rakamlardan birini t�hla day���...");
		}
		
		//bu sat�rdan itibaren kullan�c�n�n isim ve soyisim kullan�c�n�n tercihine g�re kaydedildi
		
		System.out.println("kullan�c�n�n tercihi : " + birle�mi�isim);
		 scan.close();

	}

	public static String gizliisim(String isim, String soyisim) {
		
	    isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		
		return isim+ " " +soyisim;
		
		
		
	}

	public static String a��k�sim(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim+ " "  +soyisim;	
	}

}
