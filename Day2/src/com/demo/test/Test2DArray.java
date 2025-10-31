package com.demo.test;

import com.demo.array.My2DArray;

public class Test2DArray {
	public static void main(String args[]) {

		My2DArray ob1 = new My2DArray();
		System.out.println("\n--- Enter Data for Array 1 (ob1) ---");
		ob1.acceptData();

		My2DArray ob2 = new My2DArray();
		System.out.println("\n--- Enter Data for Array 2 (ob2) ---");
		ob2.acceptData();
		
		System.out.println("First matrix is: ");
		ob1.displayData();

		System.out.println("First matrix is: ");
		ob2.displayData();
//
//		My2DArray sumArray = ob1.add(ob2);
//
//		if (sumArray != null) {
//			System.out.println("\n--- Result of Addition (ob1 + ob2) ---");
//			sumArray.displayData();
//		} else {
//			System.out.println("\nAddition failed due to dimension mismatch.");
//		}
//
//		My2DArray subArray = ob1.sub(ob2);
//		if (subArray != null) {
//			System.out.println("\n--- Result of Substraction (ob1 - ob2) ---");
//			subArray.displayData();
//		} else {
//			System.out.println("\nSubstraction failed due to dimension mismatch.");
//		}
//		ob1.displayData();
//		
//		System.out.println("Col Rotation of a matrix");
//		int ar[][]=ob1.colRotation(false, 2);
//		ob1.displayArray(ar);
//		
//		if(ob1.isSymmetric()) {
//			System.out.println("symmetric matrix");
//		    ob1.displayData();
//		}else {
//			System.out.println("not symmetric matrix");
//		}
		
		
		System.out.println("Transpose of a given matrix: ");
		int arr[][]=ob2.transpose();
		ob2.displayArray(arr);
		
		
		if(ob1.isIdentity()) {
			System.out.println("Identity Matrix");
			ob1.displayData();
		}else {
			System.out.println("Not Identity Matrix");
		}
		
		
		
	}
}
