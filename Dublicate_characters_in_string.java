package coding;

public class Dublicate_characters_in_string {

	public static void main(String[] args) {
		String str="jaijaisingh";
		
		for(int i=0;i<str.length();i++)
{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)) {
					System.out.print(str.charAt(i)+" ");
				                                  }
			}
	
}
		
	}

}
