package com.demo.Sorting;

import java.util.Arrays;

public class InsertionSort {
	//Ascending Order
	public static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int key = arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
			System.out.println(Arrays.toString(arr));
		}
	}
	//Descending Order
	public static void insertionSortDesc(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int key = arr[i];
			while(j>=0 && arr[j]<key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
			System.out.println(Arrays.toString(arr));
		}
	}
}
