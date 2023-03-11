package day48_meps_THE_END;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlarý {

	public static void main(String[] args) {
		
		Map<Integer,String> örnek=MapOluþtur.myMap();
		System.out.println(örnek);
		
		System.out.println(örnek.containsKey(110));//false
		System.out.println(örnek.containsValue("java"));//false
		System.out.println(örnek.containsValue("ali, can, java"));//true
		Set<Entry<Integer,String>> entrySet=örnek.entrySet();
		
		int sayaç=1;
		
		for (Entry<Integer, String> each : entrySet) {
			
			System.out.println(sayaç+".entry : " + each);
			sayaç++;	
		}
		System.out.println(örnek.getOrDefault(110, "girilen key map te yok"));//girilen key map te yok
		System.out.println(örnek.getOrDefault(103, "girilen key map te yok"));//ali, yan, c#
		
		örnek.putIfAbsent(103, "ali, yan, java");//eklemeyecek key ayný ise eklemez
		örnek.putIfAbsent(110, "fikri, yan, qa");//ekleyecek
		
		sayaç=1;
		for (Entry<Integer, String> each : entrySet) {
			
			System.out.println(sayaç+".entry : " + each);
			sayaç++;	
		}
		String maptenString=örnek.toString();
		System.out.println(maptenString);
		//{101=ali, can, java, 102=veli, yan, java, 103=ali, yan, c#, 104=bali, yan, c#, 105=halil, yan, java, 106=ali, ayan, c#, 110=fikri, yan, qa}

		
		

	}

}
