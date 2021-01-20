package coding;

public class Reverse_Vowel {
	 boolean isvowel(char c)
	{
		return c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U';
			
	}
	
	static String reverse(String s)
	{ String str="";
		int j=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(isvowel(arr[i]))
			{
				j++;
				str=str+arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(isvowel(arr[i]))
			{
				arr[i]=str.charAt(--j);
				
				
			}
		}
		return String.valueOf(arr);
	}
	public static void main(String[] args) {
		String s="Hello world";
		System.out.println(reverse(s));
	}

}

Output: Hollo werld
