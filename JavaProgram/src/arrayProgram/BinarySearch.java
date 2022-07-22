package arrayProgram;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a= {1,2,4,6,7,9,12,15,18,21,25};// for Binary Search array must be sort in order
		int srch=4;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
	while(li<=hi) {	
		if(a[mi]==srch) {
			System.out.println(srch+" is at "+mi+"th index position");
			break;
		}
		else if(srch>a[mi])
		{
			li=mi+1;
		}else
		{
			hi=mi-1;
		}
mi=(li+hi)/2;
	}
	if(li>hi) {
		System.out.println(srch+" is not found");
	}

}}
