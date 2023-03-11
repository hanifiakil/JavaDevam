package day39_overridingKurallar�_Polymorphism;

public class C02 extends C01{

	public static void main(String[] args) {
		C02 obj1= new C02();
		
obj1.privateMethod();
obj1.staticMetod();

C01 obj2=new C02();
//obj2.privateMethod();  data t�r� C01 old. �ncelikle C01 clas�ndaki
//metod a bakmam�z gerekir ama private old. ula�amay�z ve overring yapamay�z
//dolay�s�yla signature ayn� olmas�na ra�men bu ikisi farkl� metod olarak �al���r
obj2.staticMetod();

//static method lar override edilemez
//dolay�s�yla signature ayn� olmas�na ra�men bu ikisi farkl� metod olarak �al���r

	}
	public static void staticMetod() {
		System.out.println("Child class static method �al��t�");	
	}

	private void privateMethod() {
		System.out.println("Child class private method");
	}
	/*
	public final void finalMethod() {
		System.out.println("parent class final method");
	}*/ 

}
