package day46_collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class C02_RetainAll {

	public static void main(String[] args) {
		Set<String> lhs1=new LinkedHashSet<>();
		
		lhs1.add("ali");
		lhs1.add("mehmet ali");
		lhs1.add("can");
		lhs1.add("ali can");
		
Set<String> lhs2=new LinkedHashSet<>();
		
		lhs2.add("ali");
		lhs2.add("mehmet ali");
		lhs2.add("filiz");
		
		System.out.println(lhs1.retainAll(lhs2));//true
		
		System.out.println(lhs1);//[ali, mehmet ali]
		System.out.println(lhs2);//[ali, mehmet ali, filiz]
		
		
		

	}

}
