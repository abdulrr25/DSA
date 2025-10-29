package com.demo.array;
import java.util.Scanner;

public class My2DArray {
	private int[][] arr;
	
	public My2DArray() {
		arr=new int[3][3];
		
	}
	public My2DArray(int[][] newArr) {
        this.arr = newArr;
    }
	public My2DArray(int row, int col) {
		arr=new int[row][col];
	}
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the elements in the array: "+i+";"+j);
				arr[i][j]=sc.nextInt();
			}
		}
		
				
	}
	public void displayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	public int[] sumRowWise() {
		int [] sum =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum[i]+=arr[i][j];
			}
		}
		return sum;
	}
	public int[] sumColWise() {
		int[] sum=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum[i]+=arr[j][i];
			}
		}
		return sum;
	}
	
	public My2DArray add(My2DArray other) {
        int rows = this.arr.length;
        int cols = this.arr[0].length;

        if (rows != other.arr.length || cols != other.arr[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return null;
        }

        int[][] resultData = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultData[i][j] = this.arr[i][j] + other.arr[i][j];
            }
        }
        return new My2DArray(resultData);
    }
	
	
	public My2DArray sub(My2DArray other) {
		int rows = this.arr.length;
		int cols= this.arr[0].length;
		
		if(rows != other.arr.length || cols != other.arr[0].length) {
			System.out.println("Matrices must have the same dimensions for substraction");
			return null;
		}
		int[][] resultData1= new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				resultData1[i][j]= this.arr[i][j]-other.arr[i][j];
			}
		}
		return new My2DArray(resultData1); 
	}
	
}

