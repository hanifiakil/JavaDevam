package day45_Collections;

import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {

	public static void main(String[] args) {
		
        LinkedList<Integer> ll=new LinkedList<>();
		
		System.out.println(ll);
		
		ll.add(5);
		ll.add(7);
		System.out.println(ll);//[5, 7]
		
		
		System.out.println(ll.peek());//silmeden ilk elemaný bana getirir
		System.out.println(ll.peekFirst());//silmeden ilk elemaný bana getirir
		
		 LinkedList<Integer> ll2=new LinkedList<>();
		 
		 System.out.println(ll2.peekFirst());//null deque den geliyor
		 System.out.println(ll2.peek());//null    queue den geliyor
		 
		 System.out.println(ll.element());//5
		// System.out.println(ll2.element());//java.util.NoSuchElementException

		 System.out.println(ll.poll());// 5 ilk elemaný siler ve sildiðini yazdýrýr
		 System.out.println(ll);//[7]
		 
		 System.out.println(ll.hashCode());//38  java verdiði hash kodu döndürür
		 
		 System.out.println(ll2.hashCode());//1
		 
		 System.out.println(ll2.offer(10));
		 System.out.println(ll2);
		 
		 ll2.push(2);//addFirst() ile aynýdýr
		 

	}

}
