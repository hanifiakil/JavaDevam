package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// verilen bir array den istenen deðere sahip elementleri silip
		//kalaný yeni bir array olarak kaydedin
		//ve sonra yeni array ý yazdýrýn
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9};
		int silinecekEleman=5;
		//array de yeni eleman ekleyemeyiz veya var olan elemanlarý silemeyiz
		//çünkü array ýn declare dilen uzunluðu DEÐÝÞMEZ
		//bu soruda istenen elementi sildiðimizde geriye kaç element kalýyor bulmamýz lazým
		//silinecek asý adedini bulalým
		
		int sayaç=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayaç++;
			}
			}
		int yeniarrayuzunluk=arr.length-sayaç;
		
		//artýk yeni array i oluþturabiliriz
		
		int yeniarr[]=new int[yeniarrayuzunluk];
		//þimdi eski array deki elemanlarý birer birer alýp silinecek elemana eþit olmayanlarý yeni array e atamalýyýz
		
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
