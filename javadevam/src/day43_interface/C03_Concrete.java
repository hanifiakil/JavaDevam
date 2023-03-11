package day43_interface;

public class C03_Concrete implements C02_Interface {

	public static void main(String[] args) {
		
		C03_Concrete ConcreteObje=new C03_Concrete();
		
		//interface de default keyword kullan�larak olu�turdu�umuz body si olan method lara 
		//child concrete class lardan obje vas�tas�yla ula�abilirim
		ConcreteObje.kaporta();
		
		//interface de static keyword kullan�larak olu�turdu�umuz body si olan method lara 
		//child concrete class lardan interface ismi vas�tas�yla ula�abilirim
		C02_Interface.�anzuman();
		
		

	}

	//bir interface de static veya default keyword kullanarak body si method olu�turursak
	//bu interface e implements eden concrte child class lar bu method lar� 
	//implement etmek ZORUNDA DE��LD�R
	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}

}
