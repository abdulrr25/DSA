package com.demo.array;

import java.util.Scanner;

public class My2DArray {
	private int[][] arr;

	public My2DArray() {
		arr = new int[3][3];

	}

	public My2DArray(int[][] newArr) {
		this.arr = newArr;
	}

	public My2DArray(int row, int col) {
		arr = new int[row][col];
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the elements in the array: " + i + ";" + j);
				arr[i][j] = sc.nextInt();
			}
		}

	}

	public void displayData() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
	}

	public int[] sumRowWise() {
		int[] sum = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
		}
		return sum;
	}

	public int[] sumColWise() {
		int[] sum = new int[arr[0].length];
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum[i] += arr[j][i];
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
		int cols = this.arr[0].length;

		if (rows != other.arr.length || cols != other.arr[0].length) {
			System.out.println("Matrices must have the same dimensions for substraction");
			return null;
		}
		int[][] resultData1 = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				resultData1[i][j] = this.arr[i][j] - other.arr[i][j];
			}
		}
		return new My2DArray(resultData1);
	}

	public int[][] rowRotation(boolean flag, int num) {
		if (flag) {// Rotate row upwards
			for (int i = 0; i < num; i++) {
				int[] temp = new int[arr.length];
				temp = arr[0];
				for (int k = 0; k < arr[i].length; k++) {
					arr[k] = arr[k + 1];
				}
				arr[arr.length - 1] = temp;
			}
			return arr;
		} else {// row rotation downwards
			for (int i = 0; i < num; i++) {
				int[] temp = new int[arr.length];
				temp = arr[arr.length - 1];
				for (int k = arr.length - 1; k > 0; k--) {
					arr[k] = arr[k - 1];
				}
				arr[0] = temp;
			}
			return arr;

		}

	}

	public int[][] colRotation(boolean flag, int num) {
		if (flag) {
			for (int cnt = 0; cnt < num; cnt++) {
				int[] temp = new int[arr.length];
				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i][arr[0].length - 1];
				}
				for (int i = 0; i < arr.length; i++) {
					for (int j = arr[0].length - 2; j >= 0; j--) {
						arr[i][j + 1] = arr[i][j];
					}

				}
				for (int i = 0; i < arr.length; i++) {
					arr[i][0] = temp[i];
				}
			}
		} else {
			for (int cnt = 0; cnt < num; cnt++) {

				int[] temp = new int[arr.length];
				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i][0];
				}
				for (int i = 0; i < arr.length; i++) {
					for (int j = 1; j < arr[0].length; j++) {
						arr[i][j - 1] = arr[i][j];
					}
				}
				for (int i = 0; i < arr.length; i++) {
					arr[i][arr[0].length - 1] = temp[i];
				}

			}

		}
		return arr;
	}
	public int [][]transpose(){
		int temp[][]=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i][j]=arr[j][i];
			}
		}
		
		return temp;
	}
	
	public boolean isSymmetric() {
		if(arr.length==arr[0].length) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					if(arr[i][j]!=arr[j][i]) {
						return false;
					}
					
				}
			}
			return true;
		}
		return false;
	}
	
	public boolean isIdentity() {
		if(arr.length==arr[0].length) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					if(i==j && arr[i][j]!=1) {
						return false;
					}
					else if(i!=j && arr[i][j]!=0) {
						return false;
					}
					
				}
			}
			return true;
		}
		return false;
	}
	
	

	public static void displayArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
