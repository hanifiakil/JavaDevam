package day12_;

import java.util.Scanner;

public class C07_contains {

	public static void main(String[] args) {
		//kullan�c�dan bir c�mle isteyin.
		//c�mle "b�y�k" kelimesi i�eriyorsa t�m c�mleyi b�y�k harf olarak
		//"k���k" kelimesi i�eriyorsa t�m c�mleyi k���k harf olarak yazd�r�n.
		//iki kelimeyi de i�ermiyorsa "c�mle k���k yada b�y�k kelimesi i�ermiyor" yazd�r�n
		//her iki kelimeyide i�eriyorsa "l�tfen k���k yada b�y�k te tercih yap�n"
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("L�tfen bir c�mle giriniz : ");
	
	
		String c�mle=scan.nextLine();
		
		if(c�mle.toLowerCase().contains("b�y�k")&&c�mle.toLowerCase() .contains("k���k")) {
			System.out.println("l�tfen k���k yada b�y�k te tercih yap�n");
		}else if(c�mle.toLowerCase().contains("k���k")) {
			System.out.println(c�mle.toLowerCase());
		}else if(c�mle.toLowerCase().contains("b�y�k")) {
			System.out.println(c�mle.toUpperCase());
		}else {System.out.println("c�mle k���k yada b�y�k kelimesi i�ermiyor");
		
		scan.close();
			
		}
		

	}

}
