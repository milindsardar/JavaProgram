package arrayProgram;

public class SortEvenAndOddNumberInArray {

	public static void main(String[] args) {
	int []a= {1,2,3,4,5,6};//output:{2,4,6,1,3,5}
	int newArray[]=new int[6];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			newArray[i]=a[i];
			System.out.print(newArray[i]+" ");
			
		}
		
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			newArray[i]=a[i];
			System.out.print(newArray[i]+" ");
			
		}

	}

}}
