package com.demo.Test;

import java.util.Scanner;

import com.demo.Sorting.SelectionSort;

public class TestSelectionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array\n");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the elements of the array\n");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		SelectionSort.SelectionSort(arr);
	}
}
