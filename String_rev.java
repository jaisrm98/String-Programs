package sorting;


	import java.util.Scanner;
	public class String_rev 
	{  
		public static void main(String[] args)
	{
			
		String str;
		String k="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		str=sc.nextLine();
		int j=str.length()-1;
		for(int i=j;i>=0;i--) {
			k=k+(str.charAt(i));
		}
		if(str.equals(k))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println(" not palindrome");
		}
		}
		
}