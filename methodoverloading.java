package com.jsp.Arry;

public class methodoverloading {
	public int multipley(int x, int y) 
	{
		return(x*y);
	}
	public int multiplay(int x,int y, int z)
	{
		return(x*y*z);
	}
	public double multipley(double x , double y)
	{
		return(x*y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading demo = new methodoverloading();
		System.out.println(demo.multipley(10,20));
		System.out.println(demo.multiplay(10,20,30));
		System.out.println(demo.multipley(10.5,25.4));
		
		
		

	}

}
