package day25_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C02_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s�n�r=100;
		List<Integer> fibonacci=new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		int say�=0;
		
		while (say�<s�n�r) {
			say�=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			if (say�<s�n�r) {
				fibonacci.add(say�);
				
			}
			
		}
System.out.println(fibonacci);
	}

}
