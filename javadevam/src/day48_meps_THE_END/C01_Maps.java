package day48_meps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		//verilen bir string teki harfleri ve harflerin ka�ar kez
		//kullan�ld���n� return eden bir method yaz�n�z
		
		String imput="hellooo";
		
		Map<String,Integer> mainMap=harfsay(imput);

		System.out.println(mainMap);
	}

	private static Map<String,Integer> harfsay(String imput) {
		
		Map<String,Integer> harfsay�lar�Map=new HashMap<>();
		
		String imputArr[]=imput.split("");//[h, e, l, l, o, o, o]
		
		for (String each : imputArr) {
			if (!harfsay�lar�Map.containsKey(each)) {
				harfsay�lar�Map.put(each, 1);
			} else {
				//harfsay�lar�Map.get(each)1  bu girilen harf in value sunu bulup 1 art�r�r
				harfsay�lar�Map.put(each, harfsay�lar�Map.get(each)+1);

			}
			
		}
	return harfsay�lar�Map;
	}

}
