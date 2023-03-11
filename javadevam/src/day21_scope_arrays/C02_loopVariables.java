package day21_scope_arrays;

public class C02_loopVariables {

	public static void main(String[] args) {
		int sayý=10;
		for (int i = 0; i < 6; i++) {
			String isim="ali";
			System.out.println(sayý + " " + isim);	
		}
//System.out.println(isim); for loop un için de bulunan loopVariables diðer kýsýmlardan görülmez
	}

}
