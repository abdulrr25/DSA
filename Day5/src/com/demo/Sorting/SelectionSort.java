package com.demo.Sorting;
import java.util.Arrays;
public class SelectionSort {
	private static int findMin(int[] arr, int start) {
		int minpos = start;
		int min = arr[minpos];
		for (int i =start; i < arr.length; i++) {
			if (min> arr[i]) {
				min = arr[i];
				minpos = i;
			}
		}
		return minpos;
	}
	public static void SelectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = findMin(arr, i);
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	private static int findMax(int[] arr, int start) {
		int maxpos = start;
		int max = arr[maxpos];
		for (int i =start; i < arr.length; i++) {
			if (max< arr[i]) {
				max = arr[i];
				maxpos = i;
			}
		}
		return maxpos;
	}
	public static void SelectionSortDesc(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int max = findMax(arr, i);
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
