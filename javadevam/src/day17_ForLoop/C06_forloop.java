package day17_ForLoop;

import java.util.Scanner;

public class C06_forloop {

	public static void main(String[] args) {
		//  kullan�c�dan 10 dan k���k bir tam say� isteyin ve girilen say�n�n fakt�ryel ini bulun.
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("l�tfen 10 dan k���k bir tam say� giriniz");
		
		int say�=scan.nextInt();
		
		System.out.print(say� + "!=");
		
		int fakt�ryel=1;
		
		
		
		for (int i = say�; i >=2; i--) {
			fakt�ryel*=i;
			System.out.print(i + "*");
			
		}
		System.out.print("1=" + fakt�ryel);
		
		scan.close();
	}

}
