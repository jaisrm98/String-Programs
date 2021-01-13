package coding;

import java.util.*;

class Remove_Character_to_make_Anagram {

public static void main(String args[] ) throws Exception {

		String a="bc";
		String b="gcd";
		int na=a.length();
		int nb=b.length();
		for(int i=0;i<b.length();i++)
		{
			String str=Character.toString(b.charAt(i));
			if(a.contains(str))
			{
				na--;
				nb--;
			}
		}
		System.out.println("Total words removed to make strings anagram are "+(na+nb));
	
	
	
}
}
}

Input: bc
       gcd
Output: 3
