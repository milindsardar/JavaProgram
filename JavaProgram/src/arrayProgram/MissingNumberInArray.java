package arrayProgram;

public class MissingNumberInArray {

	public static void main(String[] args) {
int a[]= {1,2,3,4,6};
int expected_num=a.length+1;
int total_sum=expected_num*(expected_num+1)/2;
int sum=0;
for(int i=0;i<a.length;i++) {
	sum=sum+a[i];
		
	}
	System.out.println("missing number is "+(total_sum-sum));
	
}
		
	}


