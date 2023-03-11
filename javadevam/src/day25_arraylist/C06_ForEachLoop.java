package day25_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile hi� u�ra�madan bir array veya listedeki t�m elemanlar�
		//g�zden ge�irmek isteriz
		
		int arr[]= {1,2,3,5,3,2,7};
		
		//bu array � esnek bir list yapmak istiyorum
		
		List<Integer> yeniList=new ArrayList<>();
		/*for (int i = 0; i < arr.length; i++) {
			yeniList.add(i);	
		}System.out.println(yeniList);*/
		
		for (int each: arr) {// arr deki her bir (each) int bana getir
			
			yeniList.add(each);
		}
		System.out.println("forEachLoop ile : " + yeniList);
		
		//e�er bir list veya array in t�m elemanlar�n� elden ge�irmek istiyorsak
		//ve s�ralama �nemli de�ilse for-each loop kullan�r�z
		
		
	}

}
