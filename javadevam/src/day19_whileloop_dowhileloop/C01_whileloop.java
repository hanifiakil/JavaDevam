package day19_whileloop_dowhileloop;

import java.util.Scanner;

public class C01_whileloop {

	public static void main(String[] args) {
		// kullan�c�dan bir say� al�n ve say�y� tam b�len
		//say�lar� ve toplam ka� tane olduklar�n� ekranda yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		System.out.println("l�tfen b�lenlerini bulmak i�in bir tam say� giriniz");
		int say�=scan.nextInt();
		
		int saya�=0;
		int b�len=1;
		
		while (b�len<=say�) {
			if (say�%b�len==0) {System.out.print( b�len + " ");
			
			saya�++;
			}b�len++;
			
			
		}System.out.println("");
		System.out.println("b�len say�s� : " + saya�);
		scan.close();
			
		}
	}


