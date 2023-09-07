package com.jsp.Arry;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String>list = new LinkedList <String>();
		//adding element to linkedlist ;
		list.addFirst("A");
		System.out.println(list);
		list.addLast("B");
		System.out.println(list);
		list.add("c");
		System.out.println(list);
		//removing element to linkedlist
		list.remove("A");
		System.out.println(list);
		list.remove("c");
		System.out.println(list);

	}

}
