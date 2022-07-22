package arrayProgram;

import java.util.HashSet;

public class DuplicateElementsByHashSet {

	public static void main(String[] args) {
		int a[]= {1,2,4,3,5,2,1,4};
		HashSet hs= new HashSet();
for(int no:a)//each for loop
{
if(hs.add(no)==false)
{
	System.out.println("Duplicate Elements is "+no);	

}
}
	}

}
