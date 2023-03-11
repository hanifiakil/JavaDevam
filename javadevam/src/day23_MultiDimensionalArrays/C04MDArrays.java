package day23_MultiDimensionalArrays;

public class C04MDArrays {

	public static void main(String[] args) {
		// aþaðýdaki MDArray in iç array lerindeki son elemanlarýn
		//çarpýmýný ekrana yazdýran bir proðram yazýnýz
		
		int arr[][]= { {1,2,3}, {4,5},{6} };
		
		int sonuç=1;
		
		for (int i = 0; i < arr.length; i++) {
		int sonelementindexi=arr[i][arr[i].length-1];
		
		sonuç *=sonelementindexi;
			
		}
System.out.println(sonuç);
	}

}
