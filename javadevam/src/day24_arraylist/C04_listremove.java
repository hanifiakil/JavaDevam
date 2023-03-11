package day24_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C04_listremove {

	public static void main(String[] args) {
		List<String> harfler=new ArrayList<>();
		harfler.add("a");
		harfler.add("k");
		harfler.add("�");
		harfler.add("l");
		System.out.println(harfler);//[a, k, �, l]
		
		harfler.remove(1);//bu sat�r gidip 1. index indeki eleman� remove eder
		                  //ve (delil olarak) remove etti�i eleman� bize getirir
		
		//listenin kalan�n� g�rmek i�in listeyi yazd�rabilirsiniz
		System.out.println(harfler);//[a, �, l]
		
		harfler.remove("�");//gidip harfi bulur ve true olarak d�n�� yapar
		System.out.println(harfler);//ve kalan�n� yazd�r�r
		System.out.println(harfler.remove("b"));//olmayan harfte de false olarak d�n�� yapar yazd�r�l�rsa
		System.out.println(harfler);//en son kalanlar� yazd�r�r bize
		
		harfler.add("k");
		harfler.add("�");
		List<String> silinecekharfler=new ArrayList<>();
		silinecekharfler.add("a");
		silinecekharfler.add("b");
		silinecekharfler.add("c");
		
		System.out.println(harfler.removeAll(silinecekharfler));//true olarak d�ner ��nk� silinecek 
		//elemanlar bulundu�u anlam�na gelir
		System.out.println(harfler);//[l, k, �] olarak son halini al�r
		
		
	}

}
