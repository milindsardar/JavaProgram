package stringProgram;

public class CountCharacter {

	public static void main(String[] args) {
		String s="aabbbcccc";
		for(int i=0;i<s.length();i++) 
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}

	}}
}
