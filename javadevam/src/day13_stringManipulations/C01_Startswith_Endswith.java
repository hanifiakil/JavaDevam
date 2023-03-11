package day13_stringManipulations;

import java.util.Scanner;

public class C01_Startswith_Endswith {

	public static void main(String[] args) {
		// kullanýcýdan bir cümle ve bir kelime alýn
		//verilen cümlenin verilen kelime(char squence) ile baþlayýp,
		//baþlamadýðýný ve bitip bitmediðini yazdýrýn.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("lütfen bir cümle giriniz : ");
		
		String cümle=scan.nextLine();
		
		System.out.print("lütfen bir kelime giriniz : ");
		
		String kelime=scan.next();
		
		if(cümle.startsWith(kelime)) {System.out.println("girilen cümle " + kelime + " ile baþlýyor");
			
		}else {System.out.println("girilen cümle " + kelime + " ile baþlamýyor");
			
		}
		
		if(cümle.endsWith(kelime)) {System.out.println("girilen cümle " + kelime + " ile bitiyor");
		
		}else {System.out.println("girilen cümle " + kelime + " ile bitmiyor");
		
		scan.close();
		

	}

}}
