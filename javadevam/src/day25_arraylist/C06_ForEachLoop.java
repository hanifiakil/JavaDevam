package day25_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile hiç uðraþmadan bir array veya listedeki tüm elemanlarý
		//gözden geçirmek isteriz
		
		int arr[]= {1,2,3,5,3,2,7};
		
		//bu array ý esnek bir list yapmak istiyorum
		
		List<Integer> yeniList=new ArrayList<>();
		/*for (int i = 0; i < arr.length; i++) {
			yeniList.add(i);	
		}System.out.println(yeniList);*/
		
		for (int each: arr) {// arr deki her bir (each) int bana getir
			
			yeniList.add(each);
		}
		System.out.println("forEachLoop ile : " + yeniList);
		
		//eðer bir list veya array in tüm elemanlarýný elden geçirmek istiyorsak
		//ve sýralama önemli deðilse for-each loop kullanýrýz
		
		
	}

}
