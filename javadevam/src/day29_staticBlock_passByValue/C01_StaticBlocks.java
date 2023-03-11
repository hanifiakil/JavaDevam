package day29_staticBlock_passByValue;

public class C01_StaticBlocks {
	
	static {
		System.out.println("static blok main method dan bile önce çalýþýr");
	}

	public static void main(String[] args) {
		
System.out.println("javada önce main method çalýþýr");
	}
	
	static {
		System.out.println("static blok nereye yazýlýrsa yazýlsýn main method dan bile önce çalýþýr");
	}
	
	//static metodlar arasýda önce üstte olan çalýþýr

}
