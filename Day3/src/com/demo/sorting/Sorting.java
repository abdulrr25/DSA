package com.demo.sorting;

import java.util.Arrays;

public class Sorting {
	public static void bubblesort(int[] arr) {
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println();
			System.out.println("Iteration: "+i);
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void BubbleSortImprvd(int arr[]) {
		boolean flag ;
		for(int i=0;i<arr.length;i++) {
			flag =false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					
				flag = true;
				
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
			System.out.println();
			System.out.println("Iteration: "+i);
			System.out.println(Arrays.toString(arr));
			if(!flag) {
				break;
			}
		}
	}

}
