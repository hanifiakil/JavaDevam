package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullanýcýdan ismini ve soyismini isteyin
		//iki farklý metod oluþturun. metodlardan biri girilen kelimeleri 
		//ilk harf büyük, diðerleri küçük olacak þekilde birleþtirsin.
		//ikinci method isim ve soyisim ilk harfleri büyük harf kalan harfler * olacak þekilde birleþtirsin
		
		//kullanýcýya isminin açýk olarak yazýlmasý veya gizlenmesi tercihi sorun
		//ve proðramýn kalan kýsmýnda isim ve soyisim kullanýcýnýn istediði þekilde kullanýn
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen isim ve soyisim giriniz \nisim yazdýktan sonra enter e basýnýz: ");
		
		String isim=scan.next();
		
		String soyisim=scan.next();
		
		System.out.print("lütfen isim ve soyisminizin açýk yazýlmasý için 1'e \\n"
				+ "kapalý yazýlmasý için 2'ye basýnýz: ");
		
		int tercih=scan.nextInt();
		
		String birleþmiþisim=null;
		
		switch(tercih) {
		
		case 1:birleþmiþisim=açýkÝsim(isim,soyisim);
			break;
		case 2: birleþmiþisim=gizliisim(isim,soyisim);
		    break;
		default: System.out.println("lütfen belirtilen rakamlardan birini týhla dayýýý...");
		}
		
		//bu satýrdan itibaren kullanýcýnýn isim ve soyisim kullanýcýnýn tercihine göre kaydedildi
		
		System.out.println("kullanýcýnýn tercihi : " + birleþmiþisim);
		 scan.close();

	}

	public static String gizliisim(String isim, String soyisim) {
		
	    isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		
		return isim+ " " +soyisim;
		
		
		
	}

	public static String açýkÝsim(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim+ " "  +soyisim;	
	}

}
