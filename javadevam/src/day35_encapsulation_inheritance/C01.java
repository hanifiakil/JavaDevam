package day35_encapsulation_inheritance;

public class C01 {
	
	//��retmenler ��rencinin notunu girsin
	//sadece ��rencinin ge�ip ge�emeyece�ini g�rs�n

	
		private double not=49.9;

	private boolean ge�ermi=false;

	public void setNot(double not) {//ba�ka class lardan argiment 
		//olarak yaz�lan de�erler bu metod a parametre olarak gelecek
		this.not = not;
	}

	public boolean isGe�ermi() {
		
	if (not>=50) {
		
		ge�ermi=true;
		
	}
		return ge�ermi;
	}




	

}
