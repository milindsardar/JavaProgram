
public class ChildClass extends ParentConstructor {

	public ChildClass(int i)
	{
		System.out.println("ChildClass constructor");
	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass(10);
	
	}
	
}
/*Inheritance with respect to constructor: 
1. Child class Constructor by default call its parent class constructor. 
2. Constructor does not follow inheritance example: */ 