package day17_ForLoop;

import java.util.Scanner;

public class C02_forLoop {

	public static void main(String[] args) {
		// kullan�c�dan bir string isteyin ve stringi tersten yazd�r�n
		
Scanner scan=new Scanner (System.in);
		
		System.out.println("l�tfen c�mle giriniz...");
		
		String str=scan.nextLine();
		
		for (int i = str.length()-1; i >0; i--) {System.out.print(str.substring(i,i+1));
			
		}scan.close();
		
	}

}
