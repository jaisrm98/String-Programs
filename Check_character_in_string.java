package coding;
import java.util.*;
public class Check_character_in_string {

	public static void main(String[] args) {
		char ch='j';
		String str="jai";
		int k=0;
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(ch==arr[i])
				k=1;
			break;
		}
		if(k==1)
		System.out.println("true");
		else
			System.out.println("false");
		
		
		
	}

}
Input: j
       jai
     
OUTPUT: true
