package com.demo.test;

import java.util.Scanner;

public class TestAdjescencyMatrix {

	private static void displayMatrix(int[][] myGraph) {
		// TODO Auto-generated method stub
		for(int i=0;i<myGraph.length;i++) {
			for(int j=0;j<myGraph[0].length;j++)
			{
				System.out.print(myGraph[i][j] +" ");
			}
			System.out.println();
		}
	}
	private static void storeMyGraph(int[][] myGraph) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<myGraph.length;i++) {
			for(int j=0;j<myGraph[0].length;j++)
			{
				System.out.println("Is there a edge between "+i+"------------->"+j);
				myGraph[i][j]=sc.nextInt();
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int v= sc.nextInt();
		int [][] myGraph=new int[v][v];
		
		storeMyGraph(myGraph);
		displayMatrix(myGraph);
	}



}
