package day18_nested_Forloop_whileloop;

import java.util.Scanner;

public class C06_whileloop {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan toplamak �zere say�lar isteyiniz say� adedi 10 u ge�erse veya
		 * toplam 500 � ge�erse "bu kadar yeter"
		 * "...... adet say� girdin, toplam� ....."yazd�r�n
		 */
		Scanner scan = new Scanner(System.in);

		int say� = 0;
		int toplam = 0;
		int saya� = 0;
		
		while (toplam<=500 && saya�<=10) {System.out.println("l�tfen toplamak i�in tam say� giriniz");
		
			say�=scan.nextInt();
			toplam+=say�;
			saya�++;
			
			
		}System.out.println("bu kadar yeter...");
		System.out.println(saya� + " adet say� girdin, toplam� " + toplam);
		
		scan.close();

	}

}
