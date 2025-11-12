package com.demo.test;

import com.demo.arrays.Array2D;

public class Test2DArray {

	public static void main(String[] args) {
		
		Array2D ob = new Array2D();
		ob.acceptData();
		ob.displayData();
//		ob.reversRow();
//		System.out.println("\nReversed Array is \n");
//		ob.displayData();

//		int max[]=ob.rowMax();
//		System.out.println("\nMaxmimum ODD Elements of the Row Are : \n");
//		for(int i:max) {
//			System.out.println(i);
//		}
		
		System.out.println(ob.rowAverage());
		System.out.println(ob.columnAverage());
		
		
	}

}
