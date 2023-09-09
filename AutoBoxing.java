package COM.JSP.JDBC;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=10;
//AUTO BOXING
Integer iobj=Integer.valueOf( i);
System.out.println("value of integer: "+ iobj);
//AUTO-UNBOXING
	int i1=iobj;
System.out.println("value of i1: "+ iobj);

//Auto box
char x = 'a';
Character charobj = Character.valueOf(x);
System.out.println("charecter of integer: "+ charobj);
System.out.println("charecter of x:"+charobj);
	}

}
