package day32_varargs_StringBuilder;

public class C02_varargs {

	public static void main(String[] args) {
		
		topla(5,8,10,12);

	}

	private static void topla(int ...sayýlar) {
		int toplam=0;
		
		for (int each: sayýlar) {
			
			toplam+=each;
			
		}
		System.out.println("girilen sayýlarýn toplamý : " + toplam);
		
	}

}
