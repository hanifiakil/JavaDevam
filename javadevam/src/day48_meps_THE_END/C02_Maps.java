package day48_meps_THE_END;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// verilen map te istenen pro�ramlama dilini bilen ki�ileri
		//list olarak d�nd�ren bir method yaz�n�z
		//101=ali, can, java, 102=veli, yan, java, 103=ali, yan, c#
		//istenen dil java
		
		
		Map<Integer,String> soruMap=MapOlu�tur.myMap();
		
		String istenendil="java";
		
		System.out.println(dilBilenListesiOlu�tur(soruMap,istenendil));

	}

	private static List<String> dilBilenListesiOlu�tur(Map<Integer, String> soruMap, String istenendil) {
		
		List<String> dilBilenListesi=new ArrayList<>();
		//101=ali, can, java, 102=veli, yan, java, 103=ali, yan, c#
		//istenen dil java
		
		soruMap.values();//bana collection d�nd�r�yor 
		List<String> valueList=new ArrayList<>(soruMap.values());
		
		//valueList==>eleman say�s� 3  [ali, can, java, veli, yan, java, ali, yan, c#]
		//bu �� eleman� tek tek ele al�p split ile b�l�p
		//dil de�eri verilen input a e�it olanlar�n
		//isim de�erlerini dilBilenListesi ne ekleyece�im
		
		String par�al�Array[]=new String[3];
		for (String each : valueList) {
			
			par�al�Array=each.split(", ");//[ali, can, java] �eklinde 3 elemanl� bir array getirecek
			
			if(par�al�Array[2].equalsIgnoreCase(istenendil)) {
				dilBilenListesi.add(par�al�Array[0]);
			}
			
		}
		 
		
		return dilBilenListesi;
		
	}

}
