package com.demo.strtest;

import com.demo.search.Searching;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,6,10,14,35,1};
		int pos=Searching.binarySearchNonRec(arr, 14);
		if(pos!=-1) {
			System.out.println("Elements present pos of "+pos);
		}
		else {
			System.out.println("Elements are not found");
		}
		
		int[] arr1= {3,5,6,10,14,35,1};
		int pos1=Searching.binarySearchRec(arr1, 35, 0, 6);
		if(pos1!=-1) {
			System.out.println("Elements present pos of "+pos1);
		}
		else {
			System.out.println("Elements are not found");
		}
		
			
		

	}

}
