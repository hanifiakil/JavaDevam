package day29_staticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		// biz 100 tl ye sat�lan bir �r�n i�in 2 farkl� indirim uygulayan iki metod olu�tural�m
		
		int fiyat=100;
		
		indirimyap25(fiyat);
		
		System.out.println("method uyguland�ktan sonraki fiyat : " + fiyat);
		
		indirimyap10(fiyat);
		
		System.out.println("method uyguland�ktan sonraki fiyat : " + fiyat);
	}

	private static void indirimyap10(int fiyat) {
		fiyat*=0.90;
		
		System.out.println("%10 indirim yap�lm�� hali : " + fiyat);
		
	}

	private static void indirimyap25(int fiyat) {
		fiyat*=0.75;
		
		System.out.println("%25 indirim yap�lm�� hali : " + fiyat);
		
	}

}
