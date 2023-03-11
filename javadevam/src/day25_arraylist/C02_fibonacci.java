package day25_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C02_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sýnýr=100;
		List<Integer> fibonacci=new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		int sayý=0;
		
		while (sayý<sýnýr) {
			sayý=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			if (sayý<sýnýr) {
				fibonacci.add(sayý);
				
			}
			
		}
System.out.println(fibonacci);
	}

}
