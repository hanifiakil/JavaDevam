package day32_varargs_StringBuilder;

public class C02_varargs {

	public static void main(String[] args) {
		
		topla(5,8,10,12);

	}

	private static void topla(int ...say�lar) {
		int toplam=0;
		
		for (int each: say�lar) {
			
			toplam+=each;
			
		}
		System.out.println("girilen say�lar�n toplam� : " + toplam);
		
	}

}
