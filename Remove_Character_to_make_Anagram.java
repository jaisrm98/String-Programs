package coding;

import java.util.*;

class Remove_Character_to_make_Anagram {

public static void main(String args[] ) throws Exception {

Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
String a;
String b;
while(t-->0) {
a=sc.nextLine().toLowerCase();
b=sc.nextLine().toLowerCase();
for(int i=0;i<a.length();i++)
{
	char s=a.charAt(i);
	String str=Character.toString(s);
	if(b.contains(str))
	{
		a=a.replaceFirst(str, "");
		b=b.replaceFirst(str, "");
		i--;
	}
}
	
	int sum=a.length()+b.length();
	System.out.println(sum);
	
	
	
}
}
}