package day48_meps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		//verilen bir string teki harfleri ve harflerin kaçar kez
		//kullanıldığını return eden bir method yazınız
		
		String imput="hellooo";
		
		Map<String,Integer> mainMap=harfsay(imput);

		System.out.println(mainMap);
	}

	private static Map<String,Integer> harfsay(String imput) {
		
		Map<String,Integer> harfsayılarıMap=new HashMap<>();
		
		String imputArr[]=imput.split("");//[h, e, l, l, o, o, o]
		
		for (String each : imputArr) {
			if (!harfsayılarıMap.containsKey(each)) {
				harfsayılarıMap.put(each, 1);
			} else {
				//harfsayılarıMap.get(each)1  bu girilen harf in value sunu bulup 1 artırır
				harfsayılarıMap.put(each, harfsayılarıMap.get(each)+1);

			}
			
		}
	return harfsayılarıMap;
	}

}
