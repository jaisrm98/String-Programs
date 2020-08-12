package coding;
import java.util.*;
public class Sort_word_InString {

	public static void main(String[] args) {
		String str;
		
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		String arr[]=str.split(" ");
		
		
		Arrays.sort(arr);;
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
	}

}

Input: Dog is animal
Output:animal dog is     // sortting alphabetically
