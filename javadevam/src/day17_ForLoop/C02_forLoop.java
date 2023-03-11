package day17_ForLoop;

import java.util.Scanner;

public class C02_forLoop {

	public static void main(String[] args) {
		// kullanýcýdan bir string isteyin ve stringi tersten yazdýrýn
		
Scanner scan=new Scanner (System.in);
		
		System.out.println("lütfen cümle giriniz...");
		
		String str=scan.nextLine();
		
		for (int i = str.length()-1; i >0; i--) {System.out.print(str.substring(i,i+1));
			
		}scan.close();
		
	}

}
