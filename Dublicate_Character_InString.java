package coding;

public class Dublicate_Character_InString {

	public static void main(String[] args) {
		String s="jai jas";
		char arr[]=s.toCharArray();
		int c=0;
		for(int i=0;i<arr.length;i++)
		{c=1;
			for(int j=i+1;j<arr.length;j++)
			{  
				if(arr[i]==arr[j])
				{
					c++;
					arr[j]='0';
				}
			}
			if(arr[i]!='0' && c>1)
				System.out.print(arr[i]=" ");
		}
	}

}

Output: j a
