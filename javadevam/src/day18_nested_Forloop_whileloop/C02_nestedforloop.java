package day18_nested_Forloop_whileloop;

import java.util.Scanner;

public class C02_nestedforloop {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan 10 dan k���k pozitif bir tamsay� girmesini isteyin girdi�i
		 * say�ya g�re a�ag�daki �ekli yazd�r�n �rne�in 3 girerse 1 1 2 1 2 3
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("l�tfen 10 dan k���k pozitif bir tamsay� girin");

		int say� = scan.nextInt();

		for (int sat�r = 1; sat�r <= say�; sat�r++) {
			for (int i = 1; i <= sat�r; i++) {
				System.out.print(i + " ");

			}
			System.out.println();

		}scan.close();

	}

}
