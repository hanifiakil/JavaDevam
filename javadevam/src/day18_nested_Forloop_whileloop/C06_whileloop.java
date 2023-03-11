package day18_nested_Forloop_whileloop;

import java.util.Scanner;

public class C06_whileloop {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan toplamak üzere sayýlar isteyiniz sayý adedi 10 u geçerse veya
		 * toplam 500 ü geçerse "bu kadar yeter"
		 * "...... adet sayý girdin, toplamý ....."yazdýrýn
		 */
		Scanner scan = new Scanner(System.in);

		int sayý = 0;
		int toplam = 0;
		int sayaç = 0;
		
		while (toplam<=500 && sayaç<=10) {System.out.println("lütfen toplamak için tam sayý giriniz");
		
			sayý=scan.nextInt();
			toplam+=sayý;
			sayaç++;
			
			
		}System.out.println("bu kadar yeter...");
		System.out.println(sayaç + " adet sayý girdin, toplamý " + toplam);
		
		scan.close();

	}

}
