package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {
	public static void main(String[] args) throws FileNotFoundException {
		//java da bir dosyaya ula�mak istedi�imizde FileInputStream class �ndan yard�m al�r�z
		//
		
		FileInputStream fis=new FileInputStream("src\\day40\\yaz�.txd");
		//java bu kodda olas� bir problem �ng�r�yor
		//ve bu probleme kar�� ne yapmas� gerekti�ini bize soruyor
		//(yani alt� �izilen her kod CTE de�ildir)
		
		/*bunun i�in iki durum s�zkonusu
		 * 1- try catch kullanarak bu problemi HANDLE edip java n�n yoluna devam etmesini sa�layabiliriz
		 * 2- e�er dosya okunam�yorsa kod �al��mas�n� istiyorsak olay�n fark�nda oldu�umuzu
		 * ve sorumlulu�un bizde oldu�unu java ya s�ylemeliyiz */
		
		System.out.println("g�rev tamamland�");
	}

}
