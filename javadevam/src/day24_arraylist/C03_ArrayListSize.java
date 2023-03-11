package day24_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayListSize {

	public static void main(String[] args) {
		// verilen bir array den  istenen de�ere sahip elementleri silip
		//kalan� yeni bir array olarak kaydedin ve sonra yeni array i yazd�r�n
		int arr[]= {3,2,4,5,6,7,8,9};
		int silinecekeleman=5;
		
		List<Integer> ge�ici=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekeleman) {
				ge�ici.add(arr[i]);		
			}	
		}
System.out.println("List te bulunan elemanlar : " + ge�ici);
//sonucu Array olarak yazd�rmak isteniyor
int yeniarr[]=new int[ge�ici.size()];
for (int i = 0; i < yeniarr.length; i++) {
	yeniarr[i]=ge�ici.get(i);
}
System.out.println("Array olarak : " + Arrays.toString(yeniarr));
	}

}
