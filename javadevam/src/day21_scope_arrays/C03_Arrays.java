package day21_scope_arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		//elemanlar� "ali" , "veli", "ay�e" ve "fatma" olan bir array olu�turun
		
		String arr[]=new String[4];
		arr[0]="ali";
		arr[1]="veli";
		arr[2]="ay�e";
		arr[3]="fatma";
		
		//yada
		
		String arr2[]= {"ali","veli","ay�e","fatma"};
		
		//bir �nceki sorudaki elemanlardan "ali" yerine "can" , "ay�e" yerine "g�l" atay�n

		arr2[0]="can";
		arr2[2]="g�l";
		System.out.println(arr[1]);//veli
		//son elementi yazd�r�n
		System.out.println(arr[arr.length-1]);//fatma
	}

}
