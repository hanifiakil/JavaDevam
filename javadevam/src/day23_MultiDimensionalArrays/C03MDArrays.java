package day23_MultiDimensionalArrays;

public class C03MDArrays {

	public static void main(String[] args) {
		// a�ag�daki multi dimensional array in t�m elemanlar�n�n �arp�m�n�
		//ekrana yazd�ran bir method yaz�n�z
		int arr[][]= { {1,2}, {4,5,6,7} };
		
		�arp�myazd�r(arr);
		
	}

	public static void �arp�myazd�r(int[][] arr) {
	
		
		int �arp�m=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				�arp�m*=arr[i][j];
				
			}
			
		}
System.out.println(�arp�m);
	}
	
}
