package practise;

public class PrintPrimeBetween1to10 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10;i++)
		{

			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0 )
				{
					count=count+1;				
				}
				
			}
			if(count==0 ) {
				System.out.println(i+" is prime number");

			}else
			{
				count=0; 
			}
		}
		
		
		}
	}


