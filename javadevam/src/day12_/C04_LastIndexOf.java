package day12_;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		// kullan�c�dan bir c�mle ve harf isteyiniz
				//harfin c�mlede olup olmad���n� yazd�r�n.
				
				
				Scanner scan=new Scanner(System.in);
				
				System.out.print("L�tfen bir c�mle giriniz : ");
				
				String c�mle=scan.nextLine();
				
				System.out.print("l�tfen varl���n� kontrol etmek i�in bir harf giriniz : ");
				
				char krt=scan.next().charAt(0);
				
				
				
				if(c�mle.lastIndexOf(krt)==-1) {
					System.out.println("belirtilen karakter kullan�lmam��t�r");
				}else {System.out.println("belirtilen karakter kullan�lm��t�r");}
				
				scan.close();

	}

}
