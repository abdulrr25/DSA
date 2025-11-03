package com.demo.Sorting;

import java.util.Arrays;

public class CountingSort {
	private static int findMax(int arr[]) {
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void CountingSort(int arr[]) {
		int max = findMax(arr);
		int count[] = new int[max+1];
		for(int i=0;i<=max;i++) {
			count[i]=0;
		}
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		System.out.println("Count Array : \n" +Arrays.toString(count));
		
		for(int i=1;i<count.length;i++) {
			count[i]+=count[i-1];
		}
		System.out.println(Arrays.toString(count));
		int [] output = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]--;
			output[count[arr[i]]]=arr[i];
			
//			count[arr[i]]--;
//			
//			output[count[arr[i]]]=arr[i];
		}
		System.out.println(Arrays.toString(output));
	}
}
