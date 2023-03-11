package day17_ForLoop;

import java.util.Scanner;

public class C01_InterviewQuestion {

	public static void main(String[] args) {
		// kullanýcýdan 100 den küçük bir tam sayý isteyin. 1 den baþlayarak girilen sayýya
		//kadar tüm sayýlarý yazdýrýn. ancak
		//sayý 3 ün katý ise sayý yerine "java" yazdýrýn
		//sayý 5 in katý ise sayý yerine "güzeldir" yazdýrýn
		//sayý hem 5 ün hem 5 in katý ise sayý yerine "java güzeldir" yazdýrýn.
		
Scanner scan=new Scanner (System.in);
		
		System.out.println("lütfen 100 den küçük bir sayý giriniz");
		
		
		int sayý=scan.nextInt();
		
		for (int i = 1; i <=sayý; i++) {if (i%3==0 && i%5==0) {System.out.println("java güzeldir");
			
		} else {if (i%3==0) {System.out.println("java");
			
		} else {if (i%5==0) {System.out.println("güzeldir");
			
		} else {System.out.println(i);

		}

		}

		}
			
		}

	scan.close();}

}
