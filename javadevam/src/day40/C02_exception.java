package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_exception {

	public static void main(String[] args) {
		// kullan�c�dan istedi�i kadar say� al�p
		//bu say�lar� toplayan bir pro�ram yap�n�z
		//say� giri�ini bitirmek i�in q ya bas�n�z
		
		int say�=0;
		int toplam=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		
		try {
			while(count<10000) {
				System.out.println("l�tfen toplamak istedi�iniz say�lar� yaz�n�z \nbitirmek i�in say� d���nda herhangi bir tu�a bas�n");
				say�=scan.nextInt();
				toplam+=say�;
				count++;
			}
			
		} catch (InputMismatchException e) {
			System.out.println("girdi�iniz " + count + " adet say�n�n toplam� : " + toplam);
		}

	}

}
