package day26_forEachloop_constructor;

public class Runner {

	public static void main(String[] args) {
		// car class ýndan bir obje oluþturalým
	
		     Car          car1       =        new          Car();
		
		//class ismi   obje ismi   atama     keyword    Constructor
		
		System.out.println(car1.km + " " + car1.renk);
		//bir obje oluþtururken eðer obje için kendi class ýn da belirlenen deðerleri kullanmak istiyorsam
		//hiç bir deðeri kendim atamadan obje oluþturabilirim
		//bu durum hiç bir parametre kullanýlmadýðý için default constructor yeterli olacaktýr
		
		//eðer obje oluþturduðum class daki deðerleri kullanmak yerine kendi deðerlerimle bir obje
		//oluþturmak istersem o zaman parametreli constructor oluþturmam gerekir
		
		//Car car2= new Car("kýrmýzý","corolla");
		
		//Car class ýnda iki String parametresi olan bir constructor olmadýðý için
		//bu obje oluþturmayý þimdilik yapamayýz

	}

}
