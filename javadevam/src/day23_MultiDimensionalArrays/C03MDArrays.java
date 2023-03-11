package day23_MultiDimensionalArrays;

public class C03MDArrays {

	public static void main(String[] args) {
		// aþagýdaki multi dimensional array in tüm elemanlarýnýn çarpýmýný
		//ekrana yazdýran bir method yazýnýz
		int arr[][]= { {1,2}, {4,5,6,7} };
		
		çarpýmyazdýr(arr);
		
	}

	public static void çarpýmyazdýr(int[][] arr) {
	
		
		int çarpým=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				çarpým*=arr[i][j];
				
			}
			
		}
System.out.println(çarpým);
	}
	
}
