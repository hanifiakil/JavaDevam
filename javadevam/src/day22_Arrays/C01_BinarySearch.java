package day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		String isimler []= {"hacer","ayþegül","emine","murat","kutlu"};
		//isimler array inde isim var mý
		//array da arama yapmadan önce sýralama yapmalýyýz
		Arrays.sort(isimler);//arrays class ý sort yaptýðýmýzda array imiz kalýcý olarak deðiþir
		System.out.println(Arrays.toString(isimler));//[ayþegül,emine,hacer,kutlu,murat]
		System.out.println(Arrays.binarySearch(isimler,"murat"));//4
		
		System.out.println(Arrays.binarySearch(isimler,"zeliha"));//-6
	}

}
