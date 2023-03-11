package day17_ForLoop;

import java.util.Scanner;

public class C03_forloop {

	public static void main(String[] args) {
		// kullanıcıdan bir string isteyin ve stringi tersten yazdıran bir metot oluşturun
		
Scanner scan=new Scanner (System.in);
		
		System.out.println("lütfen cümle giriniz...");
		
		String str=scan.nextLine();
		
		tersçevir(str);
		
		System.out.println(tersçevir(str));//yazdırmak için kullanıldı

		scan.close();
	}

	public static String tersçevir(String str) {
		
		String tersi="";
		
		for (int i =str.length()-1; i >=0; i--) {tersi+=str.substring(i, i+1);
			
		}
		
	
	
		return tersi;
		
	}

}
