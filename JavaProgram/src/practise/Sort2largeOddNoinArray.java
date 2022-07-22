package practise;

public class Sort2largeOddNoinArray {

	public static void main(String[] args) {
int []arr1= {1,2,9,4,7,11,13,14};
int []arr2=new int[arr1.length];
for(int i=0;i<arr1.length;i++)
{
if(arr1[i]%2!=0)
{
	int temp=arr1[i];
	arr2[i]=temp;
}}
for(int j=0;j<arr2.length;j++)
{
for(int k=j+1;k<arr2.length;k++)
{
if(arr2[k]>arr2[j])
{
int temp=arr2[j];
arr2[j]=arr2[k];
arr2[k]=temp;
}
}
}
System.out.println(arr2[1]);

	}

}
