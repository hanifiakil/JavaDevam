package day23_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05Array {

	public static void main(String[] args) {
		//kullan�c�dan bir c�mle isteyin ve c�mledeki kelime say�s�n� yazd�r�n
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("l�tfen bir c�mle giriniz...");
		
		String c�mle=scan.nextLine();
		
		String kelimeler[]=c�mle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));//burada kelimeler ��kacak
		
		System.out.println("girilen c�mle " + kelimeler.length + " adet kelime i�erir");

	scan.close();}

}
