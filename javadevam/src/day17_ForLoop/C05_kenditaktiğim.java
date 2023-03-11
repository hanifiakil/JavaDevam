package day17_ForLoop;

import java.util.Scanner;

public class C05_kenditaktiğim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kullanıcıdan iki sayı isteyiniz. girilen sayılar ve aralarındaki
		//tüm sayıları toplayıp sonucu yazdıran bir proğram yazınız
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen iki tam sayı giriniz \n ikinci tam sayı için enter e basınız");
		
		int sayı1=scan.nextInt();
		int sayı2=scan.nextInt();
		int toplam=0;
		
		if (sayı1>sayı2) {for (int i =sayı2; i <=sayı1; i++) {
			toplam+=i;
			
		}
			
		} else {for (int i =sayı1; i <=sayı2; i++) {
			toplam+=i;

		}}
		
		System.out.println("girilen sayıların aralarındaki tüm sayıların toplamı : " + toplam);
		
		scan.close();
	}

}
