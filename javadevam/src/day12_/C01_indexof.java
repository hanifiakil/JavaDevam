package day12_;

import java.util.Scanner;

public class C01_indexof {

	public static void main(String[] args) {
		// kullanýcýdan bir cümle ve harf isteyiniz
		//harfin cümlede olup olmadýðýný yazdýrýn.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lütfen bir cümle giriniz : ");
		
		String cümle=scan.nextLine();
		
		System.out.print("lütfen varlýðýný kontrol etmek için bir harf giriniz : ");
		
		char krt=scan.next().charAt(0);
		
		System.out.println(cümle.indexOf(krt));
		
		int sonuç=cümle.indexOf(krt);
		
		System.out.println((sonuç==-1)?("bu karakter bulunmamakta"):("bu karakte bulunmaktadýr"));
		scan.close();

	}

}
