package com.demo.test;

import com.demo.beans.InsertionSort;
import com.demo.beans.QuickSort;

public class TestInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {54,52,23,55,11,56,58,10,11};
		InsertionSort ob =  new InsertionSort();
		ob.insertionSort(arr);
	}

}
