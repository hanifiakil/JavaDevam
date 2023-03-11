package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C07copyof {

	public static void main(String[] args) {
		//verilen iki array i birleþtiren ve sonucu birleþikarray isminde
				//array e kaydeden bir method oluþturunuz
				
				int arr1[]= {3,5,7,10};
				int arr2[]= {2,4,6,8,9};
				
				int birkeþikArray[]=birleþtir(arr1,arr2);
				System.out.println(Arrays.toString(birkeþikArray));//[3, 5, 7, 10, 2, 4, 6, 8, 9]
				
				Arrays.sort(birkeþikArray);
		System.out.println(Arrays.toString(birkeþikArray));//[2, 3, 4, 5, 6, 7, 8, 9, 10]
			}

			private static int[] birleþtir(int[] arr1, int[] arr2) {
				int birleþikArray[]=Arrays.copyOf(arr1, arr1.length+arr2.length);
				//bir önceki class a göre bu kýsým daha pratik olabilir
				for (int i = 0; i < arr2.length; i++) {
					birleþikArray[i+arr1.length]=arr2[i];
					
				}
				return birleþikArray;
			}

		}
