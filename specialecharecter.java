package Stringconcept;

public class specialecharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java@#$^s$tar";
		String plainstr = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plainstr);

	}

}
