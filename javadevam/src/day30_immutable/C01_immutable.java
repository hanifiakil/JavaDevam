package day30_immutable;

import java.util.ArrayList;
import java.util.List;

public class C01_immutable {

	public static void main(String[] args) {
		// String immutable bir class iken List mutable dýr
		
		String str="ali";// burada deðiþmedi
		str.toUpperCase();//str ==> ALÝ
		System.out.println(str);//ali
		System.out.println(str.toUpperCase());//ALÝ
		
		List<String> isimler=new ArrayList<>();// burada deðiþti
		System.out.println(isimler);//[]
		
		isimler.add("ali");
		
		System.out.println(isimler);//[ali]
		isimler.set(0,"veli");
		
		System.out.println(isimler);//[veli]
	}

}
