package day23_MultiDimensionalArrays;

public class C04MDArrays {

	public static void main(String[] args) {
		// a�a��daki MDArray in i� array lerindeki son elemanlar�n
		//�arp�m�n� ekrana yazd�ran bir pro�ram yaz�n�z
		
		int arr[][]= { {1,2,3}, {4,5},{6} };
		
		int sonu�=1;
		
		for (int i = 0; i < arr.length; i++) {
		int sonelementindexi=arr[i][arr[i].length-1];
		
		sonu� *=sonelementindexi;
			
		}
System.out.println(sonu�);
	}

}
