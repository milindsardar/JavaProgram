package arrayProgram;

public class KthlargestNumInArray {
public static void main(String[] args) {
	int [] a= {2,3,1,5,4,6};
	int k=1;//k th largest element;
	for(int i=0;i<a.length;i++) {
	
		for(int j=i+1;j<a.length;j++) {
			if(a[j]>a[i]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}	
		}

if(i==k-1)
	System.out.println(a[i]);

}
}	
	
}
