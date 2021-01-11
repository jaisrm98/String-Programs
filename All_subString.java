package coding;
import java.util.*;
public class All_subString {

	public static void main(String[] args) {
		String str="funksfundSfun";
		String find="fun";
		String s="";
		int l=str.length();
		ArrayList<String>list=new ArrayList<String>();
		 for (int i = 0; i < l; i++)
	      {
	         for(int j = i+1; j <= l; j++)
	         {
	            s = str.substring(i, j);
	            if(s.equals(find))
	            	list.add(s);
	            
	         }
	      }
		System.out.println("total times "+list.size());
	}

}

Output: 3
