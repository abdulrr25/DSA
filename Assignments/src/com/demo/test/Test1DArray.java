package com.demo.test;

import java.util.Scanner;

import com.demo.arrays.Array1D;

public class Test1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Array1D ob = new Array1D();
		ob.acceptArray();
		
		ob.displayArray();
		int []ar = ob.factorialOfPrimes();
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i] +" , ");
		}
	}

}
