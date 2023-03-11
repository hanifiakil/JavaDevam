package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// verilen bir array den istenen de�ere sahip elementleri silip
		//kalan� yeni bir array olarak kaydedin
		//ve sonra yeni array � yazd�r�n
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9};
		int silinecekEleman=5;
		//array de yeni eleman ekleyemeyiz veya var olan elemanlar� silemeyiz
		//��nk� array �n declare dilen uzunlu�u DE���MEZ
		//bu soruda istenen elementi sildi�imizde geriye ka� element kal�yor bulmam�z laz�m
		//silinecek as� adedini bulal�m
		
		int saya�=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				saya�++;
			}
			}
		int yeniarrayuzunluk=arr.length-saya�;
		
		//art�k yeni array i olu�turabiliriz
		
		int yeniarr[]=new int[yeniarrayuzunluk];
		//�imdi eski array deki elemanlar� birer birer al�p silinecek elemana e�it olmayanlar� yeni array e atamal�y�z
		
		int index=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekEleman) {
				yeniarr[index]=arr[i];
				index++;
			}
		}
System.out.println(Arrays.toString(yeniarr));
	}

}
