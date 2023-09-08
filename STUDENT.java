package STUDENTDATA;

public class STUDENT {
	String  name;
	int age;
	String add;
	public STUDENT(String name, int age, String add){
		this.name = name;
		this.age= age;
		this.add=add;
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


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString(){
		return("student name is " + this.getName() + "student agg is "+ this.getAge() + "student add is " + this.getAdd());
		}
public static void main(String[] args) {
	STUDENT sankar = new STUDENT("sankar" , 22, "thurumalapudi");
	System.out.println(sankar.toString());
	
	
		

	}

}
