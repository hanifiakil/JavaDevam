package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list oluþturalým
		//sonra list elemanlarýný deðiþtir metod u yazýp oradan
		//list elemanlarýndan bazýlarýný deðiþtirelim 
		//method void olsun main method a döndükten sonra yeniden list i yazdýralým
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("a");
		harfler.add("b");
		harfler.add("c");
		
		
		
		ListElemanlardeðiþtir(harfler);
		System.out.println("main metod a dönünce List : " + harfler);
		
		        //java da List ve Array gibi objeler için de pass By Value geçerlidir
				//yani farklý bir method da array veya List e yeni deðer atamasý yaparsanýz
				//orjinal array veya List deðiþmez
		
		Listdeðiþtir(harfler);//metod a yeni deðer atadýðým halde harfler listesi deðiþmedi
		
		System.out.println("List e yeni List atadýktan sonraki main method a dönünce List : "+ harfler);
	}

	private static void Listdeðiþtir(List<String> harfler) {
		harfler=new ArrayList<>();
		
		System.out.println("List e yeni List atadýktan sonraki deðiþim"+ harfler);
		
	}

	private static void ListElemanlardeðiþtir(List<String> harfler) {

		harfler.set(0,"h");
		
		System.out.println("metod içerisin de yapýlan List deðiþimi : " + harfler);
		
	}

}
