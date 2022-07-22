package practise;

public class FindMissingNumInArray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,6};
		int expected_num=arr.length+1;
		int expected_total_sum=(expected_num*(expected_num+1))/2;
		int total_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			total_sum=total_sum+arr[i];
		}
		System.out.println("missing number is "+(expected_total_sum-total_sum));
		
	}

}
