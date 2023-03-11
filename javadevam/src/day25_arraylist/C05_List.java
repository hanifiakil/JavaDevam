package day25_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// verilen bir listede için de belirli bir harf olan elemanlarý
		//silen bir metod yazýnýz
		
		List<String> str=new ArrayList<>();
		str.add("ceyhun");
		str.add("yýldýz");
		str.add("mustafa");
		str.add("tugba");
		str.add("turgut");
		
		
		
		String silinecekharf="a";
		str=killThemAll(str,silinecekharf);
		System.out.println(str);

	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {
		
		for (int i = 0; i < str.size(); i++) {
			
			if (str.get(i).contains(silinecekharf)) {
				str.remove(i);
				i--;
				
				
			}
			
		}
		

		return str;
		
	}

}
