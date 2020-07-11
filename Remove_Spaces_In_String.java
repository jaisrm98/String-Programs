package coding;
 import java.util.*;
public class Remove_Spaces_In_String {

	public static void main(String[] args) {
		String a;
		String k="";
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		a=sc.nextLine();
		
		 k=a.replaceAll(" ","");
		 System.out.println(k);
		}
		
	}
}
