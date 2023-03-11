package day42_AbstractClasses;

public abstract class AbsPersonel {
	
	//class ve metod u abstract olarak tanýmladýðýmda child class lar mecburen
	//bu method u override edecekler
	
	//
	public abstract void statü();
	
	public abstract void abstractMethod();
	public void concreteMethod() {
		System.out.println("personel class indaki concrete method çalýþtý");
	}

}
