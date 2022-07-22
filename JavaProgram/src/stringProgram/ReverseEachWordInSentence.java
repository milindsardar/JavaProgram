package stringProgram;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {
String str="welcome to school";
String[] splitValue=str.split(" ");
String rev="";
for(int i=0;i<splitValue.length;i++)
{
String temp=splitValue[i]+" ";
//System.out.print(temp);
for(int j=temp.length()-1;j>=0;j--)
{
rev=rev+temp.charAt(j);	
}
}
System.out.print(rev);

}
	}

