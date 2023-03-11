package day24_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayListSize {

	public static void main(String[] args) {
		// verilen bir array den  istenen deðere sahip elementleri silip
		//kalaný yeni bir array olarak kaydedin ve sonra yeni array i yazdýrýn
		int arr[]= {3,2,4,5,6,7,8,9};
		int silinecekeleman=5;
		
		List<Integer> geçici=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekeleman) {
				geçici.add(arr[i]);		
			}	
		}
System.out.println("List te bulunan elemanlar : " + geçici);
//sonucu Array olarak yazdýrmak isteniyor
int yeniarr[]=new int[geçici.size()];
for (int i = 0; i < yeniarr.length; i++) {
	yeniarr[i]=geçici.get(i);
}
System.out.println("Array olarak : " + Arrays.toString(yeniarr));
	}

}
