package day27_constructor_constructorCall;

public class C01_CarRunner {

	public static void main(String[] args) {
		// d�nk� Car class �ndan obje olu�tural�m
		Car1 car=new Car1();
		
		System.out.println(car.y�l);
		
		//ba�ka package da oldu�u i�in i�inde oldu�umuz class dan Car class �ndaki
		//variable lara ula�abilmem i�in variable �n axcess modifier i public olmal�d�r
		
		Car1 car1=new Car1();
		car1.km=100000;
		car1.sat�l�km�=true;
		
		
		System.out.println(car1.km + " " +car1.model + " " +car1.renk + 
				" "+car1.sat�l�km� + " "+car1.y�l + " " );//100000 null null true 0 

		Car1 car2=new Car1();
		
		car2.model="ford";
		
		System.out.println(car2.km + " " +car2.model + " " +car2.renk +
				" "+car2.sat�l�km� + " "+car2.y�l + " " );//0 ford null false 0
	}

}
