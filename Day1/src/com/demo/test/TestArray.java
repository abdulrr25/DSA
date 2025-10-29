//package com.demo.test;
//
//import java.util.stream.IntStream;
//
//import com.demo.array.MyArray;
//import com.demo.array.*;
//
//public class TestArray {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MyArray ob=new MyArray();
//		My2DArray ob1=new My2DArray();
//		ob.add(4);
//		ob.add(7);
////		System.out.println(ob);
//		ob.add(8,1);
////		System.out.println(ob);
////		System.out.println("position of 10 : "+ob.searchByValue(10));
//		ob.add(3);
//		ob.add(5);
////		System.out.println(ob);
//		
//		ob.add(1);
////		System.out.println(ob);
////
////		int []arr1 = ob.exchangeIndexValue();
////		IntStream.of(arr1).forEach(e->System.out.print(e+","));
////		
//		ob1.acceptData();
//		ob1.displayData();
//		//ob1.sumRowWise();
//		int ar[]=ob1.sumColWise();
//		IntStream.of(ar).forEach(e->System.out.print(e+","));
//		
//		ob1.add(ob1);
//	}
//
//}
package com.demo.test;

import java.util.stream.IntStream;

import com.demo.array.MyArray;
import com.demo.array.My2DArray; 

public class TestArray {

	public static void main(String[] args) {

		My2DArray ob1 = new My2DArray();
		System.out.println("\n--- Enter Data for Array 1 (ob1) ---");
		ob1.acceptData();
		
		My2DArray ob2 = new My2DArray(); 
		System.out.println("\n--- Enter Data for Array 2 (ob2) ---");
		ob2.acceptData();
		
		System.out.println("\n--- Array 1 (ob1) ---");
		ob1.displayData();
		
		System.out.println("\n--- Array 2 (ob2) ---");
		ob2.displayData();
		
		
		int ar[] = ob1.sumColWise();
		System.out.print("\nColumn-wise sum: ");
		IntStream.of(ar).forEach(e -> System.out.print(e + ","));
		System.out.println();
		
		int ar1[] = ob1.sumRowWise();
		System.out.print("\nRow-wise sum: ");
		IntStream.of(ar1).forEach(e -> System.out.print(e + ","));
		System.out.println();
		
		
		
		
		
		My2DArray sumArray = ob1.add(ob2);
		
		if (sumArray != null) {
		    System.out.println("\n--- Result of Addition (ob1 + ob2) ---");
		    sumArray.displayData();
		} else {
		    System.out.println("\nAddition failed due to dimension mismatch.");
		}
		
		My2DArray subArray =ob1.sub(ob2);
		
		if (subArray != null) {
		    System.out.println("\n--- Result of Substraction (ob1 - ob2) ---");
		    subArray.displayData();
		} else {
		    System.out.println("\nSubstraction failed due to dimension mismatch.");
		}
		
		
	}
	
}