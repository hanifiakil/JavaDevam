package day12_;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		// kullan�c�dan e mail adresini girmesini isteyin
		//mail @gmail.com i�ermiyorsa "l�tfen gmail adresi giriniz"
		//@gmail.com ile bitiyorsa "email adresiniz kaydedildi"
		//@gmail.com ile bitmiyorsa "l�tfen yaz�m� kontrol edin" yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("L�tfen mail adresinizi giriniz : ");
		
		String email=scan.next();
		
		if(!email.contains("@gmail.com")) {System.out.println("l�tfen gmail adresi giriniz");
			
		}else if(email.indexOf("@gmail.com")== email.length()-10){
			System.out.println("email adresiniz kaydedildi");
			
			
		}else {System.out.println("l�tfen yaz�m� kontrol edin");}
		scan.close();
		
	}

}
