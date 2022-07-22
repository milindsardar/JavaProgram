package arrayProgram;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrangeArrayElementinAscendingRemoveDuplicate {

	public static void main(String[] args) {
		int [] num= {1,2,4,4,3,3,8,7};
		for(int i=0;i<num.length;i++)
		{
			int count=1;
			for(int j=i+1;j<num.length;j++)
			{
				if (num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					count++;
					}
			}
		if(count<=2 && num[i]!=num[i+1] ) {
			System.out.print(num[i]);
		}
		
		}}
		
		
		}
