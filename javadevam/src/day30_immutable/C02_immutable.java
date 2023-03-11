package day30_immutable;

public class C02_immutable {

	public static void main(String[] args) {
		String str ="ali";
		
		for (int i = 0; i <100; i++) {
			str+=" ";
		}

		//bu jod çalýþtýðýn da java kaç obje oluþturur ?
		//1 bje baþta oluþturuldu
		//loop ta ise 100 obje daha oluþturuldu
		//dolayýsýyla bu kod çalýþtýðýn da biz ekranda hiçbirþey görmesek te 101 tane obje oluþturulmuþtur
	}

}
