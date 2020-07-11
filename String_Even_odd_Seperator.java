package coding;
import java.util.*;
public class String_Even_odd_Seperator {

		public static void main(String[] args) 
	{
	        int t,i;
	        
	        Scanner scan=new Scanner(System.in);
	        System.out.println("enter test cases");
	        t=scan.nextInt();
	        for(int j=1;j<=t;j++)
	    {
	        	 String a="";
		           String b="";
	        String s;
	        System.out.println("enter string");
	        s=scan.next();
	        for( i=0;i<s.length();i++)
	        { 
	        	if((i%2==0))
	        	{
	        		a=a+s.charAt(i);
	        	}
	        	else 
	        	{
	        		b=b+s.charAt(i);
	        	}
	        }
	        System.out.println(a+" "+b);

	    }
	}

}
