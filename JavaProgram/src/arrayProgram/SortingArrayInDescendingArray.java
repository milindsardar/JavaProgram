package arrayProgram;

public class SortingArrayInDescendingArray {

	public static void main(String[] args) {
		int [] a= {1,3,2,5,4,6};
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]<a[j])//sorting in descending array
		{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;

		}
		}
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");	
		}
			}

		
	}


