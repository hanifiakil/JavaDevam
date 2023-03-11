package day16_forLoop;

import java.util.Scanner;

public class C06_forLoop {

	public static void main(String[] args) {
		// kullanýcýdan 100 den küçük pozitif bir sayý isteyin
		//1 den baþlayýp verilen sayýya kadar ki 3 yada 5 e bölünebilen sayýlarý yazdýrýn
		
Scanner scan=new Scanner (System.in);
		
		System.out.println("lütfen 100 den küçük bir sayý giriniz");
		
		
		int sayý=scan.nextInt();
		
		for (int i = 1; i <= sayý; i++) {if (i%3==0 || i%5==0) { 
			System.out.print(i + " ");}
			
			
		}scan.close();

	}

}
