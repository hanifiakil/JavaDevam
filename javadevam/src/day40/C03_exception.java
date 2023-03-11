package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_exception {

	public static void main(String[] args) {
		// verilen bir int array i�in kullan�c�dan say� isteyin ve girilen say�y�
		//index olarak kabul edip o index deki elementi yazd�r�n
		
		int arr[]= {2,3,5,6,2,7,9,1};
		//ArrayIndexOutOfBoundsException
		//InputMismatchException
		
		Scanner scan=new Scanner(System.in);
		
		try {System.out.println("l�tfen elementi yazd�rmak i�in index giriniz");
		int index=scan.nextInt();

		System.out.println("girdi�iniz indexdeki element : " + arr[index]);
		
		
	
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("yanl�� index girdiniz");
		
		} catch (InputMismatchException e) {
			System.out.println("say� d���nda karakter girdiniz");
		}
		
			
		
	}

}
