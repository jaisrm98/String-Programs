package coding;

import java.util.*;

 class Sort_String_AccordingTo_Length {
	
		public static void main(String[] args) {
			String str;
			
			Scanner sc=new Scanner(System.in);
			str=sc.nextLine();
			
			String arr[]=str.split(" ");
			
			
			Arrays.sort(arr, Comparator.comparingInt(String::length));
			// for reversing --> Arrays.sort(arr, Comparator.comparingInt(String::length).reversed());
			for(int i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]+" ");
			

	}

}
}