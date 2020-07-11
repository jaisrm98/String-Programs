package coding;
import java.util.*;
public class Dublicate_words_in_string {

	public static void main(String[] args) {
		
		String str="jai is here jai is";
		String k[]=str.split(" ");
		//System.out.println(k.length);
		for(int i=0;i<k.length;i++)
		{
			for(int j=i+1;j<k.length;j++) 
			{ 
				if(k[j].equals(k[i]))
				{
					System.out.println(k[i]);
				}
			}
		}
		
		

}

}
