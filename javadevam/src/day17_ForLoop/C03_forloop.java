package day17_ForLoop;

import java.util.Scanner;

public class C03_forloop {

	public static void main(String[] args) {
		// kullan�c�dan bir string isteyin ve stringi tersten yazd�ran bir metot olu�turun
		
Scanner scan=new Scanner (System.in);
		
		System.out.println("l�tfen c�mle giriniz...");
		
		String str=scan.nextLine();
		
		ters�evir(str);
		
		System.out.println(ters�evir(str));//yazd�rmak i�in kullan�ld�

		scan.close();
	}

	public static String ters�evir(String str) {
		
		String tersi="";
		
		for (int i =str.length()-1; i >=0; i--) {tersi+=str.substring(i, i+1);
			
		}
		
	
	
		return tersi;
		
	}

}
