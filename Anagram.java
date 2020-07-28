package coding;
import java.util.*;
public class Anagram {

	 public static String anagram(String n,String m)
	 {
		 char arr[]=n.toLowerCase().toCharArray();
		 char arr1[]=m.toLowerCase().toCharArray();
		 
		 Arrays.sort(arr);
		 Arrays.sort(arr1);
		 if(Arrays.equals(arr,arr1))
		 {
			 return "anagram";}
			 else {
				 return "not anagram";
		 }
		 
	 }
	public static void main(String[] args) {
		String a;
		String b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		b=sc.nextLine();
		String output=anagram(a,b);
		System.out.println(output);

	}

}
