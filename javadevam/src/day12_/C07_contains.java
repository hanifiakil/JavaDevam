package day12_;

import java.util.Scanner;

public class C07_contains {

	public static void main(String[] args) {
		//kullanýcýdan bir cümle isteyin.
		//cümle "büyük" kelimesi içeriyorsa tüm cümleyi büyük harf olarak
		//"küçük" kelimesi içeriyorsa tüm cümleyi küçük harf olarak yazdýrýn.
		//iki kelimeyi de içermiyorsa "cümle küçük yada büyük kelimesi içermiyor" yazdýrýn
		//her iki kelimeyide içeriyorsa "lütfen küçük yada büyük te tercih yapýn"
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Lütfen bir cümle giriniz : ");
	
	
		String cümle=scan.nextLine();
		
		if(cümle.toLowerCase().contains("büyük")&&cümle.toLowerCase() .contains("küçük")) {
			System.out.println("lütfen küçük yada büyük te tercih yapýn");
		}else if(cümle.toLowerCase().contains("küçük")) {
			System.out.println(cümle.toLowerCase());
		}else if(cümle.toLowerCase().contains("büyük")) {
			System.out.println(cümle.toUpperCase());
		}else {System.out.println("cümle küçük yada büyük kelimesi içermiyor");
		
		scan.close();
			
		}
		

	}

}
