package day21_scope_arrays;

public class C01_LocalVariables {

	public static void main(String[] args) {
		// java local variable lara default de�er atamas� yapmaz
		//kodlar�m�zda sorun ya�amamak i�in olu�turdu�umuz local
		//variable lara uygun bir de�er atamam�z da fayda var
		
		int say�=0;//int say�; dersek java CTE hata verir
		System.out.println(say�);
		
		//int say�;  bir local de ayn� isimde bir den fazla variable OLU�TURULAMAZ
		//Sting sat�; data t�r� farkl� olsada java buna izin vermez
		

	}
	public static void staticMerhod() {
		//say�;    bir local de olu�turulan variable (method lar�n static olup olmamas�na
		// ba�l� olmaks�z�n) farkl� local de kullan�lamaz
		@SuppressWarnings("unused")
		String isim="veli";
		
	}

}
