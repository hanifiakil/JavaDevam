package day18_nested_Forloop_whileloop;

public class C05_whileloop {

	public static void main(String[] args) {
		// for loop ve while loop kullanarak 3 basamakl� say�lardan
		//15,20 ve 90 a tam b�l�nebilen say�lar� yazd�r�n.
		
		for (int i = 100; i < 1000; i++) {
			
			if(i%15==0 && i%20==0 && i%90==0) {System.out.println(i);}
			
		}
		
		int say�=100;
		
		while (say�<1000) {
			if (say�%15==0 && say�%20==0 && say�%90==0) {System.out.println(say�);
			
			
				
			}say�++;
		}

	}

}
