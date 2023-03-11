package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list olu�tural�m
		//sonra list elemanlar�n� de�i�tir metod u yaz�p oradan
		//list elemanlar�ndan baz�lar�n� de�i�tirelim 
		//method void olsun main method a d�nd�kten sonra yeniden list i yazd�ral�m
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("a");
		harfler.add("b");
		harfler.add("c");
		
		
		
		ListElemanlarde�i�tir(harfler);
		System.out.println("main metod a d�n�nce List : " + harfler);
		
		        //java da List ve Array gibi objeler i�in de pass By Value ge�erlidir
				//yani farkl� bir method da array veya List e yeni de�er atamas� yaparsan�z
				//orjinal array veya List de�i�mez
		
		Listde�i�tir(harfler);//metod a yeni de�er atad���m halde harfler listesi de�i�medi
		
		System.out.println("List e yeni List atad�ktan sonraki main method a d�n�nce List : "+ harfler);
	}

	private static void Listde�i�tir(List<String> harfler) {
		harfler=new ArrayList<>();
		
		System.out.println("List e yeni List atad�ktan sonraki de�i�im"+ harfler);
		
	}

	private static void ListElemanlarde�i�tir(List<String> harfler) {

		harfler.set(0,"h");
		
		System.out.println("metod i�erisin de yap�lan List de�i�imi : " + harfler);
		
	}

}
