package day48_meps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class MapOluştur {
	
	public static Map<Integer,String> myMap(){
		
		Map<Integer,String> örnekMap=new HashMap<>();
		
		//101=ali, can, java, 102=veli, yan, java, 103=ali, yan, c#
		
		örnekMap.put(101, "ali, can, java");
		örnekMap.put(102, "veli, yan, java");
		örnekMap.put(103, "ali, yan, c#");
		örnekMap.put(104, "bali, yan, c#");
		örnekMap.put(105, "halil, yan, java");
		örnekMap.put(106, "ali, ayan, c#");
		return örnekMap;
	}

}
