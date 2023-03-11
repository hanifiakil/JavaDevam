package day24_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C04_listremove {

	public static void main(String[] args) {
		List<String> harfler=new ArrayList<>();
		harfler.add("a");
		harfler.add("k");
		harfler.add("ý");
		harfler.add("l");
		System.out.println(harfler);//[a, k, ý, l]
		
		harfler.remove(1);//bu satýr gidip 1. index indeki elemaný remove eder
		                  //ve (delil olarak) remove ettiði elemaný bize getirir
		
		//listenin kalanýný görmek için listeyi yazdýrabilirsiniz
		System.out.println(harfler);//[a, ý, l]
		
		harfler.remove("ý");//gidip harfi bulur ve true olarak dönüþ yapar
		System.out.println(harfler);//ve kalanýný yazdýrýr
		System.out.println(harfler.remove("b"));//olmayan harfte de false olarak dönüþ yapar yazdýrýlýrsa
		System.out.println(harfler);//en son kalanlarý yazdýrýr bize
		
		harfler.add("k");
		harfler.add("ý");
		List<String> silinecekharfler=new ArrayList<>();
		silinecekharfler.add("a");
		silinecekharfler.add("b");
		silinecekharfler.add("c");
		
		System.out.println(harfler.removeAll(silinecekharfler));//true olarak döner çünkü silinecek 
		//elemanlar bulunduðu anlamýna gelir
		System.out.println(harfler);//[l, k, ý] olarak son halini alýr
		
		
	}

}
