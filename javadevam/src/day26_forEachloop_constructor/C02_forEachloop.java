package day26_forEachloop_constructor;

public class C02_forEachloop {

	public static void main(String[] args) {
		// bir �nteger array olu�turunuz ve bu array deki t�m say�lar�n �arp�m�n�
		//for-each loop kullanarak bulunuz sonucu ekrana yazd�r�n�z.
		int arr[]= {2,5,6,8,4,2,3};
		
		int �arp�m=1;
		
		for (int each : arr) {
			
			�arp�m*=each;
			
		}
System.out.println("array in elemanlar�n�n �arp�m� : " + �arp�m);
	}

}
