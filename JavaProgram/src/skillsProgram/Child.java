package skillsProgram;

public class Child extends Parent {// IS A relationship(inheritance)
	public  void m1()
	{
		System.out.println("ms");
	}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.m1();//child method and HAS A relationship
		
		Parent obj1=new Parent();
		obj1.m1();//parent method
		
		Parent obj3=new Child();
		obj3.m1();//parent method
		
	}

}
