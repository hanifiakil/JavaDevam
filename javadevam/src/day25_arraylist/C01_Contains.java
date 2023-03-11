package day25_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		// verilen bir array da tekrar eden elementleri sadece birer tane yazarak
		//unique elementlerden olu�an bir array haline getirelim
		
		int arr[]= {2,3,4,5,6,6,5,4,1,7,8,9,0,1,0};
		//2,3,4,5,6,7,8,9,0,1
		
		List<Integer> tekrars�z=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!tekrars�z.contains(arr[i])) {
				tekrars�z.add(arr[i]);
				
			}
			
		}
		System.out.println(tekrars�z);
		int tekrars�zArr[]=new int[tekrars�z.size()];
		for (int i = 0; i < tekrars�zArr.length; i++) {
			tekrars�zArr[i]=tekrars�z.get(i);
			
		}
System.out.println(Arrays.toString(tekrars�zArr));
	}

}
