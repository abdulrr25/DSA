package com.demo.test;

import java.util.Scanner;

import com.demo.lists.MyGraph;

public class TestAdjacencyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Vertices are present");
		int v = sc.nextInt();
		MyGraph g = new MyGraph(v);
		StoreGraph(g,v);
		g.printGraph();
	}

	private static void StoreGraph(MyGraph g, int v) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.println("Is there Any edge Between "+i+"====>"+j);
				int val =sc.nextInt();
				if(val>0) {
					g.addEdge(i, val);
				}
			}
		}
		
	}

}
