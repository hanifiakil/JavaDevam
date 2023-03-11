package day27_constructor_constructorCall;

public class Týr {

		
	
		int yýl;
		
		String renk;
		String model;
		int km;
		boolean satýlýkmý;
		
		public Týr(int i, String string, String string2, int j, boolean b) {
			// int km , String model , String renk , int yýl , booleon satýlýkmý
			//týr runner class ýndan yolladýðýmýz deðerlerin instance variable lar 
			//eþleþmesi için atamalarý yapmam lazým
			km=i;
			model=string;
			renk=string2;
			yýl=j;
			satýlýkmý=b;
	
		}

		public Týr(int km, String model, String renk) {
			// variable isimlerini anlamlý yaptýktan sonra isim karýþýklýðý 
			//olmamasý için java ya tanýtmak gerekir
			this.km=km;
			this.model=model;
			this.renk=renk;
			
			//baþýna this. yazdýðýmýzda java bu variable ýn class level deki olduðunu anlar
		}
}
