package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		
		//ba�tan da sondan da ekleme ��karma yap�labilir
		Deque<String> �iftba�l�=new LinkedList<>();
		
		�iftba�l�.add("y�ld�z");
		�iftba�l�.add("ali");
		
		System.out.println(�iftba�l�);//[y�ld�z, ali] Queue den gelen �zellik
		
		�iftba�l�.addLast("emine");
		
		System.out.println(�iftba�l�);//Deque den gelen �zellik sona eklenir [y�ld�z, ali, emine]
		
		System.out.println(�iftba�l�.pop());//y�ld�z siler ve bize d�nd�r�r
		
		System.out.println(�iftba�l�);//[ali, emine]
		
		�iftba�l�.push("seyfullah");
		
		System.out.println(�iftba�l�);//[seyfullah, ali, emine]


	}

}
