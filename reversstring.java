package reversestring;

public class reversstring {

	public static void main(String[] args) {
		String str = "hello world";
	char [] chArr = str.toCharArray();
	for(int i=chArr.length-1;i>=0;i--) {
		System.out.print(chArr[i]);
		
	}
	System.out.println(" ");

	}

}
