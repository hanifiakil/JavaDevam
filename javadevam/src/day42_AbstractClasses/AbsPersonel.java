package day42_AbstractClasses;

public abstract class AbsPersonel {
	
	//class ve metod u abstract olarak tan�mlad���mda child class lar mecburen
	//bu method u override edecekler
	
	//
	public abstract void stat�();
	
	public abstract void abstractMethod();
	public void concreteMethod() {
		System.out.println("personel class indaki concrete method �al��t�");
	}

}
