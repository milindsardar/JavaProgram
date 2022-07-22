package stringProgram;

public class CountEachCharacterInstring {

	public static void main(String[] args) {
		String a="Laxman";
		
		for(int i=0;i<a.length();i++)
		{
			int count=1;
		
			
				for(int j=0;j<a.length();j++)
				{
					if(a.charAt(i)==a.charAt(j)&& i!=j)
					{
						count++;
						
					}
				}
			
			System.out.println("occurences of "+a.charAt(i)+" is "+count);
		
	
	}}}

