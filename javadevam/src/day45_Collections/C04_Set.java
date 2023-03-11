package day45_Collections;

import java.util.HashSet;
import java.util.Set;

public class C04_Set {

	public static void main(String[] args) {
		Set<Object> s1=new HashSet<>();
		
		s1.add(4);
		s1.add(7);
		s1.add(11);
		
		System.out.println(s1);//[4, 7, 11]
		
		s1.add("java candýr");
		
		System.out.println(s1);//[4, 7, java candýr, 11]


	}

}
