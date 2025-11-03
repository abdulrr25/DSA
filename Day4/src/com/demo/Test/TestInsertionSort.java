package com.demo.Test;

import java.util.Scanner;

import com.demo.Sorting.InsertionSort;

public class TestInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array\n");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements of the array\n");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//		InsertionSort.insertionSort(arr);
		InsertionSort.insertionSortDesc(arr);

	}

}
