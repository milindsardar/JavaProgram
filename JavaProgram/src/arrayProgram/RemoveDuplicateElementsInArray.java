package arrayProgram;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
int a[]= {1,2,4,3,5,2,1,4};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if (a[i]==a[j]&& i!=j)
{
System.out.println("Duplicate Elements is "+a[i]);	
}
}
}

		
	}

}
