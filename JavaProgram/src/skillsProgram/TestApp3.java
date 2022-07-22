package skillsProgram;

public class TestApp3 {

	public static void main(String[] args) {
		class Tutorial{
			public String name;
			public Tutorial(String tutorial) {
		name=tutorial;		
			}
		}
		Object obj=new Tutorial("Java Quize ");
		Tutorial tutorial=(Tutorial)obj;
		System.out.println(tutorial.name);

	}

}
