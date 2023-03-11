package day25_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		// verilen bir array da tekrar eden elementleri sadece birer tane yazarak
		//unique elementlerden oluşan bir array haline getirelim
		
		int arr[]= {2,3,4,5,6,6,5,4,1,7,8,9,0,1,0};
		//2,3,4,5,6,7,8,9,0,1
		
		List<Integer> tekrarsız=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!tekrarsız.contains(arr[i])) {
				tekrarsız.add(arr[i]);
				
			}
			
		}
		System.out.println(tekrarsız);
		int tekrarsızArr[]=new int[tekrarsız.size()];
		for (int i = 0; i < tekrarsızArr.length; i++) {
			tekrarsızArr[i]=tekrarsız.get(i);
			
		}
System.out.println(Arrays.toString(tekrarsızArr));
	}

}
