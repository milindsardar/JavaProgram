package stringProgram;

public class OccurenceOfCharacterInString1 {

	public static void main(String[] args) {
		String s="milind";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			System.out.println("Occurence of character "+ch[i]+" is "+count);
		}

	}
	}

