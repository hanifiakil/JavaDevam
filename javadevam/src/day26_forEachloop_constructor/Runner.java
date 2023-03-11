package day26_forEachloop_constructor;

public class Runner {

	public static void main(String[] args) {
		// car class �ndan bir obje olu�tural�m
	
		     Car          car1       =        new          Car();
		
		//class ismi   obje ismi   atama     keyword    Constructor
		
		System.out.println(car1.km + " " + car1.renk);
		//bir obje olu�tururken e�er obje i�in kendi class �n da belirlenen de�erleri kullanmak istiyorsam
		//hi� bir de�eri kendim atamadan obje olu�turabilirim
		//bu durum hi� bir parametre kullan�lmad��� i�in default constructor yeterli olacakt�r
		
		//e�er obje olu�turdu�um class daki de�erleri kullanmak yerine kendi de�erlerimle bir obje
		//olu�turmak istersem o zaman parametreli constructor olu�turmam gerekir
		
		//Car car2= new Car("k�rm�z�","corolla");
		
		//Car class �nda iki String parametresi olan bir constructor olmad��� i�in
		//bu obje olu�turmay� �imdilik yapamay�z

	}

}
