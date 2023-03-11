package day43_interface;

public class C03_Concrete implements C02_Interface {

	public static void main(String[] args) {
		
		C03_Concrete ConcreteObje=new C03_Concrete();
		
		//interface de default keyword kullanýlarak oluþturduðumuz body si olan method lara 
		//child concrete class lardan obje vasýtasýyla ulaþabilirim
		ConcreteObje.kaporta();
		
		//interface de static keyword kullanýlarak oluþturduðumuz body si olan method lara 
		//child concrete class lardan interface ismi vasýtasýyla ulaþabilirim
		C02_Interface.þanzuman();
		
		

	}

	//bir interface de static veya default keyword kullanarak body si method oluþturursak
	//bu interface e implements eden concrte child class lar bu method larý 
	//implement etmek ZORUNDA DEÐÝLDÝR
	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}

}
