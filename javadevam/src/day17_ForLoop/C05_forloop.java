package day17_ForLoop;

import java.util.Scanner;

public class C05_forloop {

	public static void main(String[] args) {
		// kullan�c�dan iki say� isteyiniz. girilen say�lar ve aralar�ndaki
		//t�m say�lar� toplay�p sonucu yazd�ran bir pro�ram yaz�n�z
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen iki tam say� giriniz \n ikinci tam say� i�in enter e bas�n�z");
		
		int say�1=scan.nextInt();
		int say�2=scan.nextInt();
		
		int k���k=0;
		int b�y�k=0;
		
		if (say�1>say�2) {
			k���k=say�2;
			b�y�k=say�1;
			
		} else {
			k���k=say�1;
			b�y�k=say�2;
		}
		
		int toplam=0;
		
		
		for (int i = k���k; i <=b�y�k; i++) {
			toplam+=i;	
		}
		
		System.out.println("girilen say�lar�n aras�nda bulunan say�lar toplam� : " + toplam);

		scan.close();
	}

}
