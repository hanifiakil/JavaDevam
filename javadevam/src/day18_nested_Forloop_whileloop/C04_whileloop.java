package day18_nested_Forloop_whileloop;

import java.util.Scanner;

public class C04_whileloop {
	public static void main(String[] args) {
		
		/*kullanýcýdan toplamak üzere sayý isteyin
		 * kullanýcý sýfýra basýncaya kadar sayýlarý alýp
		 * toplamaya devam edin
		 * kullanýcý sýfýra bastýðýnda o ana kadar kaç sayý girdiðini ve girilen sayýlarýn toplamýný yazdýrýn
		 */

	
		Scanner scan=new Scanner(System.in);
		
		int sayý=10;//0 hariç herhangi biri olabilir çünkü sýfýrda bitireceðiz
		int toplam=0;
		int sayaç=0;
		
		
		while (sayý!=0) {
			System.out.println("lütfen toplamak için tam sayý giriniz \n bitirmek için 0 a basýnýz");
			
			sayý=scan.nextInt();
			toplam+=sayý;
			sayaç++;
		}
		System.out.println("girilen sayýlarýn toplamý : " + toplam );
		System.out.println("girilen sayýlarýn adeti : " + (sayaç-1));//0 ý sayaca dahil etmemek için 1 çýkardýk
		scan.close();
	}
}