package coding;
import java.util.*;
public class Remove_Dublicate_word_In_String {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String arr[]=str.split(" ");
		HashSet<String> set=new HashSet<String>(Arrays.asList(arr));
		int n=set.size();
		arr=set.toArray(arr);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");

	}

}
