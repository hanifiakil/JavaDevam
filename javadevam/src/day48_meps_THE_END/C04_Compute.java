package day48_meps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C04_Compute {

	public static void main(String[] args) {
		
		Map<String,Integer> �rnek=new HashMap<>();
		
		�rnek.put("a", 2);
		�rnek.put("b", 5);
		�rnek.put("c", 1);
		�rnek.put("z", 3);
		�rnek.put("k", 10);
		
		System.out.println(�rnek);//{a=2, b=5, c=1, z=3, k=10}
		
		�rnek.compute("a", (key,value) -> 2*value+5);// 2 ile �arp�p 5 ile toplad� value de�erini
		
		System.out.println(�rnek);//{a=9, b=5, c=1, z=3, k=10}
		
		�rnek.computeIfAbsent("d", v->20);
		�rnek.computeIfAbsent("c", v->11);// c var oldu�u i�in de�i�tirmiyor
		�rnek.computeIfAbsent("l",k->12);//k de yazsak value olarak atar
		System.out.println(�rnek);//{a=9, b=5, c=1, d=20, z=3, k=10, l=12}
		
		�rnek.computeIfPresent("l",(key,value) -> 2*value+5);//l yi 29 olarak de�i�tirdi
		System.out.println(�rnek);//{a=9, b=5, c=1, d=20, z=3, k=10, l=29}
		

	}

}
