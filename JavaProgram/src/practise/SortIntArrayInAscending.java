package practise;

public class SortIntArrayInAscending {

	public static void main(String[] args) {
	int[]a= {1,4,5,0,6,3,2};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print(a[i]);
	}
}}
