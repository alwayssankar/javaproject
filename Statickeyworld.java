package com.jsp.Arry;

public class Statickeyworld {
	String name;
	int age;
	String address;
	public void student  (String name , int aage , String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

class main {
	

	public static void main(String[] args) {
		Studenr sankar = new Student (1,"sankar",22,"nellore");
		System.out.println(sankar.equle(sankar));
	}
		
		
		// TODO Auto-generated method stub

	}

}

