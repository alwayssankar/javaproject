package com.jsp.Arry;

import java.util.ArrayList;
import java.util.List;

public class ARRAYLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> Arraylist = new ArrayList<Integer>(10);
		for(int i=0; i<5; i++) {
			Arraylist.add(5);
			System.out.println(Arraylist);
		}
		Arraylist.remove(2);
		System.out.println(Arraylist);
		
		
		for(int i=0; i<Arraylist.size(); i++) {
			System.out.println(Arraylist.get(i) + " ");
		}
		
	

	}

}
