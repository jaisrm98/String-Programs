package coding;
import java.util.*;
public class Capital_First_Word {
	public static void main(String[] args) {
		String s="jai singh";
		String arr[]=s.split(" ");
		String k="";
		for(int i=0;i<arr.length;i++)
		{
			k=k+arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ";
		}
		System.out.println(k);
	}
			
		}
	 
	
Input: jai singh
Output: Jai Singh

