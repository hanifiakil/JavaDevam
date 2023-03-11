package day39_overridingKurallarý_Polymorphism;

public class C02 extends C01{

	public static void main(String[] args) {
		C02 obj1= new C02();
		
obj1.privateMethod();
obj1.staticMetod();

C01 obj2=new C02();
//obj2.privateMethod();  data türü C01 old. öncelikle C01 clasýndaki
//metod a bakmamýz gerekir ama private old. ulaþamayýz ve overring yapamayýz
//dolayýsýyla signature ayný olmasýna raðmen bu ikisi farklý metod olarak çalýþýr
obj2.staticMetod();

//static method lar override edilemez
//dolayýsýyla signature ayný olmasýna raðmen bu ikisi farklý metod olarak çalýþýr

	}
	public static void staticMetod() {
		System.out.println("Child class static method çalýþtý");	
	}

	private void privateMethod() {
		System.out.println("Child class private method");
	}
	/*
	public final void finalMethod() {
		System.out.println("parent class final method");
	}*/ 

}
