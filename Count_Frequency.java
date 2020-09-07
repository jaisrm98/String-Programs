package coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Count_Frequency {

	public static void main(String[] args) {
		String str="abbbccdd";
		HashMap<Character, Integer>count=new HashMap<Character,Integer>();
		ArrayList<Character>list=new ArrayList<Character>();
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(!list.contains(arr[i]))
			{
				list.add(arr[i]);
				count.put(arr[i], 1);
			}
			else
			{
				count.put(arr[i],count.get(arr[i])+1);
			}
		}
		for (Map.Entry entry : count.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", frequency = " + entry.getValue());
		int max =0;
		int key=0;
		for(Character k:count.keySet())
		{
			if(count.get(k)>max) {
				max=count.get(k);
						key=k;
		}
	}
		System.out.println((char)key+" is"+ max);
	}
}

Output:Key =    a, frequency = 1
		Key = b, frequency = 3
		Key = c, frequency = 2
		Key = d, frequency = 2
		b is having max value 3

