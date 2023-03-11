package day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		String isimler []= {"hacer","ay�eg�l","emine","murat","kutlu"};
		//isimler array inde isim var m�
		//array da arama yapmadan �nce s�ralama yapmal�y�z
		Arrays.sort(isimler);//arrays class � sort yapt���m�zda array imiz kal�c� olarak de�i�ir
		System.out.println(Arrays.toString(isimler));//[ay�eg�l,emine,hacer,kutlu,murat]
		System.out.println(Arrays.binarySearch(isimler,"murat"));//4
		
		System.out.println(Arrays.binarySearch(isimler,"zeliha"));//-6
	}

}
