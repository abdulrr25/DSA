package com.demo.beans;

public class QuickSort {
	public int partition(int[] arr, int start, int end) {
		int i = start;
		int pivot=start;
		int j= end;
		
		while(i<j) {
			while(i<end && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>start && arr[j]>arr[pivot]) {
				j--;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		if(j!=pivot) {
			int temp=arr[j];
			arr[j]=arr[pivot];
			arr[pivot]=temp;
		}
		return j;
	}
	public void quickSort(int arr[], int start, int end) {
		if(start<end) {
			
		int p= partition(arr,start,end);
		quickSort(arr,start,p-1);
		quickSort(arr,p+1,end);
		}
	}
}
