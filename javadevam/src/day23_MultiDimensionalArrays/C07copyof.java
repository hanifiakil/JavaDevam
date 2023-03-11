package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C07copyof {

	public static void main(String[] args) {
		//verilen iki array i birle�tiren ve sonucu birle�ikarray isminde
				//array e kaydeden bir method olu�turunuz
				
				int arr1[]= {3,5,7,10};
				int arr2[]= {2,4,6,8,9};
				
				int birke�ikArray[]=birle�tir(arr1,arr2);
				System.out.println(Arrays.toString(birke�ikArray));//[3, 5, 7, 10, 2, 4, 6, 8, 9]
				
				Arrays.sort(birke�ikArray);
		System.out.println(Arrays.toString(birke�ikArray));//[2, 3, 4, 5, 6, 7, 8, 9, 10]
			}

			private static int[] birle�tir(int[] arr1, int[] arr2) {
				int birle�ikArray[]=Arrays.copyOf(arr1, arr1.length+arr2.length);
				//bir �nceki class a g�re bu k�s�m daha pratik olabilir
				for (int i = 0; i < arr2.length; i++) {
					birle�ikArray[i+arr1.length]=arr2[i];
					
				}
				return birle�ikArray;
			}

		}
