package day27_constructor_constructorCall;

public class T�r {

		
	
		int y�l;
		
		String renk;
		String model;
		int km;
		boolean sat�l�km�;
		
		public T�r(int i, String string, String string2, int j, boolean b) {
			// int km , String model , String renk , int y�l , booleon sat�l�km�
			//t�r runner class �ndan yollad���m�z de�erlerin instance variable lar 
			//e�le�mesi i�in atamalar� yapmam laz�m
			km=i;
			model=string;
			renk=string2;
			y�l=j;
			sat�l�km�=b;
	
		}

		public T�r(int km, String model, String renk) {
			// variable isimlerini anlaml� yapt�ktan sonra isim kar���kl��� 
			//olmamas� i�in java ya tan�tmak gerekir
			this.km=km;
			this.model=model;
			this.renk=renk;
			
			//ba��na this. yazd���m�zda java bu variable �n class level deki oldu�unu anlar
		}
}
