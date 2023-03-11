package day40;

import java.util.Scanner;

public class C08_illegalargumentException {

	public static void main(String[] args) {
		//kullanýcýdan yaþýný girmesini isteyin 
		//kodunuzu kullanýcý sýfýrdan küçük bir sayý girerse Exception verecek þekilde yazýn
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen konsolda görmek için yaþýnýzý giriniz...");
		
		int yaþ =scan.nextInt();
		
		try {
			if (yaþ<0) {
				throw new IllegalArgumentException();
				
			} else {System.out.println(yaþ);

			}
			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("sýfýrdan küçük yaþ olmaz");
			
		}

	}

}
