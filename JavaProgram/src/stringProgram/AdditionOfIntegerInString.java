package stringProgram;

public class AdditionOfIntegerInString {

	public static void main(String[] args) {
String str="mi1i25n6d2";
int sum=0;
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)>='0' && str.charAt(i)<='9')
	{
	int b=Integer.parseInt(String.valueOf(str.charAt(i)));
	sum=sum+b;
	}
	
}
System.out.println(sum);
	}

}
