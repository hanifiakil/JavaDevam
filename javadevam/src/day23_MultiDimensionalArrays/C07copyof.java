package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C07copyof {

	public static void main(String[] args) {
		//verilen iki array i birleştiren ve sonucu birleşikarray isminde
				//array e kaydeden bir method oluşturunuz
				
				int arr1[]= {3,5,7,10};
				int arr2[]= {2,4,6,8,9};
				
				int birkeşikArray[]=birleştir(arr1,arr2);
				System.out.println(Arrays.toString(birkeşikArray));//[3, 5, 7, 10, 2, 4, 6, 8, 9]
				
				Arrays.sort(birkeşikArray);
		System.out.println(Arrays.toString(birkeşikArray));//[2, 3, 4, 5, 6, 7, 8, 9, 10]
			}

			private static int[] birleştir(int[] arr1, int[] arr2) {
				int birleşikArray[]=Arrays.copyOf(arr1, arr1.length+arr2.length);
				//bir önceki class a göre bu kısım daha pratik olabilir
				for (int i = 0; i < arr2.length; i++) {
					birleşikArray[i+arr1.length]=arr2[i];
					
				}
				return birleşikArray;
			}

		}
