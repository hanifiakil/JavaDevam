package day48_meps_THE_END;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// verilen map te istenen proðramlama dilini bilen kiþileri
		//list olarak döndüren bir method yazýnýz
		//101=ali, can, java, 102=veli, yan, java, 103=ali, yan, c#
		//istenen dil java
		
		
		Map<Integer,String> soruMap=MapOluþtur.myMap();
		
		String istenendil="java";
		
		System.out.println(dilBilenListesiOluþtur(soruMap,istenendil));

	}

	private static List<String> dilBilenListesiOluþtur(Map<Integer, String> soruMap, String istenendil) {
		
		List<String> dilBilenListesi=new ArrayList<>();
		//101=ali, can, java, 102=veli, yan, java, 103=ali, yan, c#
		//istenen dil java
		
		soruMap.values();//bana collection döndürüyor 
		List<String> valueList=new ArrayList<>(soruMap.values());
		
		//valueList==>eleman sayýsý 3  [ali, can, java, veli, yan, java, ali, yan, c#]
		//bu üç elemaný tek tek ele alýp split ile bölüp
		//dil deðeri verilen input a eþit olanlarýn
		//isim deðerlerini dilBilenListesi ne ekleyeceðim
		
		String parçalýArray[]=new String[3];
		for (String each : valueList) {
			
			parçalýArray=each.split(", ");//[ali, can, java] þeklinde 3 elemanlý bir array getirecek
			
			if(parçalýArray[2].equalsIgnoreCase(istenendil)) {
				dilBilenListesi.add(parçalýArray[0]);
			}
			
		}
		 
		
		return dilBilenListesi;
		
	}

}
