package day17_ForLoop;

import java.util.Scanner;

public class C06_forloop {

	public static void main(String[] args) {
		//  kullanýcýdan 10 dan küçük bir tam sayý isteyin ve girilen sayýnýn faktöryel ini bulun.
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen 10 dan küçük bir tam sayý giriniz");
		
		int sayý=scan.nextInt();
		
		System.out.print(sayý + "!=");
		
		int faktöryel=1;
		
		
		
		for (int i = sayý; i >=2; i--) {
			faktöryel*=i;
			System.out.print(i + "*");
			
		}
		System.out.print("1=" + faktöryel);
		
		scan.close();
	}

}
