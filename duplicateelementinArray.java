package com.jsp.duplicateelementinArray;

public class duplicateelementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,54,5,7,5,1,4,5,9};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);

	}
			}
		}

	}

}
