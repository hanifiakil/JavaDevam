package day17_ForLoop;

import java.util.Scanner;

public class C01_InterviewQuestion {

	public static void main(String[] args) {
		// kullan�c�dan 100 den k���k bir tam say� isteyin. 1 den ba�layarak girilen say�ya
		//kadar t�m say�lar� yazd�r�n. ancak
		//say� 3 �n kat� ise say� yerine "java" yazd�r�n
		//say� 5 in kat� ise say� yerine "g�zeldir" yazd�r�n
		//say� hem 5 �n hem 5 in kat� ise say� yerine "java g�zeldir" yazd�r�n.
		
Scanner scan=new Scanner (System.in);
		
		System.out.println("l�tfen 100 den k���k bir say� giriniz");
		
		
		int say�=scan.nextInt();
		
		for (int i = 1; i <=say�; i++) {if (i%3==0 && i%5==0) {System.out.println("java g�zeldir");
			
		} else {if (i%3==0) {System.out.println("java");
			
		} else {if (i%5==0) {System.out.println("g�zeldir");
			
		} else {System.out.println(i);

		}

		}

		}
			
		}

	scan.close();}

}
