package day35_encapsulation_inheritance;

public class C01 {
	
	//öğretmenler öğrencinin notunu girsin
	//sadece öğrencinin geçip geçemeyeceğini görsün

	
		private double not=49.9;

	private boolean geçermi=false;

	public void setNot(double not) {//başka class lardan argiment 
		//olarak yazılan değerler bu metod a parametre olarak gelecek
		this.not = not;
	}

	public boolean isGeçermi() {
		
	if (not>=50) {
		
		geçermi=true;
		
	}
		return geçermi;
	}




	

}
