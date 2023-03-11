package day26_forEachloop_constructor;

public class Jeep {

	
	int ilanno=1001;
	String marka;
	String model;
	int yýl=2001;
	int fiyat=10000;
	
	public void hýz(int hýz) {
		System.out.println("araba saatte " + hýz + "km yapar");
	}

	public void yakýt(String yakýt) {
		System.out.println("araba 100 km de " + yakýt + "yakýt tüketir");
	}
}
