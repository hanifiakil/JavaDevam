package day12_;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		// kullanýcýdan e mail adresini girmesini isteyin
		//mail @gmail.com içermiyorsa "lütfen gmail adresi giriniz"
		//@gmail.com ile bitiyorsa "email adresiniz kaydedildi"
		//@gmail.com ile bitmiyorsa "lütfen yazýmý kontrol edin" yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lütfen mail adresinizi giriniz : ");
		
		String email=scan.next();
		
		if(!email.contains("@gmail.com")) {System.out.println("lütfen gmail adresi giriniz");
			
		}else if(email.indexOf("@gmail.com")== email.length()-10){
			System.out.println("email adresiniz kaydedildi");
			
			
		}else {System.out.println("lütfen yazýmý kontrol edin");}
		scan.close();
		
	}

}
