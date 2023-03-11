package day18_nested_Forloop_whileloop;

import java.util.Scanner;

public class C01_forloop {

	public static void main(String[] args) {
		// kullanıcıdan 2 tam sayı isteyin
		//ilk sayıdan başlayarak ikinci sayıya kadar üçer üçer yazdırın
		//(ikinci sayı dahil olmak zorunda değil)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen aradaki sayıları üçer üçer yazdırmak için iki tam sayı girin");
		
		int sayı1=scan.nextInt();
		int sayı2=scan.nextInt();
		
		if (sayı1>sayı2) {for (int i = sayı1; i >=sayı2; i-=3) {
			
			System.out.print(i + " ");
			
		}
			
		} else if(sayı1<sayı2){for (int i = sayı1; i <=sayı2; i+=3) {
			
			System.out.print(i + " ");
			
		}

		}else {
			System.out.println("girilen sayılar eşit");
		}scan.close();

	}

}
