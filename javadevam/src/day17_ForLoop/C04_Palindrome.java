package day17_ForLoop;

import java.util.Scanner;

public class C04_Palindrome {

	public static void main(String[] args) {
		//kullanıcıdan bir string isteyin.kullanıcının girdiği string in palindrome
		//olup olmadığını kontrol eden bie proğram yazınız.
Scanner scan=new Scanner (System.in);
		
		System.out.println("lütfen cümle giriniz...");
		
		String str=scan.nextLine();
		
		tersçevir(str);
		
		if (str.equals(tersçevir(str))) {System.out.println("girdiğiniz string palindrome");// düzden ve tersten
			
		} else {System.out.println("girdiğiniz string palindrome değildir");//düzden ve tersten aynı değildir

		}

		scan.close();
	}

	public static String tersçevir(String str) {
		
		String tersi="";
		
		for (int i =str.length()-1; i >=0; i--) {tersi+=str.substring(i, i+1);
			
		}
		
	
	
		return tersi;
		
	}

}
