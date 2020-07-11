package coding;
import java.util.*;
public class Count_vowels {

	public static void main(String[] args) {
		String str="jaisingh";
		int c=0,v=0;
		str=str.toLowerCase();
				for(int i=0;i<str.length();i++)

	{ if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
		v++;
	}
	else if(str.charAt(i)>'a'&&str.charAt(i)<'z')
	{
			c++;		
					
	}
	}
			System.out.println("vowels are "+v);
			System.out.println("consonents are "+c);
	}
}
