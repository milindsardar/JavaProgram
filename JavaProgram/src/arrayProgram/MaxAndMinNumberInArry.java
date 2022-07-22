package arrayProgram;

public class MaxAndMinNumberInArry {
public static void main(String[] args) {
	int [] a= {2,3,1,5,4,6};
	int max=a[0];
	int min=a[0];
	for(int i=1;i<a.length;i++) {
			if (max<a[i]) {
				max=a[i];
				
			}else if(min>a[i]) {
				min=a[i];
			}
			
		}
	System.out.println(max);
	System.out.println(min);
		
	}
}

