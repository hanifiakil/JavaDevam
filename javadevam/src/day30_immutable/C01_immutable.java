package day30_immutable;

import java.util.ArrayList;
import java.util.List;

public class C01_immutable {

	public static void main(String[] args) {
		// String immutable bir class iken List mutable d�r
		
		String str="ali";// burada de�i�medi
		str.toUpperCase();//str ==> AL�
		System.out.println(str);//ali
		System.out.println(str.toUpperCase());//AL�
		
		List<String> isimler=new ArrayList<>();// burada de�i�ti
		System.out.println(isimler);//[]
		
		isimler.add("ali");
		
		System.out.println(isimler);//[ali]
		isimler.set(0,"veli");
		
		System.out.println(isimler);//[veli]
	}

}
