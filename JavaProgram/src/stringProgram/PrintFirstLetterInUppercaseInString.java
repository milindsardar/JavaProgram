package stringProgram;

public class PrintFirstLetterInUppercaseInString {

	public static void main(String[] args) {
		String str="welcome to school";// Output:Welcome To School
		String[] splitValue=str.split(" ");
		for(int i=0;i<splitValue.length;i++)
		{
			String temp=splitValue[i]+" ";
			String upper=temp.toUpperCase().substring(0,1);
			String remain=temp.substring(1);
			System.out.print(upper+remain);

		}
		
	}

}
