package day39_overridingKurallar�_Polymorphism;

public class C01 {
	
	public static void staticMetod() {
		System.out.println("Parent class static method �al��t�");	
	}

	private void privateMethod() {
		System.out.println("parent class private method");
	}
	// final demek bu son hali birdaha de�i�tirilemez demektir
	//dolay�s�yla final olarak tan�mlanan bir method 
	//override edilemez
	public final void finalMethod() {
		System.out.println("parent class final method");
	}//child class ile parent class ayn� package da olduklar�ndan
	//methodlar�n access modifier lar� public protected veya default olsayd� hi� bir sorun olmaz d�
	//
}
