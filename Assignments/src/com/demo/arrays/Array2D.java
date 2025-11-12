package com.demo.arrays;

import java.util.Scanner;

public class Array2D {
	private int[][]arr;
	
	

	public Array2D() {
		arr=new int[5][5];
	}



	public Array2D(int[][] arr) {
		this.arr = arr;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the value at index "+i+","+j);
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	public void reversRow() {
		for(int i=0;i<arr.length;i++) {
			reverseRow(arr[i]);
		}
	}
	private static void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
	
	public  int[] rowMax() {
		int max[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			max[i]= Max(arr[i]);
		}
		return max;
	}
	
	private static int Max(int []ar) {
		int max=0;
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i] && ar[i]%2!=0) {
				max=ar[i];
			}
		}
		return max;
	}
	// Sum of a single row
	private int row(int ar[]) {
	    int sum = 0;
	    for (int i = 0; i < ar.length; i++) {
	        sum += ar[i];
	    }
	    return sum;
	}

	// Average of all rows (total sum / number of rows)
	public double rowAverage() {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum += row(arr[i]);
	    }
	    return (double) sum / arr.length;
	}

	// Average of all columns (total sum / number of columns)
	public double columnAverage() {
	    int sum = 0;
	    int cols = arr[0].length;
	    int rows = arr.length;

	    for (int i = 0; i < cols; i++) {
	        int colSum = 0;
	        for (int j = 0; j < rows; j++) {
	            colSum += arr[j][i];
	        }
	        sum += colSum;
	    }
	    return (double) sum / cols;
	}

	
	public void displayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
