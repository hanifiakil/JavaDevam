package day21_scope_arrays;

import java.util.Arrays;

public class C06_arrays {
	public static void main(String[] args) {
		
		
	//array nin t�m elemanlar�n� toplay�n�z
		
		int arr[]= {2,5,6,9,8,7,6,5,6,5,};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
			
		}

		System.out.println("elementlerin toplam� : " + toplam);
		
		//array in t�m elemanlar�n� �nce k���kten b�y��e 
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		//sonra b�y�kten k����e s�ralay�n�z bu s�ralama i�in for loop tan yard�m alabiliriz
		System.out.println(" ");
		for (int i= arr.length-1;i>=0; i--) {
			System.out.print(arr[i] + " ");
			System.out.print(" ");
			
		}
		//array yapmak isterseniz bo� bir array olu�turup elemanlar� bo� array e ta��yabilirsiniz
		
		int tersarray[]=new int[arr.length];
		
		for (int i = 0; i < tersarray.length; i++) {
			tersarray[i]=arr[arr.length-1-i];			
		}
		System.out.print(Arrays.toString(tersarray));
}}
