package day39_overridingKurallarý_Polymorphism;

public class C01 {
	
	public static void staticMetod() {
		System.out.println("Parent class static method çalýþtý");	
	}

	private void privateMethod() {
		System.out.println("parent class private method");
	}
	// final demek bu son hali birdaha deðiþtirilemez demektir
	//dolayýsýyla final olarak tanýmlanan bir method 
	//override edilemez
	public final void finalMethod() {
		System.out.println("parent class final method");
	}//child class ile parent class ayný package da olduklarýndan
	//methodlarýn access modifier larý public protected veya default olsaydý hiç bir sorun olmaz dý
	//
}
