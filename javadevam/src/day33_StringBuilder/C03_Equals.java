package day33_StringBuilder;

public class C03_Equals {

	public static void main(String[] args) {
	
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");
		
		System.out.println(sb1==sb2);// false
		
		System.out.println(sb1.equals(sb2));//false
		//sb da equals method u String deki mantýkla çalýþmaz, == mantýðý ile çalýþýr
		
		System.out.println(sb1.compareTo(sb2));//0
		/*ilk harflerden baþlayarak bire bir sb larý karþýlaþtýrýr
		 * eðer tüm karakterler ayný ise sonuç olarak 0 döner
		 * farklý karakterler bulursa  ilk yazýlan sb ikinci yazýlandan kaç char önde onu döner
		 * eðer iki sb in eþit olup olmadýðýný anlamak istersek
		 * if (sb1.compareTo(sb2)==0) ile bakabiliriz
		 */

	}

}
