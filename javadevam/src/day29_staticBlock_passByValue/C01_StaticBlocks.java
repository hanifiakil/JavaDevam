package day29_staticBlock_passByValue;

public class C01_StaticBlocks {
	
	static {
		System.out.println("static blok main method dan bile �nce �al���r");
	}

	public static void main(String[] args) {
		
System.out.println("javada �nce main method �al���r");
	}
	
	static {
		System.out.println("static blok nereye yaz�l�rsa yaz�ls�n main method dan bile �nce �al���r");
	}
	
	//static metodlar aras�da �nce �stte olan �al���r

}
