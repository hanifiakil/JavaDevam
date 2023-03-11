package day18_nested_Forloop_whileloop;

import java.util.Scanner;

public class C02_nestedforloop {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan 10 dan küçük pozitif bir tamsayý girmesini isteyin girdiði
		 * sayýya göre aþagýdaki þekli yazdýrýn örneðin 3 girerse 1 1 2 1 2 3
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("lütfen 10 dan küçük pozitif bir tamsayý girin");

		int sayý = scan.nextInt();

		for (int satýr = 1; satýr <= sayý; satýr++) {
			for (int i = 1; i <= satýr; i++) {
				System.out.print(i + " ");

			}
			System.out.println();

		}scan.close();

	}

}
