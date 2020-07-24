package coding;
import java.util.*;
public class Capital_First_Word {
	public static void main(String[] args) {
		String str;
		String k="";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String arr[]=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1);
			k=k+arr[i];
			k=k+" ";
			
		}
		System.out.println(k.trim());
		
		
		}
			
		}
	 
	
Input: jai singh
Output: Jai Singh

