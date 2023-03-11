package day26_forEachloop_constructor;

public class C02_forEachloop {

	public static void main(String[] args) {
		// bir ýnteger array oluþturunuz ve bu array deki tüm sayýlarýn çarpýmýný
		//for-each loop kullanarak bulunuz sonucu ekrana yazdýrýnýz.
		int arr[]= {2,5,6,8,4,2,3};
		
		int çarpým=1;
		
		for (int each : arr) {
			
			çarpým*=each;
			
		}
System.out.println("array in elemanlarýnýn çarpýmý : " + çarpým);
	}

}
