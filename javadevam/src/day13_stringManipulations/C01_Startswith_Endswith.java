package day13_stringManipulations;

import java.util.Scanner;

public class C01_Startswith_Endswith {

	public static void main(String[] args) {
		// kullan�c�dan bir c�mle ve bir kelime al�n
		//verilen c�mlenin verilen kelime(char squence) ile ba�lay�p,
		//ba�lamad���n� ve bitip bitmedi�ini yazd�r�n.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("l�tfen bir c�mle giriniz : ");
		
		String c�mle=scan.nextLine();
		
		System.out.print("l�tfen bir kelime giriniz : ");
		
		String kelime=scan.next();
		
		if(c�mle.startsWith(kelime)) {System.out.println("girilen c�mle " + kelime + " ile ba�l�yor");
			
		}else {System.out.println("girilen c�mle " + kelime + " ile ba�lam�yor");
			
		}
		
		if(c�mle.endsWith(kelime)) {System.out.println("girilen c�mle " + kelime + " ile bitiyor");
		
		}else {System.out.println("girilen c�mle " + kelime + " ile bitmiyor");
		
		scan.close();
		

	}

}}
