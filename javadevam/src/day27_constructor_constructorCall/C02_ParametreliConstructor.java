package day27_constructor_constructorCall;

public class C02_ParametreliConstructor {
	public static void main(String[] args) {
		//java n�n olu�turdu�u default constructor ile obje olu�turabiliyoruz
		//ama her obje i�in yeniden de�er atamas� yapmak uzun oluyor
		//istersek parametreli constructorlar olu�turup daha obje olu�urken
		//istedi�im �zellikleri atayabilirim
		
		@SuppressWarnings("unused")
		Car1 car2=new Car1(5000,    "ford",    "beyaz",     2015,        true);
                    // int km   String model  String renk  int y�l   bolean sat�l�km�

		Car1 car3=new Car1(35000);//int km
		
		System.out.println(car3.km);
		
		//y�l ve km yi parametre olarak girebilece�i bir constructor daha olu�turabilirmiyim?
		
		Car1 car4=new Car1(2020, 5000);
		                 //y�l    km
		System.out.println(car4.km + " " + car4.y�l + " " + car4.model);
		
	}
	}
