package day15_methodCreation;

import java.util.Scanner;

public class C02_methodCreation {

	public static void main(String[] args) {
		/* kullan�c�ya ka� say� toplamak istedi�ini sorun
		 * kullan�c� 2,3 veya 4 de�erini girerse
		 * kullan�c�dan bu say�lar� girmesini isteyin ve bu say�lar�n toplam�n� yazd�r�n
		 * kullan�c� toplamak istedi�i say� adedini 4 ten b�y�k girerse
		 * "�ok say� girdiniz, ben toplayamam" yazd�r�n. */
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("l�tfen ka� say� toplamak istedi�inizi belirtin ...");
		
		int tercih =scan.nextInt();
		
		if(tercih>4) {
			tercih=5;
		}
		
		switch(tercih){
		case 2:ikisay�topla();
		break;
		case 3:��say�topla();
		break;
		case 4:d�rtsay�topla();
		break;
		case 5:System.out.println("�ok say� girdiniz ben toplayamam");
		break;
		default: System.out.println("ge�ersiz tercih");
	}	

		scan.close();
	}

	public static void d�rtsay�topla() {
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen d�rt say� giriniz \nikinci say� i�in enter e bas�n�z "
				+ "n\"���nc� say� i�in enter e bas�n�z \nd�rd�nc� say� i�in enter e bas�n�z");
		
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		double say�3=scan.nextDouble();
		double say�4=scan.nextDouble();
		
		System.out.println("girdi�iniz say�lar�n toplam� : " + (say�1+say�2+say�3+say�4));
		scan.close();
	}

	public static void ��say�topla() {
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen �� say� giriniz \nikinci say� i�in enter e bas�n�z \n"
				+ "���nc� say� i�in enter e bas�n�z");
		
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		double say�3=scan.nextDouble();
		
		System.out.println("girdi�iniz say�lar�n toplam� : " + (say�1+say�2+say�3));
		scan.close();
	}

	public static void ikisay�topla() {
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen iki say� giriniz \nikinci say� i�in enter e bas�n�z");
		
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		
		System.out.println("girdi�iniz say�lar�n toplam� : " + (say�1+say�2));
		scan.close();
		
	}

}
