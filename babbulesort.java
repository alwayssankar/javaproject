package com.jsp.babbulesort;

public class babbulesort {

	public static void sort(int []a) {
		// TODO Auto-generated method stub
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j+1]=a[j];
					a[j+1]=temp;
				}
			}
			
		}

	}
	public static void main(String[] args) {
		int [] a = {4,7,9,1,5,7,8,2};
		sort(a);
		for(int n:a) {
			System.out.println(n);
		}
	}

}
