package arrayProgram;

public class SecondSmallestOddInArray {

	public static void main(String[] args) {
		int arr1[]= {1,4,3,3,5,6,13,11};
		int size=arr1.length;
		int arr2[]=new int[size];
		for(int i=0;i<size;i++)
		{
			if(arr1[i]%2!=0)
			{
				 arr2[i]=arr1[i];
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr2[j]<arr2[i])
				{
					int temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		System.out.println(arr2[1]);
	}
	}


