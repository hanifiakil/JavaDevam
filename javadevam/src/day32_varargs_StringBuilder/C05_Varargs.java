package day32_varargs_StringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
		topla(5,8,10,12);
//varargs dan önce farklý parametreler kullanýlabilir
		//ama Varargs dan sonra parametre yazýlamaz
		//yazarsanýz java varargs son parametre olmalýdýr diye sizi uyarýr
		//ve CTE verir
	}

	private static void topla(int ...sayýlar) {
		int toplam=0;
		
		for (int each: sayýlar) {
			
			toplam+=each;
			
		}
		System.out.println("girilen sayýlarýn toplamý : " + toplam);
		
	}

	}


