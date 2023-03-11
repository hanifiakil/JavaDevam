package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
		//verilen bir Array deki tekrar eden sayıları silip 
		//unique değerlerden oluşan bir array oluşturun
		
		int arr[]= {3,4,6,4,2,4,6,8,6,5,3,1,2,4,6,7};
		
		Set<Integer> benzersizSet=new HashSet<>();
		
		for (Integer each : arr) {
			benzersizSet.add(each);
		}
System.out.println(benzersizSet);


Object[] tekrarsızArr=benzersizSet.toArray();// set i array e çevirdik

System.out.println(Arrays.toString(tekrarsızArr));
	}

}
