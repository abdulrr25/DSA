package com.demo.search;

public class Searching {
	public static int binarySearchNonRec(int[] arr,int search) {
		int low=0;
		int high=arr.length-1;
		int cnt=0;
		while(low<=high) {
			int mid=(low+high)/2;
			cnt++;
			if(arr[mid]==search) {
				System.out.println(cnt);
				return mid;
			}
			if(search<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			System.out.println(cnt);
		}
		return -1;
	}
	
	public static int findString(String[] arr2, String x) {
		int low=0;
		int high=arr2.length-1;
		int cnt=0;
		while(low<=high) {
			int mid=(low+high)/2;
			cnt++;
			
			if(arr2[mid].equals(x)) {
				System.out.println(cnt);
				return mid;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
			}
			if (x.compareTo(arr2[mid]) < 0) {
			    high = mid - 1;
			} else { 
			    low = mid + 1;
			}
			System.out.println(cnt);
		}
		return -1;
			
		
	}

	public static int binarySearchRec(int[] arr1, int search,int low, int high) {
		System.out.println("Binary Search Called" +low+"----"+high);
		if(low<=high) {
			int mid=(low+high)/2;
			if(arr1[mid]==search) {
				return mid;
			}
			else if(search<arr1[mid]) {
				return binarySearchRec(arr1,search,low,mid-1);
			}
			else {
				return binarySearchRec(arr1,search,mid+1,high);
			}
		}
		return -1;
	}

}
