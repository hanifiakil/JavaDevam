package day18_nested_Forloop_whileloop;

public class C05_whileloop {

	public static void main(String[] args) {
		// for loop ve while loop kullanarak 3 basamaklý sayýlardan
		//15,20 ve 90 a tam bölünebilen sayýlarý yazdýrýn.
		
		for (int i = 100; i < 1000; i++) {
			
			if(i%15==0 && i%20==0 && i%90==0) {System.out.println(i);}
			
		}
		
		int sayý=100;
		
		while (sayý<1000) {
			if (sayý%15==0 && sayý%20==0 && sayý%90==0) {System.out.println(sayý);
			
			
				
			}sayý++;
		}

	}

}
