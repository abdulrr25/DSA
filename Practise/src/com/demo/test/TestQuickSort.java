package com.demo.test;

import com.demo.beans.QuickSort;

public class TestQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {54,52,23,55,11,56,58,10,11};
		QuickSort ob =  new QuickSort();
		ob.quickSort(arr,0,arr.length-1);
		System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

}
