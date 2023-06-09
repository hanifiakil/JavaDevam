package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
     List<Integer> ll=new LinkedList<>();
		
		System.out.println(ll);
		
		ll.add(5);
		ll.add(7);
		System.out.println(ll);//[5, 7]

		ll.add(9);//data t�r�n� List se�ti�imiz i�in sadece List interface indeki metodlar� kullanabiliriz
		//LinkedList class �nda override etti�imiz i�in
		//List interface olmas�na ra�men List method lar�n� kullanabildik
		
Queue<Integer> ll2=new LinkedList<>();
		
		System.out.println(ll);
		
		ll2.add(5);
		ll2.add(7);
		ll2.clear();//data t�r� queue se�ilince queue interface inden gelen method lar� kullanabildik
		
Deque<Integer> ll3=new LinkedList<>();
		
		System.out.println(ll);
		
		ll3.add(5);
		ll3.add(7);
	ll3.addLast(9);


		
	}

}
