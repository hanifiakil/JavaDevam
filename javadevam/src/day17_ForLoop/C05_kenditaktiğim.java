package day17_ForLoop;

import java.util.Scanner;

public class C05_kenditakti�im {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kullan�c�dan iki say� isteyiniz. girilen say�lar ve aralar�ndaki
		//t�m say�lar� toplay�p sonucu yazd�ran bir pro�ram yaz�n�z
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen iki tam say� giriniz \n ikinci tam say� i�in enter e bas�n�z");
		
		int say�1=scan.nextInt();
		int say�2=scan.nextInt();
		int toplam=0;
		
		if (say�1>say�2) {for (int i =say�2; i <=say�1; i++) {
			toplam+=i;
			
		}
			
		} else {for (int i =say�1; i <=say�2; i++) {
			toplam+=i;

		}}
		
		System.out.println("girilen say�lar�n aralar�ndaki t�m say�lar�n toplam� : " + toplam);
		
		scan.close();
	}

}
