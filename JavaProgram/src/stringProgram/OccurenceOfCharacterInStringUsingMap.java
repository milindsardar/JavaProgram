package stringProgram;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacterInStringUsingMap {

	public static void main(String[] args) {
		String str="aaadfjjjfdfjdkalklfuwiiieuw";
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) 
		{
			char c=str.charAt(i);
			if(!hm.containsKey(c))
			{
				hm.put(c, 1);
			}else {
				hm.put(c,hm.get(c)+1);
			}
			
		}
		System.out.println(hm);

	}

}
