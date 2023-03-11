package day27_constructor_constructorCall;

public class C02_ParametreliConstructor {
	public static void main(String[] args) {
		//java nýn oluþturduðu default constructor ile obje oluþturabiliyoruz
		//ama her obje için yeniden deðer atamasý yapmak uzun oluyor
		//istersek parametreli constructorlar oluþturup daha obje oluþurken
		//istediðim özellikleri atayabilirim
		
		@SuppressWarnings("unused")
		Car1 car2=new Car1(5000,    "ford",    "beyaz",     2015,        true);
                    // int km   String model  String renk  int yýl   bolean satýlýkmý

		Car1 car3=new Car1(35000);//int km
		
		System.out.println(car3.km);
		
		//yýl ve km yi parametre olarak girebileceði bir constructor daha oluþturabilirmiyim?
		
		Car1 car4=new Car1(2020, 5000);
		                 //yýl    km
		System.out.println(car4.km + " " + car4.yýl + " " + car4.model);
		
	}
	}
