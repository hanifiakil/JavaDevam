package day25_arraylist;

import java.util.Arrays;
import java.util.List;

public class C04_arraysAsList {

	public static void main(String[] args) {
		// verilen array i Arrays class �ndan yard�m alarak list e �evirin
		String arr[]= {"a","b","c","f"};
		
		List<String> arraydenList=Arrays.asList(arr);
		
		System.out.println(arraydenList);
		
		//arraydenList.add("f"); //hata verir ��nk� bu d�n���m de her �zelli�ini kullanam�yoruz
		

	}

}
