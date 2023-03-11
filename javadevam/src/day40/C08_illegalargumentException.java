package day40;

import java.util.Scanner;

public class C08_illegalargumentException {

	public static void main(String[] args) {
		//kullan�c�dan ya��n� girmesini isteyin 
		//kodunuzu kullan�c� s�f�rdan k���k bir say� girerse Exception verecek �ekilde yaz�n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("l�tfen konsolda g�rmek i�in ya��n�z� giriniz...");
		
		int ya� =scan.nextInt();
		
		try {
			if (ya�<0) {
				throw new IllegalArgumentException();
				
			} else {System.out.println(ya�);

			}
			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("s�f�rdan k���k ya� olmaz");
			
		}

	}

}
