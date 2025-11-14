package com.demo.Sorting;

import java.sql.Array;
import java.util.Arrays;

public class MergeSort {
	public static void merge(int[] arr,int start, int mid, int end) {
		int n1 = mid-start+1;
		int n2 = end-mid;
		
		int[] leftArray = new int [n1];
		int[] RightArray = new int[n2];
		
		for(int i=0; i<n1;i++) {
			leftArray[i]=arr[start+i];
		}
		for(int j=0; j<n2;j++) {
			RightArray[j]= arr[mid+1+j];
		}
		
		int i=0, j=0;
		int k=start;
		while(i<n1 && j<n2) {
			if(leftArray[i]<RightArray[j]) {
				arr[k] = leftArray[i];
				i++;
				k++;
			}else {
				arr[k] = RightArray[j];
				j++;
				k++;
			}
			
		}
		while(i<n1) {
			arr[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=RightArray[j];
			j++;
			k++;
		}
		System.out.println(start+","+mid+","+end);
		System.out.println(Arrays.toString(leftArray));
		System.out.println(Arrays.toString(RightArray));
		System.out.println("------------------------------------");
		
	}
	public static void  MergeSortAssending(int[]arr, int start, int end) {
		
		if(start<end) {
		    int mid=(start+end)/2;
			MergeSortAssending(arr,start,mid);
			MergeSortAssending(arr,mid+1,end);
			merge(arr,start,mid,end);
			System.out.println(Arrays.toString(arr));

			
		}
	}

	
}
