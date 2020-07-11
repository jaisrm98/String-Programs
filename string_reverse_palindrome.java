package sorting;
import java.util.Scanner;
import java.util.Stack;
public class string_reverse_palindrome 
{

	public static void main(String[] args)
{
		
	String str;
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	Stack stack = new Stack();
	for(int i=0;i<str.length();i++)
	{
		stack.push(str.charAt(i));
	}
	String k="";
	while(!stack.isEmpty())
	{
		k=k+stack.pop();
	}
	System.out.println(k);
	if(str.equals(k))
	
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
		
		
		
		
		
		
		
		
		
		
}

}
