package day32_varargs_StringBuilder;

public class C03_varargs {

	public static void main(String[] args) {
		kafanagöretopla(5,8,10,12);

	}

	private static void kafanagöretopla(int sayý1,int ...sayýlar) {
		int toplam=0;
		
		for (int each: sayýlar) {
			
			toplam+=each;
			
		}
		System.out.println("girilen sayý1 ile diðersayýlarýn toplamýnýn çarpýmý : " + sayý1*toplam);
		
	}

	}


