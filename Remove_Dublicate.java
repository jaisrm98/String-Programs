package coding;
import java.util.*;
public class Remove_Dublicate {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String arr[]=str.split(" ");
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<arr.length;i++)
		{
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
				
			}
				
		}
		int s=list.size();
		arr=list.toArray(arr);
		for(int i=0;i<s;i++)
			System.out.print(arr[i]+" ");
	}

}
