package stringProgram;

public class RemoveIntegerFromString {

	public static void main(String[] args) {
String str="mi2li4n3d";
String temp="";
for(int i=0;i<str.length();i++)
{
if ((Character.isAlphabetic(str.charAt(i))))
{
temp=temp+str.charAt(i);	
}

}
System.out.println(temp);
	}

}
