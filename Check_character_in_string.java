package coding;
import java.util.*;
public class Check_character_in_string {

	public static void main(String[] args) {
		boolean k=false;
		char ch='m';
		String str="jai";
		for(int i=0;i<str.length();i++)
		{ if(str.charAt(i)==ch)
			k=true;}
			if(k==true)
			System.out.println("true");
		
		else
		
			System.out.println("false");
		
		
	}

}
