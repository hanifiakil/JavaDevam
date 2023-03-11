package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {
	public static void main(String[] args) throws FileNotFoundException {
		//java da bir dosyaya ulaþmak istediðimizde FileInputStream class ýndan yardým alýrýz
		//
		
		FileInputStream fis=new FileInputStream("src\\day40\\yazý.txd");
		//java bu kodda olasý bir problem öngörüyor
		//ve bu probleme karþý ne yapmasý gerektiðini bize soruyor
		//(yani altý çizilen her kod CTE deðildir)
		
		/*bunun için iki durum sözkonusu
		 * 1- try catch kullanarak bu problemi HANDLE edip java nýn yoluna devam etmesini saðlayabiliriz
		 * 2- eðer dosya okunamýyorsa kod çalýþmasýný istiyorsak olayýn farkýnda olduðumuzu
		 * ve sorumluluðun bizde olduðunu java ya söylemeliyiz */
		
		System.out.println("görev tamamlandý");
	}

}
