package day32_varargs_StringBuilder;

public class C04_varargs {

	public static void main(String[] args) {
		kafanagöreiþlem(5,8,10,12);

		//Varargs da hiç eleman olmasada java itiraz etmez
		//önce int olarak tanýmlanan sayýlarý eþleþtirir
		//kalan tüm sayýlarý varargs a döndürür
	}

	private static void kafanagöreiþlem(int sayý1,int sayý2,int sayý3,int ...sayýlar) {
		int toplam=0;
		
		for (int each: sayýlar) {
			
			toplam+=each;
			
		}
		System.out.println("girilen sayýlarýn toplamý : " + toplam);
		
	}
	}


