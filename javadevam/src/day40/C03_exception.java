package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_exception {

	public static void main(String[] args) {
		// verilen bir int array için kullanýcýdan sayý isteyin ve girilen sayýyý
		//index olarak kabul edip o index deki elementi yazdýrýn
		
		int arr[]= {2,3,5,6,2,7,9,1};
		//ArrayIndexOutOfBoundsException
		//InputMismatchException
		
		Scanner scan=new Scanner(System.in);
		
		try {System.out.println("lütfen elementi yazdýrmak için index giriniz");
		int index=scan.nextInt();

		System.out.println("girdiðiniz indexdeki element : " + arr[index]);
		
		
	
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("yanlýþ index girdiniz");
		
		} catch (InputMismatchException e) {
			System.out.println("sayý dýþýnda karakter girdiniz");
		}
		
			
		
	}

}
