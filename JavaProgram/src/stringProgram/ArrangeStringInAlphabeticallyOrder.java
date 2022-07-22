package stringProgram;

public class ArrangeStringInAlphabeticallyOrder {

	public static void main(String[] a) {
	String []str= {"amit","rahul","amar","milind"};
	for(int i=0;i<str.length;i++)
	{
		for(int j=i+1;j<str.length;j++)
		{
			if(str[i].compareTo(str[j])>0)//>0 A to Z arrange AND <0 Z to A arrange
			{
				String temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
			
		}
		
	}for(int i=0;i<str.length;i++)
	{
		System.out.print(str[i]+" ");
	}

	}

}
