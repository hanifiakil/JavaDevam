package day32_varargs_StringBuilder;

public class C03_varargs {

	public static void main(String[] args) {
		kafanag�retopla(5,8,10,12);

	}

	private static void kafanag�retopla(int say�1,int ...say�lar) {
		int toplam=0;
		
		for (int each: say�lar) {
			
			toplam+=each;
			
		}
		System.out.println("girilen say�1 ile di�ersay�lar�n toplam�n�n �arp�m� : " + say�1*toplam);
		
	}

	}


