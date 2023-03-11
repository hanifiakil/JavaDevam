package day21_scope_arrays;

import java.util.Arrays;

public class C06_arrays {
	public static void main(String[] args) {
		
		
	//array nin tüm elemanlarýný toplayýnýz
		
		int arr[]= {2,5,6,9,8,7,6,5,6,5,};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
			
		}

		System.out.println("elementlerin toplamý : " + toplam);
		
		//array in tüm elemanlarýný önce küçükten büyüðe 
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		//sonra büyükten küçüðe sýralayýnýz bu sýralama için for loop tan yardým alabiliriz
		System.out.println(" ");
		for (int i= arr.length-1;i>=0; i--) {
			System.out.print(arr[i] + " ");
			System.out.print(" ");
			
		}
		//array yapmak isterseniz boþ bir array oluþturup elemanlarý boþ array e taþýyabilirsiniz
		
		int tersarray[]=new int[arr.length];
		
		for (int i = 0; i < tersarray.length; i++) {
			tersarray[i]=arr[arr.length-1-i];			
		}
		System.out.print(Arrays.toString(tersarray));
}}
