package day29_staticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		// biz 100 tl ye satýlan bir ürün için 2 farklý indirim uygulayan iki metod oluþturalým
		
		int fiyat=100;
		
		indirimyap25(fiyat);
		
		System.out.println("method uygulandýktan sonraki fiyat : " + fiyat);
		
		indirimyap10(fiyat);
		
		System.out.println("method uygulandýktan sonraki fiyat : " + fiyat);
	}

	private static void indirimyap10(int fiyat) {
		fiyat*=0.90;
		
		System.out.println("%10 indirim yapýlmýþ hali : " + fiyat);
		
	}

	private static void indirimyap25(int fiyat) {
		fiyat*=0.75;
		
		System.out.println("%25 indirim yapýlmýþ hali : " + fiyat);
		
	}

}
