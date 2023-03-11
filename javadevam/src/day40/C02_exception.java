package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_exception {

	public static void main(String[] args) {
		// kullanýcýdan istediði kadar sayý alýp
		//bu sayýlarý toplayan bir proðram yapýnýz
		//sayý giriþini bitirmek için q ya basýnýz
		
		int sayý=0;
		int toplam=0;
		int count=0;
		Scanner scan=new Scanner(System.in);
		
		try {
			while(count<10000) {
				System.out.println("lütfen toplamak istediðiniz sayýlarý yazýnýz \nbitirmek için sayý dýþýnda herhangi bir tuþa basýn");
				sayý=scan.nextInt();
				toplam+=sayý;
				count++;
			}
			
		} catch (InputMismatchException e) {
			System.out.println("girdiðiniz " + count + " adet sayýnýn toplamý : " + toplam);
		}

	}

}
