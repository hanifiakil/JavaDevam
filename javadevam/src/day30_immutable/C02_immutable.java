package day30_immutable;

public class C02_immutable {

	public static void main(String[] args) {
		String str ="ali";
		
		for (int i = 0; i <100; i++) {
			str+=" ";
		}

		//bu jod �al��t���n da java ka� obje olu�turur ?
		//1 bje ba�ta olu�turuldu
		//loop ta ise 100 obje daha olu�turuldu
		//dolay�s�yla bu kod �al��t���n da biz ekranda hi�bir�ey g�rmesek te 101 tane obje olu�turulmu�tur
	}

}
