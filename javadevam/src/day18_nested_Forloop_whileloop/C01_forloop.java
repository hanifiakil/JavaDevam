package day18_nested_Forloop_whileloop;

import java.util.Scanner;

public class C01_forloop {

	public static void main(String[] args) {
		// kullan�c�dan 2 tam say� isteyin
		//ilk say�dan ba�layarak ikinci say�ya kadar ��er ��er yazd�r�n
		//(ikinci say� dahil olmak zorunda de�il)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen aradaki say�lar� ��er ��er yazd�rmak i�in iki tam say� girin");
		
		int say�1=scan.nextInt();
		int say�2=scan.nextInt();
		
		if (say�1>say�2) {for (int i = say�1; i >=say�2; i-=3) {
			
			System.out.print(i + " ");
			
		}
			
		} else if(say�1<say�2){for (int i = say�1; i <=say�2; i+=3) {
			
			System.out.print(i + " ");
			
		}

		}else {
			System.out.println("girilen say�lar e�it");
		}scan.close();

	}

}
