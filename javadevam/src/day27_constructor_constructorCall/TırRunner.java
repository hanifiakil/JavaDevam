package day27_constructor_constructorCall;

public class T�rRunner {

	public static void main(String[] args) {
		// bir tane t�m �zellikleri de�i�tiren constructor olu�tural�m
		
		T�r t�r1=new T�r(5000,"axor","beyaz",2020,false);
		
		System.out.println(t�r1.km + " " +t�r1.model + " " +t�r1.renk + " " +t�r1.y�l + " " +t�r1.sat�l�km�);
		
		
		T�r t�r2=new T�r(2500,"fatih","k�rm�z�");
		
		System.out.println(t�r2.km + " " +t�r2.model + " " +t�r2.renk + " " +t�r2.y�l + " " +t�r2.sat�l�km�);

	}

}
