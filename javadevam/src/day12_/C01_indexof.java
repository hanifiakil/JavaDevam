package day12_;

import java.util.Scanner;

public class C01_indexof {

	public static void main(String[] args) {
		// kullan�c�dan bir c�mle ve harf isteyiniz
		//harfin c�mlede olup olmad���n� yazd�r�n.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("L�tfen bir c�mle giriniz : ");
		
		String c�mle=scan.nextLine();
		
		System.out.print("l�tfen varl���n� kontrol etmek i�in bir harf giriniz : ");
		
		char krt=scan.next().charAt(0);
		
		System.out.println(c�mle.indexOf(krt));
		
		int sonu�=c�mle.indexOf(krt);
		
		System.out.println((sonu�==-1)?("bu karakter bulunmamakta"):("bu karakte bulunmaktad�r"));
		scan.close();

	}

}
