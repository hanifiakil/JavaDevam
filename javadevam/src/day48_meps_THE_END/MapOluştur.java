package day48_meps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class MapOlu�tur {
	
	public static Map<Integer,String> myMap(){
		
		Map<Integer,String> �rnekMap=new HashMap<>();
		
		//101=ali, can, java, 102=veli, yan, java, 103=ali, yan, c#
		
		�rnekMap.put(101, "ali, can, java");
		�rnekMap.put(102, "veli, yan, java");
		�rnekMap.put(103, "ali, yan, c#");
		�rnekMap.put(104, "bali, yan, c#");
		�rnekMap.put(105, "halil, yan, java");
		�rnekMap.put(106, "ali, ayan, c#");
		return �rnekMap;
	}

}
