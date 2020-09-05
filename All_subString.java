package coding;
import java.util.*;
public class All_subString {

	public static void main(String[] args) {
		String str="funksfundfkdfun";
		String find="fun";
		String s="";
		int l=str.length();
		ArrayList<String>list=new ArrayList<String>();
		 for (int i = 0; i < l; i++)
	      {
	         for(int j = 1; j <= l - i; j++)
	         {
	            s = str.substring(i, i+j);
	            if(s.equals(find))
	            	list.add(s);
	            
	         }
	      }
		System.out.println(list.size());
	}

}
