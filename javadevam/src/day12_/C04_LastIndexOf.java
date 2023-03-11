package day12_;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		// kullanýcýdan bir cümle ve harf isteyiniz
				//harfin cümlede olup olmadýðýný yazdýrýn.
				
				
				Scanner scan=new Scanner(System.in);
				
				System.out.print("Lütfen bir cümle giriniz : ");
				
				String cümle=scan.nextLine();
				
				System.out.print("lütfen varlýðýný kontrol etmek için bir harf giriniz : ");
				
				char krt=scan.next().charAt(0);
				
				
				
				if(cümle.lastIndexOf(krt)==-1) {
					System.out.println("belirtilen karakter kullanýlmamýþtýr");
				}else {System.out.println("belirtilen karakter kullanýlmýþtýr");}
				
				scan.close();

	}

}
