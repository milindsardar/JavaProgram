package practise;

public class SortIntArrayInDescendingOrder {

	public static void main(String[] args) {
		int[]a= {1,4,5,0,6,3,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]);
		}
	}
	}


