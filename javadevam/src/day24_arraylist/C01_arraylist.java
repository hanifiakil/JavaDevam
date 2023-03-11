package day24_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C01_arraylist {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// list oluþturalým
		List<String> isimlist =new ArrayList<>();
		
		List<String> isimlist2 =new ArrayList<String>();
		//bazen eþitliðin sað tarafýndaki elmas içine data türü yazýlmazsa sorun çýkabiliyor
		//ama genelde sorun çýkmaz, biz de list oluþtururken sað tarafta data türü yazmayýz
		
		//List<String> isimlist3 = new List<>();
		//eþitliðin sað tarafýnda List<>() yazamayýz
		List<Integer> sayýlar = new ArrayList<>();
		//List data türü olarak primitive leri kabul etmez
		
		List<Boolean> cevaplar = new ArrayList<>();
		

	}

}
