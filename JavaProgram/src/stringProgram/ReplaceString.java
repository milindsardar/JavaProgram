package stringProgram;

public class ReplaceString {
//Replace a/an in the String
	public static void main(String[] args) {
	String s="mangesh is a very person in an environment";
	//output:mgesh is very person in environment
	String strNew="";
	int i=0;
	while(i<s.length())
	{
		if(s.charAt(i)=='a' && s.charAt(i+1)=='n')
		{
			i=i+2;//i+=2;
		}else if(s.charAt(i)=='a')
		{
			i++;
		}else {
			strNew=strNew+s.charAt(i);
			i++;
		}
	}
	System.out.println(strNew);

	}

}
