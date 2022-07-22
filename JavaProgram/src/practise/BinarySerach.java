package practise;

public class BinarySerach {

	public static void main(String[] args) {
		int[]a= {1,4,5,0,6,3,2};
		int srch=6;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(a[mi]<=srch)
		{
			if(a[mi]==srch) 
			{
				System.out.print(srch +" is at "+mi+"th index position");
				break;
			}
			else if(mi>srch)
			{
			hi=mi;	
			}else
			{
				li=mi;
			}
			mi=(li+hi)/2;
		}

	}

}
