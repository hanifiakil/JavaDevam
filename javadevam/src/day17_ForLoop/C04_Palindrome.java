package day17_ForLoop;

import java.util.Scanner;

public class C04_Palindrome {

	public static void main(String[] args) {
		//kullan�c�dan bir string isteyin.kullan�c�n�n girdi�i string in palindrome
		//olup olmad���n� kontrol eden bie pro�ram yaz�n�z.
Scanner scan=new Scanner (System.in);
		
		System.out.println("l�tfen c�mle giriniz...");
		
		String str=scan.nextLine();
		
		ters�evir(str);
		
		if (str.equals(ters�evir(str))) {System.out.println("girdi�iniz string palindrome");// d�zden ve tersten
			
		} else {System.out.println("girdi�iniz string palindrome de�ildir");//d�zden ve tersten ayn� de�ildir

		}

		scan.close();
	}

	public static String ters�evir(String str) {
		
		String tersi="";
		
		for (int i =str.length()-1; i >=0; i--) {tersi+=str.substring(i, i+1);
			
		}
		
	
	
		return tersi;
		
	}

}
