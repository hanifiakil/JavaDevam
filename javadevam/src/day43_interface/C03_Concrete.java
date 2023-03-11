package day43_interface;

public class C03_Concrete implements C02_Interface {

	public static void main(String[] args) {
		
		C03_Concrete ConcreteObje=new C03_Concrete();
		
		//interface de default keyword kullanılarak oluşturduğumuz body si olan method lara 
		//child concrete class lardan obje vasıtasıyla ulaşabilirim
		ConcreteObje.kaporta();
		
		//interface de static keyword kullanılarak oluşturduğumuz body si olan method lara 
		//child concrete class lardan interface ismi vasıtasıyla ulaşabilirim
		C02_Interface.şanzuman();
		
		

	}

	//bir interface de static veya default keyword kullanarak body si method oluşturursak
	//bu interface e implements eden concrte child class lar bu method ları 
	//implement etmek ZORUNDA DEĞİLDİR
	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}

}
