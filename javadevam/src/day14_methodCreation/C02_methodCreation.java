package day14_methodCreation;

import java.util.Scanner;

public class C02_methodCreation {

	public static void main(String[] args) {
		//kullanýcýdan iki sayý isteyin
		//sayýlarýn karelerini ve küplerini toplayýp yazdýran iki ayrý metod yazdýrýn
		//kullanýcýya üs sorun
		//2 yazarsa kareleri toplamýný yapan method, 3 yazarsa küpler toplamýný yapan method çalýþsýn
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen iki sayý giriniz \nilk sayýdan sonra enter e basýnýz: ");
		
		double sayý1=scan.nextDouble();
		
		double sayý2=scan.nextDouble();
		
		System.out.print("lütfen girdiðiniz sayýlar için üs sayý giriniz: ");
		
		int üs=scan.nextInt();
		
		
		
		if(üs==2) {kare(sayý1,sayý2);
			
		}else if (üs==3){küp(sayý1,sayý2);
			
		}else {
			System.out.println("lütfen üs yazarken 2 yada 3 olmasýna dikkat ediniz...");
		}
		scan.close();
		
		
	}

	public static void küp(double sayý1, double sayý2) {
		
		double küptoplamý=sayý1*sayý1*sayý1 + sayý2*sayý2*sayý2;
		
		System.out.println("girilen sayýlarýn küp leri toplamý : " + küptoplamý);
	}

	public static void kare(double sayý1, double sayý2) {
		double karetoplamý=sayý1*sayý1+sayý2*sayý2;
		
		System.out.println("girilen sayýlarýn kare leri toplamý : " + karetoplamý);
		
	}

}
