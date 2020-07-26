package coding;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Given_character {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char[]arr=str.toCharArray();
	ArrayList<Character> list=new ArrayList<Character>();
	for(int i=0;i<arr.length;i++)
	{
		list.add(arr[i]);
	}

	System.out.println("enter Character to remove");
	Character k=sc.next().charAt(0);
	
	list.remove(k);
	
	int s=list.size();
	
	for(int i=0;i<s;i++)
	System.out.print(list.get(i));
}
}