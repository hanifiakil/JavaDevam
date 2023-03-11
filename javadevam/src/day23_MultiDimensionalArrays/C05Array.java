package day23_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05Array {

	public static void main(String[] args) {
		//kullanýcýdan bir cümle isteyin ve cümledeki kelime sayýsýný yazdýrýn
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("lütfen bir cümle giriniz...");
		
		String cümle=scan.nextLine();
		
		String kelimeler[]=cümle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));//burada kelimeler çýkacak
		
		System.out.println("girilen cümle " + kelimeler.length + " adet kelime içerir");

	scan.close();}

}
