package coding;
import java.util.*;
public class Remove_given_word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String arr[]=str.split(" ");
	ArrayList<String> list=new ArrayList<String>();
	for(int i=0;i<arr.length;i++)
	{
		list.add(arr[i]);
	}
	System.out.println("enter word to remove");
	String k=sc.nextLine();
	list.remove(k);
	int s=list.size();
	arr=list.toArray(arr);
	for(int i=0;i<s;i++)
	System.out.println(arr[i]+ " ");
	}

}

Input: Jai ss Singh
           ss
Output: Jai Singh
