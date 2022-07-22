package stringProgram;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		String s="abcabcabc";
		String temp="";
		for(int i=0;i<s.length();i++) 
		{
			char c=s.charAt(i);
			if(temp.indexOf(c)==-1)//indexOf() method returns the position of the first occurence of 
									//	specified character in a string.	
				{
				temp=temp+s.charAt(i);
			}
		}
		System.out.println(temp);
	}

}
