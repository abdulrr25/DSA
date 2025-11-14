package com.demo.beans;

import java.util.Arrays;

public class SelectionSort {
	private int min(int[] arr, int i) {
		// TODO Auto-generated method stub
		int minpos=i;
		int min=arr[minpos];
		for(int j=i;j<arr.length;j++) {
			if(arr[j]<min)
			{
				min=arr[j];
				minpos=j;
			}
		}
		return minpos;
	}
	public void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minpos = min(arr,i);
			int temp=arr[i];
			arr[i]=arr[minpos];
			arr[minpos]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
