package day25_arraylist;

import java.util.Arrays;
import java.util.List;

public class C04_arraysAsList {

	public static void main(String[] args) {
		// verilen array i Arrays class ýndan yardým alarak list e çevirin
		String arr[]= {"a","b","c","f"};
		
		List<String> arraydenList=Arrays.asList(arr);
		
		System.out.println(arraydenList);
		
		//arraydenList.add("f"); //hata verir çünkü bu dönüþüm de her özelliðini kullanamýyoruz
		

	}

}
