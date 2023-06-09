package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list oluşturalım
		//sonra list elemanlarını değiştir metod u yazıp oradan
		//list elemanlarından bazılarını değiştirelim 
		//method void olsun main method a döndükten sonra yeniden list i yazdıralım
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("a");
		harfler.add("b");
		harfler.add("c");
		
		
		
		ListElemanlardeğiştir(harfler);
		System.out.println("main metod a dönünce List : " + harfler);
		
		        //java da List ve Array gibi objeler için de pass By Value geçerlidir
				//yani farklı bir method da array veya List e yeni değer ataması yaparsanız
				//orjinal array veya List değişmez
		
		Listdeğiştir(harfler);//metod a yeni değer atadığım halde harfler listesi değişmedi
		
		System.out.println("List e yeni List atadıktan sonraki main method a dönünce List : "+ harfler);
	}

	private static void Listdeğiştir(List<String> harfler) {
		harfler=new ArrayList<>();
		
		System.out.println("List e yeni List atadıktan sonraki değişim"+ harfler);
		
	}

	private static void ListElemanlardeğiştir(List<String> harfler) {

		harfler.set(0,"h");
		
		System.out.println("metod içerisin de yapılan List değişimi : " + harfler);
		
	}

}
