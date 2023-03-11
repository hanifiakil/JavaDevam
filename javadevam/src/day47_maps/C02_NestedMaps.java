package day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
		//i�i�e mep olu�turacaksak en i�erdekinden ba�laman�z tavsiye olunur
		
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
		
		ogr4map.put("isim","ay�e");
		ogr4map.put("soyisim","can");
		ogr4map.put("brans","qa");
		
		System.out.println("1.��renci : " + ogr1map);
		System.out.println("2.��renci : " + ogr2map);
		System.out.println("3.��renci : " + ogr3map);
		System.out.println("4.��renci : " + ogr4map);

		
		Map<Integer, Map<String, String>> s�n�fMap=new HashMap<>();
		
		s�n�fMap.put(101, ogr1map);
		s�n�fMap.put(102, ogr2map);
		s�n�fMap.put(103, ogr3map);
		s�n�fMap.put(104, ogr4map);
		
		System.out.println(s�n�fMap);
		/*{
		 * 101={soyisim=can, brans=j.dev, isim=ali}, 
		 * 102={soyisim=yan, brans=qa, isim=veli}, 
		 * 103={soyisim=yan, brans=c#, isim=ali}, 
		 * 104={soyisim=can, brans=qa, isim=ay�e}}
		 */
		

	}

}
