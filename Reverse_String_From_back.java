package coding;
import java.util.*;
public class Reverse_String_From_back {

	public static void main(String[] args) {
		String str="jai singh";
		String arr[]=str.split(" ");
		ArrayList<String> list=new ArrayList<String>();
		for(int i=arr.length-1;i>=0;i--)
		{
			list.add(arr[i]);
		}
		int s=list.size();
		arr=list.toArray(arr);
		for(int i=0;i<s;i++)
			System.out.print(arr[i]+" ");

	}

}
