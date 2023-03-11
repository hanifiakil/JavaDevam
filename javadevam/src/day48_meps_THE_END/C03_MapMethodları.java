package day48_meps_THE_END;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlar� {

	public static void main(String[] args) {
		
		Map<Integer,String> �rnek=MapOlu�tur.myMap();
		System.out.println(�rnek);
		
		System.out.println(�rnek.containsKey(110));//false
		System.out.println(�rnek.containsValue("java"));//false
		System.out.println(�rnek.containsValue("ali, can, java"));//true
		Set<Entry<Integer,String>> entrySet=�rnek.entrySet();
		
		int saya�=1;
		
		for (Entry<Integer, String> each : entrySet) {
			
			System.out.println(saya�+".entry : " + each);
			saya�++;	
		}
		System.out.println(�rnek.getOrDefault(110, "girilen key map te yok"));//girilen key map te yok
		System.out.println(�rnek.getOrDefault(103, "girilen key map te yok"));//ali, yan, c#
		
		�rnek.putIfAbsent(103, "ali, yan, java");//eklemeyecek key ayn� ise eklemez
		�rnek.putIfAbsent(110, "fikri, yan, qa");//ekleyecek
		
		saya�=1;
		for (Entry<Integer, String> each : entrySet) {
			
			System.out.println(saya�+".entry : " + each);
			saya�++;	
		}
		String maptenString=�rnek.toString();
		System.out.println(maptenString);
		//{101=ali, can, java, 102=veli, yan, java, 103=ali, yan, c#, 104=bali, yan, c#, 105=halil, yan, java, 106=ali, ayan, c#, 110=fikri, yan, qa}

		
		

	}

}
