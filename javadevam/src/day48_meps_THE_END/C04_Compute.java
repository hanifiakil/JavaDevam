package day48_meps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C04_Compute {

	public static void main(String[] args) {
		
		Map<String,Integer> örnek=new HashMap<>();
		
		örnek.put("a", 2);
		örnek.put("b", 5);
		örnek.put("c", 1);
		örnek.put("z", 3);
		örnek.put("k", 10);
		
		System.out.println(örnek);//{a=2, b=5, c=1, z=3, k=10}
		
		örnek.compute("a", (key,value) -> 2*value+5);// 2 ile çarpýp 5 ile topladý value deðerini
		
		System.out.println(örnek);//{a=9, b=5, c=1, z=3, k=10}
		
		örnek.computeIfAbsent("d", v->20);
		örnek.computeIfAbsent("c", v->11);// c var olduðu için deðiþtirmiyor
		örnek.computeIfAbsent("l",k->12);//k de yazsak value olarak atar
		System.out.println(örnek);//{a=9, b=5, c=1, d=20, z=3, k=10, l=12}
		
		örnek.computeIfPresent("l",(key,value) -> 2*value+5);//l yi 29 olarak deðiþtirdi
		System.out.println(örnek);//{a=9, b=5, c=1, d=20, z=3, k=10, l=29}
		

	}

}
