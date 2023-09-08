package com.jsp.oparaters;

public class monthstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=8;
		String monthstring;
		switch(month) {
			case 1:
			monthstring="january";
			break;
			case 2:
				monthstring="feb";
				break;
			case 3:
				monthstring="march";
				break;
			case 4:
				monthstring="aprl";
				break;
			case 5 :
				monthstring="may";
				break;
			case 6 :
				monthstring="jun";
				break;
			case 7:
				monthstring="aug";
				break;
			case 8:
				monthstring="sept";
				break;
			case 9:
				monthstring="oct";
				break;
			case 10 :
				monthstring="nav";
				break;
			case 11:
				monthstring="dec";
				break;
				default:
					monthstring="INVELDE MONTH";
					System.out.println(monthstring);
				
				
		}

	}

}
