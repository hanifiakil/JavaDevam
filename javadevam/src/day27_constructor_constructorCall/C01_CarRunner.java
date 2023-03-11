package day27_constructor_constructorCall;

public class C01_CarRunner {

	public static void main(String[] args) {
		// dünkü Car class ýndan obje oluþturalým
		Car1 car=new Car1();
		
		System.out.println(car.yýl);
		
		//baþka package da olduðu için içinde olduðumuz class dan Car class ýndaki
		//variable lara ulaþabilmem için variable ýn axcess modifier i public olmalýdýr
		
		Car1 car1=new Car1();
		car1.km=100000;
		car1.satýlýkmý=true;
		
		
		System.out.println(car1.km + " " +car1.model + " " +car1.renk + 
				" "+car1.satýlýkmý + " "+car1.yýl + " " );//100000 null null true 0 

		Car1 car2=new Car1();
		
		car2.model="ford";
		
		System.out.println(car2.km + " " +car2.model + " " +car2.renk +
				" "+car2.satýlýkmý + " "+car2.yýl + " " );//0 ford null false 0
	}

}
