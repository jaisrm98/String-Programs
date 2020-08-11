package coding;
import java.util.*;
public class Sort_String {

	public static void main(String[] args) {
		 String str;
		 Scanner sc=new Scanner(System.in);
		 str=sc.nextLine();
		 char arr[]=str.toCharArray();
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++)
			 System.out.print(arr[i]);
		 
	}

}
