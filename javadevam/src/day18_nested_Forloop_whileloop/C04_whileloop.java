package day18_nested_Forloop_whileloop;

import java.util.Scanner;

public class C04_whileloop {
	public static void main(String[] args) {
		
		/*kullan�c�dan toplamak �zere say� isteyin
		 * kullan�c� s�f�ra bas�ncaya kadar say�lar� al�p
		 * toplamaya devam edin
		 * kullan�c� s�f�ra bast���nda o ana kadar ka� say� girdi�ini ve girilen say�lar�n toplam�n� yazd�r�n
		 */

	
		Scanner scan=new Scanner(System.in);
		
		int say�=10;//0 hari� herhangi biri olabilir ��nk� s�f�rda bitirece�iz
		int toplam=0;
		int saya�=0;
		
		
		while (say�!=0) {
			System.out.println("l�tfen toplamak i�in tam say� giriniz \n bitirmek i�in 0 a bas�n�z");
			
			say�=scan.nextInt();
			toplam+=say�;
			saya�++;
		}
		System.out.println("girilen say�lar�n toplam� : " + toplam );
		System.out.println("girilen say�lar�n adeti : " + (saya�-1));//0 � sayaca dahil etmemek i�in 1 ��kard�k
		scan.close();
	}
}