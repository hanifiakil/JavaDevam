package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		
		//baþtan da sondan da ekleme çýkarma yapýlabilir
		Deque<String> çiftbaþlý=new LinkedList<>();
		
		çiftbaþlý.add("yýldýz");
		çiftbaþlý.add("ali");
		
		System.out.println(çiftbaþlý);//[yýldýz, ali] Queue den gelen özellik
		
		çiftbaþlý.addLast("emine");
		
		System.out.println(çiftbaþlý);//Deque den gelen özellik sona eklenir [yýldýz, ali, emine]
		
		System.out.println(çiftbaþlý.pop());//yýldýz siler ve bize döndürür
		
		System.out.println(çiftbaþlý);//[ali, emine]
		
		çiftbaþlý.push("seyfullah");
		
		System.out.println(çiftbaþlý);//[seyfullah, ali, emine]


	}

}
