package day44_iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args) {
		
		List<Integer> liste=new ArrayList<>();
		
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		
		System.out.println(liste);
		
		//index kullanmadan t�m elemanlar� 3 eklenmi� olarak yazd�r�n
		
		for (Integer each : liste) {
			System.out.print(each+3 +" ");
		}
System.out.println();

System.out.println(liste);


for (Integer each : liste) {
	each+=3;
	System.out.print(each +" ");
}
System.out.println();

System.out.println(liste);

//foreach loop ile index kullanmadan t�m elementlere ula�abiliyoruz ama 
//kal�c� de�i�iklik yapam�yoruz
	}

}
