package day21_scope_arrays;

public class C01_LocalVariables {

	public static void main(String[] args) {
		// java local variable lara default deðer atamasý yapmaz
		//kodlarýmýzda sorun yaþamamak için oluþturduðumuz local
		//variable lara uygun bir deðer atamamýz da fayda var
		
		int sayý=0;//int sayý; dersek java CTE hata verir
		System.out.println(sayý);
		
		//int sayý;  bir local de ayný isimde bir den fazla variable OLUÞTURULAMAZ
		//Sting satý; data türü farklý olsada java buna izin vermez
		

	}
	public static void staticMerhod() {
		//sayý;    bir local de oluþturulan variable (method larýn static olup olmamasýna
		// baðlý olmaksýzýn) farklý local de kullanýlamaz
		@SuppressWarnings("unused")
		String isim="veli";
		
	}

}
