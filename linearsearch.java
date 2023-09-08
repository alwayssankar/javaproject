package com.jsp.linearsearch;

public class linearsearch {
	static int search (int[] a, int s) {
		for(int i=0;i<=a.length; i++) {
			if(a[i]==s)return i;
			}
		return-1;
		
	}

	public static void main(String[] args) {
		// TODO Aut,o-generated method stub
		int []a = {4,8,1,3,9};
		System.out.println(search(a,9));
		System.out.println(search(a,2));
		

	}

}
