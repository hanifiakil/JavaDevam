package day48_meps_THE_END;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// verilen map te istenen proğramlama dilini bilen kişileri
		//list olarak döndüren bir method yazınız
		//101=ali, can, java, 102=veli, yan, java, 103=ali, yan, c#
		//istenen dil java
		
		
		Map<Integer,String> soruMap=MapOluştur.myMap();
		
		String istenendil="java";
		
		System.out.println(dilBilenListesiOluştur(soruMap,istenendil));

	}

	private static List<String> dilBilenListesiOluştur(Map<Integer, String> soruMap, String istenendil) {
		
		List<String> dilBilenListesi=new ArrayList<>();
		//101=ali, can, java, 102=veli, yan, java, 103=ali, yan, c#
		//istenen dil java
		
		soruMap.values();//bana collection döndürüyor 
		List<String> valueList=new ArrayList<>(soruMap.values());
		
		//valueList==>eleman sayısı 3  [ali, can, java, veli, yan, java, ali, yan, c#]
		//bu üç elemanı tek tek ele alıp split ile bölüp
		//dil değeri verilen input a eşit olanların
		//isim değerlerini dilBilenListesi ne ekleyeceğim
		
		String parçalıArray[]=new String[3];
		for (String each : valueList) {
			
			parçalıArray=each.split(", ");//[ali, can, java] şeklinde 3 elemanlı bir array getirecek
			
			if(parçalıArray[2].equalsIgnoreCase(istenendil)) {
				dilBilenListesi.add(parçalıArray[0]);
			}
			
		}
		 
		
		return dilBilenListesi;
		
	}

}
