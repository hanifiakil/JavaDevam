package day16_forLoop;

import java.util.Scanner;

public class C05_forloop {

	public static void main(String[] args) {
		// kullan�c�dan 100 den k���k bir say� isteyin
		//1 den ba�layarak girilen say�ya kadar(say� dahil) 3 �n kat� olan say�lar� yazd�r�n
		//negatif ve 100 den b�y�k say� girilirse uyar�n�z
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("l�tfen 100 den k���k bir say� giriniz");
		
		double say�=scan.nextDouble();
		int say�2=(int) say�;
		if (say�<0) {System.out.println("negatif say� giremezsiniz");
			
		} else {if (say�>=100) {System.out.println("b�y�k say� girdiniz");
			
		} else {if (say�!=say�2) {System.out.println("l�tfen tam say� giriniz");
			
		} else {for (int i = 1; i <=say�; i++) {
			if (i%3==0) {System.out.print(i + " ");

		}}}}}scan.close();}}
