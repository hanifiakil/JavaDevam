package day16_forLoop;

import java.util.Scanner;

public class C06_forLoop {

	public static void main(String[] args) {
		// kullan�c�dan 100 den k���k pozitif bir say� isteyin
		//1 den ba�lay�p verilen say�ya kadar ki 3 yada 5 e b�l�nebilen say�lar� yazd�r�n
		
Scanner scan=new Scanner (System.in);
		
		System.out.println("l�tfen 100 den k���k bir say� giriniz");
		
		
		int say�=scan.nextInt();
		
		for (int i = 1; i <= say�; i++) {if (i%3==0 || i%5==0) { 
			System.out.print(i + " ");}
			
			
		}scan.close();

	}

}
