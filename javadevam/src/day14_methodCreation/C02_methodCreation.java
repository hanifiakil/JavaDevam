package day14_methodCreation;

import java.util.Scanner;

public class C02_methodCreation {

	public static void main(String[] args) {
		//kullan�c�dan iki say� isteyin
		//say�lar�n karelerini ve k�plerini toplay�p yazd�ran iki ayr� metod yazd�r�n
		//kullan�c�ya �s sorun
		//2 yazarsa kareleri toplam�n� yapan method, 3 yazarsa k�pler toplam�n� yapan method �al��s�n
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen iki say� giriniz \nilk say�dan sonra enter e bas�n�z: ");
		
		double say�1=scan.nextDouble();
		
		double say�2=scan.nextDouble();
		
		System.out.print("l�tfen girdi�iniz say�lar i�in �s say� giriniz: ");
		
		int �s=scan.nextInt();
		
		
		
		if(�s==2) {kare(say�1,say�2);
			
		}else if (�s==3){k�p(say�1,say�2);
			
		}else {
			System.out.println("l�tfen �s yazarken 2 yada 3 olmas�na dikkat ediniz...");
		}
		scan.close();
		
		
	}

	public static void k�p(double say�1, double say�2) {
		
		double k�ptoplam�=say�1*say�1*say�1 + say�2*say�2*say�2;
		
		System.out.println("girilen say�lar�n k�p leri toplam� : " + k�ptoplam�);
	}

	public static void kare(double say�1, double say�2) {
		double karetoplam�=say�1*say�1+say�2*say�2;
		
		System.out.println("girilen say�lar�n kare leri toplam� : " + karetoplam�);
		
	}

}
