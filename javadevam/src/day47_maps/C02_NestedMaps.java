package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
		//içiçe mep oluþturacaksak en içerdekinden baþlamanýz tavsiye olunur
		
		Map<String,String> ogr1map=new HashMap<>();
		
		ogr1map.put("isim","ali");
		ogr1map.put("soyisim","can");
		ogr1map.put("brans","j.dev");
		
Map<String,String> ogr2map=new HashMap<>();
		
		ogr2map.put("isim","veli");
		ogr2map.put("soyisim","yan");
		ogr2map.put("brans","qa");
		
Map<String,String> ogr3map=new HashMap<>();
		
		ogr3map.put("isim","ali");
		ogr3map.put("soyisim","yan");
		ogr3map.put("brans","c#");
		
Map<String,String> ogr4map=new HashMap<>();
		
		ogr4map.put("isim","ayþe");
		ogr4map.put("soyisim","can");
		ogr4map.put("brans","qa");
		
		System.out.println("1.öðrenci : " + ogr1map);
		System.out.println("2.öðrenci : " + ogr2map);
		System.out.println("3.öðrenci : " + ogr3map);
		System.out.println("4.öðrenci : " + ogr4map);

		
		Map<Integer, Map<String, String>> sýnýfMap=new HashMap<>();
		
		sýnýfMap.put(101, ogr1map);
		sýnýfMap.put(102, ogr2map);
		sýnýfMap.put(103, ogr3map);
		sýnýfMap.put(104, ogr4map);
		
		System.out.println(sýnýfMap);
		/*{
		 * 101={soyisim=can, brans=j.dev, isim=ali}, 
		 * 102={soyisim=yan, brans=qa, isim=veli}, 
		 * 103={soyisim=yan, brans=c#, isim=ali}, 
		 * 104={soyisim=can, brans=qa, isim=ayþe}}
		 */
		

	}

}
