package day21_scope_arrays;

import java.util.Arrays;

public class C05_arrays {

	public static void main(String[] args) {
		// verilen 3 elemanl� bir array in t�m elemanlar�n� bir sonraki
		//konuma ta��yacak bir pro�ram yaz�n.
		//�rn; array[1,2,3] ise output [2,3,1] olacak
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10,12,13,15};
		int kova=arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]= kova;
		System.out.println(Arrays.toString(arr));

	}

}
